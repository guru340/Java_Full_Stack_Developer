package org.cfs;

public class DieselEngine implements Engine{
    public DieselEngine() {
        System.out.println("Diesel Engine ....");
    }

    @Override
    public int start() {
        return 1;
    }
}
