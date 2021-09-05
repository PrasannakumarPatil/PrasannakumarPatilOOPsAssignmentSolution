package Driver;

import DepartmentClasses.Admindepartment;
import DepartmentClasses.Hrdepartment;
import DepartmentClasses.Techdepartment;

public class Main {

    public static void main(String [] args){
        Admindepartment admindept = new Admindepartment();
        System.out.print("Welcome to ");
        System.out.println(admindept.departmentName()+"\n"+admindept.getTodaysWork()+"\n"+admindept.getWorkDeadline()+"\n"+admindept.isTodayAHoliday());
        System.out.println();
        Hrdepartment hrdept = new Hrdepartment();
        System.out.print("Welcome to ");
        System.out.println(hrdept.departmentName()+"\n"+hrdept.doActivity()+"\n"+hrdept.getTodaysWork()+"\n"+hrdept.getWorkDeadline()+"\n"+hrdept.isTodayAHoliday());
        System.out.println();
        Techdepartment techdept = new Techdepartment();
        System.out.print("Welcome to ");
        System.out.println(techdept.departmentName()+"\n"+techdept.getTodaysWork()+"\n"+techdept.getWorkDeadline()+"\n"+techdept.getTechStackInformation()+"\n"+techdept.isTodayAHoliday());
    }
}

