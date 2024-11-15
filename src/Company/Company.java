package Company;
import JAVAOOP2.Person.Person;
import ObjectClass.Main;

import java.sql.SQLOutput;

public class Company {
    public void ShowInfoPerson(Person p){
        System.out.println("Name: "+ p.getName());
        System.out.println("Age:" + p.getPhone());
        System.out.println("Gender: "+ p.getGender());
    }

    public static void main(String[] args) {
        Person p1 = new Person("John Doe", 30, "Male", "123 Main St", "123-456-7890");
        Company company = new Company();
        company.ShowInfoPerson(p1);
        Person p2 = new Person("John Marsh", 25, "Male", "123 Road Str", "123-456-7895");
        Company company1 = new Company();
        company1.ShowInfoPerson(p2);
    }
}
