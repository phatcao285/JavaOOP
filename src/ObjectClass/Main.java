package ObjectClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class VanDongVien {
    private String hoten;
    private int tuoi;
    private String monthidau;
    private double cannang;
    private double chieucao;

    // Hàm khởi tạo không tham số
    public VanDongVien() {
        this.hoten = "";
        this.tuoi = 0;
        this.monthidau = "";
        this.cannang = 0.0;
        this.chieucao = 0.0;
    }

    // Hàm khởi tạo với 5 tham số
    public VanDongVien(String hoten, int tuoi, String monthidau, double cannang, double chieucao) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.monthidau = monthidau;
        this.cannang = cannang;
        this.chieucao = chieucao;
    }

    // Hàm hủy (Java không cần hàm hủy như C++, tự động xử lý bởi Garbage Collector)

    // Nạp chồng toán tử nhập ">>"
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoten = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa
        System.out.print("Nhập môn thi đấu: ");
        monthidau = scanner.nextLine();
        System.out.print("Nhập cân nặng: ");
        cannang = scanner.nextDouble();
        System.out.print("Nhập chiều cao: ");
        chieucao = scanner.nextDouble();
    }

    // Nạp chồng toán tử xuất "<<"
    public void xuat() {
        System.out.printf("Họ tên: %s, Tuổi: %d, Môn thi đấu: %s, Cân nặng: %.1f, Chiều cao: %.1f\n",
                hoten, tuoi, monthidau, cannang, chieucao);
    }

    // Nạp chồng toán tử so sánh ">"
    public boolean lonHon(VanDongVien vdv) {
        if (this.chieucao > vdv.chieucao) {
            return true;
        } else if (this.chieucao == vdv.chieucao) {
            return this.cannang > vdv.cannang;
        } else {
            return false;
        }
    }

    // Getter cho chiều cao và cân nặng để tiện cho việc sắp xếp
    public double getChieucao() {
        return chieucao;
    }

    public double getCannang() {
        return cannang;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo đối tượng p sử dụng hàm thiết lập 5 tham số
        VanDongVien p = new VanDongVien("Nguyen Van A", 25, "Điền kinh", 70.5, 1.75);
        System.out.println("Thông tin vận động viên p:");
        p.xuat();

        // Nhập vào một mảng gồm n vận động viên
        System.out.print("\nNhập số lượng vận động viên: ");
        int n = scanner.nextInt();
        ArrayList<VanDongVien> danhSachVDV = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin vận động viên thứ " + (i + 1) + ":");
            VanDongVien vdv = new VanDongVien();
            vdv.nhap();
            danhSachVDV.add(vdv);
        }

        // Hiển thị danh sách vận động viên đã nhập
        System.out.println("\nDanh sách vận động viên đã nhập:");
        for (VanDongVien vdv : danhSachVDV) {
            vdv.xuat();
        }

        // Sắp xếp danh sách theo chiều cao tăng dần (nếu bằng thì so sánh cân nặng tăng dần)
        Collections.sort(danhSachVDV, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien vdv1, VanDongVien vdv2) {
                if (vdv1.getChieucao() != vdv2.getChieucao()) {
                    return Double.compare(vdv1.getChieucao(), vdv2.getChieucao());
                } else {
                    return Double.compare(vdv1.getCannang(), vdv2.getCannang());
                }
            }
        });

        // Hiển thị danh sách sau khi sắp xếp
        System.out.println("\nDanh sách vận động viên sau khi sắp xếp:");
        for (VanDongVien vdv : danhSachVDV) {
            vdv.xuat();
        }

        scanner.close();
    }
}
