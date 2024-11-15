package ObjectClass;

public class Student {
    String name;
    static int age;
    String phone ;

    public String  getName(){
        return name;

    }

    //Xây dựng constructor có tham số
    public Student(){

    }

    //Xây dưnng constructor không có tham số
    public Student(String name, int age) {
        this.name=name;//Dùng"this" để phân biệt trong class và tham số trùng tên
        this.age=age;// Hàm xây dụng sẽ đc gọi khi khởi tạo đối tương class

    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+ age);
        System.out.println("Điện thoại: "+ phone);
    }

    public static void main(String[] args) {
        Student st = new Student("Phòng",25);
        st.getInfo();
        Student st1 = new Student();
        st1.getInfo();
        Student st2 = new Student();
        st2.getInfo();
    }
}

