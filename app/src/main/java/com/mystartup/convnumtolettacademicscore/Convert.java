package com.mystartup.convnumtolettacademicscore;

import android.util.Log;

public class Convert implements IfConvert{

    private double score;

    //constructor
    public Convert (double score) {
        if (score == 0f) {
            return;
        }
        this.score = score;
    }

    //method of initial score
    public void numScore(double score){
        if (score == 0f) {
            return;
        }
        this.score = score;
    }

    //method of converting
    @Override
    public String converting(){
        if ((this.score <= 100.00)&&(this.score >= 75.00)){
            return "A";
        }
        else if ((this.score >= 70.00)&&(this.score <= 74.99)){
            return "AB";
        }
        else if ((this.score >= 65.00)&&(this.score <= 69.99)){
            return "B";
        }
        else if ((this.score >= 60.00)&&(this.score <= 64.99)){
            return "BC";
        }
        else if ((this.score >= 55.00)&&(this.score <= 59.99)){
            return "C";
        }
        else if ((this.score >= 40.00)&&(this.score <= 54.99)){
            return "D";
        }
        else if ((this.score >= 0)&&(this.score <= 40.00)){
            return "E";
        }
        return "Not Valid";
    }

    //method of display
    public void printResult(){
        Log.i("MyTag",converting() + "");
    }
}
