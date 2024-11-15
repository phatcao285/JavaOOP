package ObjectClass;

import java.util.Scanner;

public class PhanSo {
    private int tuso;
    private int mauso;
    public PhanSo(){
        this.tuso=0;
        this.mauso=1;
    }
    public PhanSo(int tuso,int mauso){
        this.tuso=tuso;
        this.mauso=mauso;
        rutgon();
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tuso=sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        mauso=sc.nextInt();
        rutgon();
    }
    public void xuat(){
        if (mauso==1){
            System.out.println(tuso);
        } else if (mauso==0) {
            System.out.println("Mẫu số không hợp lệ ");
        }else {
            System.out.println(tuso+"/"+mauso);
        }
    }
    public PhanSo cong(PhanSo ps){
        int tu=this .tuso * ps.mauso + ps.tuso *this.mauso;
        int mau= this.mauso* ps.mauso;
        return  new PhanSo(tu,mau);
    }
    public PhanSo tru(PhanSo ps){
        int tu=this .tuso * ps.mauso - ps.tuso *this.mauso;
        int mau= this.mauso* ps.mauso;
        return  new PhanSo(tu,mau);
    }
    public PhanSo nhan(PhanSo ps){
        int tu= this.tuso* ps.tuso;
        int mau= this.mauso*ps.mauso;
        return new PhanSo(tu,mau);
    }
    public PhanSo chia(PhanSo ps){
        int tu= this.tuso* ps.mauso;
        int mau= this.mauso* ps.tuso;
        return new PhanSo(tu,mau);
    }
    public void rutgon(){
        int gcd= gcd(tuso,mauso);
        tuso=tuso/gcd;
        mauso=mauso/gcd;
        if (mauso<0){
            tuso= -tuso;
            mauso= -mauso;
        }

    }
    private int gcd(int a , int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        ps1.nhap();
        System.out.println("Nhập phân số thứ hai:");
        ps2.nhap();

        // Cộng hai phân số
        PhanSo tong = ps1.cong(ps2);
        System.out.print("Tổng hai phân số: ");
        tong.xuat();

        // Trừ hai phân số
        PhanSo hieu = ps1.tru(ps2);
        System.out.print("Hiệu hai phân số: ");
        hieu.xuat();

        // Nhân hai phân số
        PhanSo tich = ps1.nhan(ps2);
        System.out.print("Tích hai phân số: ");
        tich.xuat();

        // Chia hai phân số
        PhanSo thuong = ps1.chia(ps2);
        System.out.print("Thương hai phân số: ");
        thuong.xuat();

        scanner.close();
    }
}
