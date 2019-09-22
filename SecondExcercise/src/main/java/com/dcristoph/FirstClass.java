package com.dcristoph;

public class FirstClass implements Chain {
    private Chain nextChain;

    public String getText() {
        return "FirstClass";
    }

    public String getAnotherText() {
        return "FirstClass-another";
    }

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void doSmth() {
        System.out.println(getText());
        System.out.println(getAnotherText());
        if (this.nextChain != null) {
            this.nextChain.doSmth();
        }
    }

}
