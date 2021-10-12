package com.example.bodyorgans;

public class Patient {
    private String Name;
    private int Age;
    private Eye leftEye; //composition
    private Eye rightEye; //composition
    private Heart heart;
    private Skin skin;
    private Stomach stomach;

    //constructor

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Skin skin, Stomach stomach) {
        Name = name;
        Age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.skin = skin;
        this.stomach = stomach;
    }

    //getters and setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }
}
