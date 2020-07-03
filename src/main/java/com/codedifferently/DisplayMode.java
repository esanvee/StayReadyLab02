package com.codedifferently;

public class DisplayMode extends SciCalculator{

    String displayMode;

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }

    public String getDisplayMode(){
        return this.displayMode;
    }
    
    public void changeDisplayMode(int num){

        switch(num){

            case 1:
            setDisplayMode("decimal");
            break;

            case 2:
            setDisplayMode("binary");
            break;

            case 3:
            setDisplayMode("octal");
            break;

            case 4:
            setDisplayMode("hexadecimal");
            break;

            default:
            System.out.println("\nGoodbye.\n");
            stop();


        }

        clearMemory(); //Clear scanner and reboot calculator


    }
}