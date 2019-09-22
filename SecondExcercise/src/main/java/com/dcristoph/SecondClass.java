package com.dcristoph;

public class SecondClass implements Chain {
    private Chain nextChain;

    public String getText() {
        return "SecondClass";
    }

    public String getAnotherText() {
        return "SecondClass-another";
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
