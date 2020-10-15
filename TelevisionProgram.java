package com.pateu;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgram {

    private String name;
    private int duration;


    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String toString(){
        return "voila: " + this.name + this.duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> televisionPrograms = new ArrayList<>();

        while ( true ){
            System.out.println("enter:  name,duration");
            String nameAndDuration = scanner.nextLine();

            if (nameAndDuration.isEmpty()){
                break;
            }

            String[] separatedData = nameAndDuration.split(",");
            String name = separatedData[0];
            int duration = Integer.valueOf(separatedData[1]);

            televisionPrograms.add(new TelevisionProgram(name, duration));
        }

        Scanner maxLscanner = new Scanner(System.in);
        System.out.println("what is the max length of shows you want to see?");
        int maxLength = Integer.valueOf(maxLscanner.nextLine());

        for ( TelevisionProgram tv : televisionPrograms ) {
            if ( tv.getDuration() <= maxLength ){
                System.out.println(tv);
            }
        }


    }


}
