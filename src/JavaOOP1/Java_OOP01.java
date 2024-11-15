package JavaOOP1;

class NhanVien {
    private String name;
    private int age;
    private String position;

    // Constructor không tham số
    public NhanVien() {
        this.name = "";
        this.age = 0;
        this.position = "";
    }

    // Constructor có tham số
    public NhanVien(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Getter cho các thuộc tính (nếu cần)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    // Setter cho các thuộc tính (nếu cần)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Hàm getInfo trả về thông tin của nhân viên dưới dạng chuỗi
    public String getInfo() {
        return "Tên: " + name + ", Tuổi: " + age + ", Chức vụ: " + position;
    }
}

public class Java_OOP01 {
    public static void main(String[] args) {
        // Tạo đối tượng NhanVien và kiểm tra hàm getInfo()
        NhanVien nv1 = new NhanVien("Nguyen Van A", 30, "Manager");
        System.out.println(nv1.getInfo());
        NhanVien nv2 = new NhanVien("Nguyễn Văn B",20,"Giám đốc");
        System.out.println(nv2.getInfo());
    }
}
