package com.example.bodyorgans;

public class Heart extends Organ{
    private int rate;

    //constructor

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    //Override getDetails method

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: "+this.rate);
    }
    //new method to change rate
    public void changeRate(){
        this.rate = rate;
        System.out.println("New rate: "+this.rate);

    }


    //getter and setter

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
