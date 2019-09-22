package com.dcristoph;

public class MyFacade {

    public void showAllText(){
        MyClass fc = new FirstClass();
        MyClass sc = new SecondClass();
        MyClass tc = new ThirdClass();

        MyTemplate template = new MyTemplate();
        template.showText(fc);
        template.showText(sc);
        template.showText(tc);
    }
}
