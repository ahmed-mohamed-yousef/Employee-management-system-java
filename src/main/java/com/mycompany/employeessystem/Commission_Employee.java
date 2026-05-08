/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeessystem;

/**
 *
 * @author ABYUU
 */
public class Commission_Employee extends Employee implements Displayable
{
    private double gross_sales;
    private double commission_rate;

    public Commission_Employee()
    {
        
    }

    public Commission_Employee(double gross_sales, double commission_rate, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    
    
    
    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    
    @Override
    public double earings()
    {
        return gross_sales*commission_rate;
    }

    @Override
    public String toString() {
        return "Commission_Employee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
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
    
}
