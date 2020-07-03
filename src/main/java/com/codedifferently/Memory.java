package com.codedifferently;

public class Memory {


    private double value = 0;
    private boolean cleared = true;

    public void setValue(double num){
        this.value = num;

    }


    public double getValue(){
        return this.value;

    }

    public void clear(){
        this.value = 0;
        this.cleared = true;
    }

    public void setClearFalse(){
        this.cleared = false;
    }

    public boolean getClearStatus(){
        return this.cleared;
    }

    public void display(){
        System.out.printf("\n\n== %.2f\n",this.getValue());
    }

    
}