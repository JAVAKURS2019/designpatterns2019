package com.dcristoph;

public class ThirdClass implements Chain {
    private Chain nextChain;

    public String getText() {
        return "ThirdClass";
    }

    public String getAnotherText() {
        return "ThirdClass-another";
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
