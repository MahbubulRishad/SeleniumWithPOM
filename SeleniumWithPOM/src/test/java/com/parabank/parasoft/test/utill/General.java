package com.parabank.parasoft.test.utill;

public class General {
    public static final int PAGE_LOAD_TIME = 30;

    public static void domStable() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
