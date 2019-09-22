package com.dcristoph;

public class SecondClass implements Chain {
    private Chain chain;

    @Override
    public void nextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void getText() {
        this.chain.getText();
        System.out.println("SecondClass");
    }

    @Override
    public String getAnotherText() {
        return "SecondClass-another";
    }
}
