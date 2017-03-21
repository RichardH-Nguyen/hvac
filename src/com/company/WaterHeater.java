package com.company;

import java.util.Date;

/**
 * Created by su7163if on 3/15/2017.
 */
//WaterHeater class that uses the ServiceCall super class.
public class WaterHeater extends ServiceCall {
    private static double whFee = 20;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private  String age;

    //Water Heater constructor
    public WaterHeater(String serviceAddress, String problemDescription, Date date, String age){
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    @Override
    public String toString() {

        //These statements use the Java ternary operator
        //This says "if resolvedDate == null, then set resolvedDate to "Unresolved". Otherwise, set resolvedDate to resolvedDate.toString()
        //Same logic as an if-else statment, but more consise if the condition is simple and the if statment's task is
        //to set the value of a variable based on a condition being true or false.
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + whFee);


        return "Central Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;

    }
}
