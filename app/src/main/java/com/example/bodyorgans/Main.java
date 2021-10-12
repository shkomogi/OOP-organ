package com.example.bodyorgans;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create Patient object
        Patient patient1 = new Patient("Joey",23,
                new Eye("LeftEye","Short-sighted","Blue",false),
                new Eye("Right Eye","Short-Sighted","Blue",false),
                new Heart("Heart","Normal",70),
                new Skin("Skin","Burned","White",40),
                new Stomach("Stomach","Normal",true));

        System.out.println("Patient Name: "+patient1.getName()+"\n"+"Age: "+patient1.getAge());
        //Loop until User decides to Quit Application
        Boolean isFinish = false;
        while (!isFinish){
            System.out.println("Choose an Organ:"+"\n"+"\t"+"1.Left Eye"+"\n"+"\t"+
                    "2. Right Eye"+"\n"+"\t"+"3. Heart"+"\n"+"\t"+"4. Stomach"+"\n"+"\t"+
                       "5.Skin"+"\n"+"\t"+"6.Exit");
            Scanner myscan = new Scanner(System.in);
            int userInput = myscan.nextInt();

            //use switch case
            switch (userInput){
                case 1:
                    patient1.getLeftEye().getDetails();
                    if (patient1.getLeftEye().getClosed()){
                        System.out.println("\t"+"1.Close");
                        if (myscan.nextInt()==1){
                            patient1.getLeftEye().CloseEye();
                        }else{
                            System.out.println("\t"+"1. Open");
                            if (myscan.nextInt()==1){
                                patient1.getLeftEye().openEye();
                            }
                        }
                    } break;

                case 2:
                    patient1.getRightEye().getDetails();
                    if (patient1.getRightEye().getClosed()){
                        System.out.println("\t"+"1.Close");
                        if (myscan.nextInt()==1){
                            patient1.getRightEye().CloseEye();
                        }else{
                            System.out.println("\t"+"1. Open");
                            if (myscan.nextInt()==1){
                                patient1.getRightEye().openEye();
                            }
                        }
                    } break;
                case 3:
                    patient1.getHeart().getDetails();
                    System.out.println("\t"+"1. Change Heart Rate: ");
                    if (myscan.nextInt()==1){
                        //int newRate = 0;
                        System.out.println("Enter new rate:");
                        Scanner newRate = new Scanner(System.in);
                        int newHRate = newRate.nextInt();
                        //patient1.getHeart().changeRate(newHRate);
                        System.out.println("New Heart Rate: "+newHRate);
                    }break;
                case 4:
                    patient1.getStomach().getDetails();
                    System.out.println("\t"+"1.Digest:");
                    if (myscan.nextInt()==1){
                        patient1.getStomach().Digest();
                    }break;
                case 5:
                    patient1.getSkin().getDetails();
                    break;
                case 6:
                    isFinish=true;
                    break;
                default:
                    isFinish=true;
                    break;

            }

        }

    }
}
