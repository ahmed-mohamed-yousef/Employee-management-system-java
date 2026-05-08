/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeessystem;

/**
 *
 * @author ABYUU
 */
public class EmployeesSystem {

    public static void main(String[] args) {

        Department d1=new Department(1,"Information System");
        
        SalariedEmployee se=new SalariedEmployee(2000, 500, 50, "Ahmed", "Egyption", 1200, Gender.male);
        d1.add_employee(se);
        
        HourlyEmployee he = new HourlyEmployee(100,6,"Mohamed","Egyption",1500,Gender.male);
        d1.add_employee(he);
        
        Commission_Employee ce = new Commission_Employee(15000,0.25,"Ali","Egyption",1200,Gender.male);
        d1.add_employee(ce);
        
        System.out.println(d1.getemployeecount());
        
        d1.print_All_details();
        d1.print_basic_data();
    }
}
