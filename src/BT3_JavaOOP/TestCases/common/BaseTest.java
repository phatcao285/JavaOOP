package BT3_JavaOOP.TestCases.common;

import java.sql.SQLOutput;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: "+ Constants.browser);
        System.out.println("Report: "+Constants.report);
        System.out.println("Headless: "+ Constants.headless);
    }
    public void closeDriver(){
        System.out.println("Closed Browser:" + Constants.browser);
    }
    public void closeDriver(String browser){
        System.out.println("Closed Browser:" + browser);
    }
}
