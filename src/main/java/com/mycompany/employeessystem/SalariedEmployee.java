/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeessystem;

/**
 *
 * @author ABYUU
 */
public class SalariedEmployee extends Employee implements Displayable 
{
    
    double salary;
    double bouns;
    double deductions;

    public SalariedEmployee() 
    {
        
    }

    public SalariedEmployee(double Salary, double bouns, double deductions, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.salary = Salary;
        this.bouns = bouns;
        this.deductions = deductions;
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double Salary) {
        this.salary = Salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }
    
    @Override
    
    public double earings()
    {
        return (salary + bouns)-deductions;
    }
    
    public void Displayaaldetails()
    {
        System.out.println(super.toString());
        System.out.println(toString());
    }
    
    public void Displayearing()
    {
        System.out.println(earings());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "salary=" + salary + ", bouns=" + bouns + ", deductions=" + deductions + '}';
    }
    
   
}
