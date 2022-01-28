package com;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {
//    Todo add
    Scanner sc = new Scanner(System.in);
        public void addEmployeeToList(List<Employee> employeeList){
            boolean result = false;
            Employee emp = new Employee();
            try {
                System.out.println("Please Enter Emp Id: ");
               int id = Integer.parseInt(sc.nextLine());
                System.out.println("Please Enter Emp Name: ");
                String name = sc.nextLine();
                System.out.println("Please Enter Emp Age: ");
                int age =Integer.parseInt(sc.nextLine());
                System.out.println("Please Enter Emp Dept: ");
                String dept = sc.nextLine();
                emp.setId(id);
                emp.setAge(age);
                emp.setName(name);
                emp.setDept(dept);
                result=true;
            }catch (Exception ex){
                System.out.println("Please Enter Proper Details");
                System.out.println(ex);
            }


    }






//    todo update
//    todo view
//    todo delete

}
