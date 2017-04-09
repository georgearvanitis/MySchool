package com.example.soliton.myschool;

/**
 * Created by User on 4/9/2017.
 */

public class Mathitis {

    private  String name;
    private double[] vathmoi;

    public Mathitis(String name, double[] vathmoi) {
        this.name = name;
        this.vathmoi = vathmoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getVathmoi() {
        return vathmoi;
    }

    public void setVathmoi(double[] vathmoi) {
        this.vathmoi = vathmoi;
    }

    public double calculateMO(){
        double mo=0;
        double s=0;
        int n=vathmoi.length;
        for (int i=0;i<n;i++){
            s+= vathmoi[i];
        }
        mo=s/n ;
        return  mo;
    }

}
