package com.lbartem.currencyconverter;

public class Operation {
    private float n1;
    private Float n2;

    public Float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public Float getN2() {
        return (float) (n1*3.62);
    }

    public void setN2(int n2) {
        this.n2 = (float) n2;
    }
}
