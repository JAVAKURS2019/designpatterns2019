package com.dcristoph;

public class Application {
    private Chain root;

    public Application() {
        this.root = new FirstClass();
        Chain leaf1 = new SecondClass();
        Chain leaf2 = new ThirdClass();
        root.nextChain(leaf1);
        leaf1.nextChain(leaf2);
    }
    public static void main(String[] args){
        Application displayText = new Application();
        displayText.root.getText();


        /*FirstClass fc = new FirstClass();
        SecondClass sc = new SecondClass();
        ThirdClass tc = new ThirdClass();

        System.out.println(fc.getText());
        System.out.println(fc.getAnotherText());
        System.out.println(sc.getText());
        System.out.println(sc.getAnotherText());
        System.out.println(tc.getText());
        System.out.println(tc.getAnotherText());*/
    }
}
