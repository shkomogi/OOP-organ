package com.example.bodyorgans;

public class Stomach extends Organ{
    private Boolean isEmpty;

    //constructor

    public Stomach(String name, String medicalCondition, Boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (isEmpty){
            System.out.println("Time to eat");
        }else{
            System.out.println("Stomach is full");
        }
    }

    //digest method
    public void Digest(){
        System.out.println("Digestion is in progress");
    }

    //getter and setter

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }
}
