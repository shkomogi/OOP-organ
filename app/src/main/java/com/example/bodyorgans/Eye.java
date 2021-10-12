package com.example.bodyorgans;

public class Eye extends Organ {
    private String color;
    private Boolean isClosed;

    //constructor


    public Eye(String name, String medicalCondition, String color, Boolean isClosed) {
        super(name, medicalCondition);
        this.color = color;
        this.isClosed = isClosed;
    }
    //method to open and close eye
    public void openEye(){
        this.isClosed= false;
        System.out.println("Eye is closed");
    }

    public void CloseEye(){
        this.isClosed=true;
        System.out.println("Eye is Open");
    }
    //override getDetails method
    //Ctrl+O

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+this.color);
    }
    //override getter and setter so it must be under the Override word


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }
}
