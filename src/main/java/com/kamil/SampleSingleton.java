package com.kamil;

public class SampleSingleton {

    private SampleSingleton() {
    }

    private static class SingletonCreator {
        private static final SampleSingleton INSTANCE = new SampleSingleton();
    }

    public static SampleSingleton getInstance() {
        return SingletonCreator.INSTANCE;
    }

}
