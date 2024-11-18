package BT3_JavaOOP.TestCases;

import BT3_JavaOOP.TestCases.common.BaseTest;

public class testCases extends BaseTest {
    public void LoginCRM(){
        createDriver();
        System.out.println("Mo trinh duyet web va nhap URL https://cms.anhtester.com/login");
        System.out.println("Nhap username va password hop le");
        System.out.println("Nhan vao nut \"login\" de thuc hien dang nhap" );
        System.out.println("Da duoc chuyen huong den trang admin CMS");
        closeDriver();
    }
    public void testLogin(){
        createDriver();
        LoginCRM();
        closeDriver();
    }
    public void testAddCategory(){
        createDriver();
        LoginCRM();
        System.out.println("Nhan menu Category den trang list category");
        System.out.println("Nhan add new category");
        System.out.println("Nhap day du thong tin yeu cau cho category");
        System.out.println("Nhan nut save");
        System.out.println("Kiem tra category moi duoc them vao trang list category");
        closeDriver();
    }

    public static void main(String[] args) {
        testCases TestCases= new testCases();
        TestCases.testLogin();
        TestCases.testAddCategory();
    }
}
