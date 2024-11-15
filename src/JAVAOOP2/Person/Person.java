package JAVAOOP2.Person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    public Person(){
        this.name="";
        this.age=0;
        this.gender="";
        this.address="";
        this.phone="";
    }
    public Person(String name, int age, String gender, String address,String phone){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
