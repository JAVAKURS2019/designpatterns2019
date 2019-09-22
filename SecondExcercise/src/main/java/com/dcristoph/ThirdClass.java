package com.dcristoph;

public class ThirdClass implements Chain {
    private Chain chain;

    @Override
    public void nextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void getText() {
        System.out.println("ThirdClass");
    }

    @Override
    public String getAnotherText() {
        return "ThirdClass-another";
    }
}
