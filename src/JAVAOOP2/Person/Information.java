package JAVAOOP2.Person;

public class Information {
    public void ShowPersonInfo(Person p){
        System.out.println("Name: "+ p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Gender: "+ p.getGender());
        System.out.println("Address: " + p.getAddress());
        System.out.println("Phone: "+ p.getPhone());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Cao Thành Phát",22,"Male","Le Chi Dan st","0817415028");
        Information info= new Information();
        info.ShowPersonInfo(p1);
    }
}
