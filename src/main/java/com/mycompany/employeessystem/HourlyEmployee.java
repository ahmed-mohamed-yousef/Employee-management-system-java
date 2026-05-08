/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeessystem;

/**
 *
 * @author ABYUU
 */
public class HourlyEmployee extends Employee implements Displayable
{
    private double hour_rate;
    private int no_of_hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(double hour_rate, int no_of_hours, String name, String address, int ssn, Gender sex) {
        super(name, address, ssn, sex);
        this.hour_rate = hour_rate;
        this.no_of_hours = no_of_hours;
    }


    
    
    
    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }
    
     
    @Override
     public double earings()
    {
        return no_of_hours*hour_rate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hour_rate=" + hour_rate + ", no_of_hours=" + no_of_hours + '}';
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
