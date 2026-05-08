/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeessystem;

/**
 *
 * @author ABYUU
 */
public class BasePlusCommissionEmployee extends Commission_Employee
{
    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
     @Override
    public double earings()
    {
        return base+super.earings();
    }
            
   
     public void Displayaaldetails()
    {
       super.Displayaaldetails();
       Displayearing();
    }
    
    public void Displayearing()
    {
        System.out.println("Earings = "+earings());
    }
            
    
}
