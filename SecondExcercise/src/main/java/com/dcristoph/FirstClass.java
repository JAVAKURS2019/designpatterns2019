package com.dcristoph;

public class FirstClass implements Chain {
    private Chain chain;

    @Override
    public void nextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void getText(){
        this.chain.getText();
        System.out.println("FirstClass");
    }

    @Override
    public String getAnotherText(){
        return "FirstClass-another";
    }
}
