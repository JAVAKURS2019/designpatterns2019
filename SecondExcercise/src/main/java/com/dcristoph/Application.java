package com.dcristoph;

public class Application {

    public static void main(String[] args){
        FirstClass fc = new FirstClass();
        SecondClass sc = new SecondClass();
        ThirdClass tc = new ThirdClass();

        System.out.println(fc.getText());
        System.out.println(fc.getAnotherText());
        System.out.println(sc.getText());
        System.out.println(sc.getAnotherText());
        System.out.println(tc.getText());
        System.out.println(tc.getAnotherText());
    }
}
