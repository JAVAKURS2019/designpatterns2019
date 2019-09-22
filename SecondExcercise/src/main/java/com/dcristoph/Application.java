package com.dcristoph;

public class Application {
    private Chain c1;

    public Application() {
        this.c1 = new FirstClass();
        Chain c2 = new SecondClass();
        Chain c3 = new ThirdClass();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Application application = new Application();

        application.c1.doSmth();
    }
}
