package com.example.soliton.myschool;

import java.util.ArrayList;

/**
 * Created by User on 4/9/2017.
 */

public class MySxoleio {

    ArrayList<Mathitis> mathites;

    public MySxoleio() {
        ArrayList<Mathitis> m=new ArrayList<Mathitis>();

        double [] v1={14,12,10,16};
        Mathitis m1=new Mathitis("Kostas Ioanides",v1);
        m.add(m1);
        double [] v2={10,18,10,18};
        Mathitis m2=new Mathitis("Swkraths Arvanitis",v2);
        m.add(m2);
        double [] v3={11,19,10,18};
        Mathitis m3=new Mathitis("Nikos Bekris",v3);
        m.add(m3);
        double [] v4={14,14,10,18};
        Mathitis m4=new Mathitis("Vaggelis Vaggelis",v4);
        m.add(m4);
        this.mathites=m;

    }

    public  String[] getNames(){

        int n=this.mathites.size();
        String names[]=new String[n];

        for (int i = 0; i < n; i++) {
            names[i]=mathites.get(i).getName();
        }

        return  names;

    }

    public ArrayList<Mathitis> getMathites() {
        return mathites;
    }
}
