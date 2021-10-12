package com.example.bodyorgans;

public class Organ {
    private String name;
    private String medicalCondition;

    //constructor

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }
    //new method
    public void getDetails(){
        System.out.println("Name: "+this.name+"\n"+"Medical Condition: "+this.medicalCondition);
    }


    //setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
