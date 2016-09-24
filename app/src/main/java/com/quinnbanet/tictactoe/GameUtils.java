package com.quinnbanet.tictactoe;

import android.util.Log;

import java.util.Random;

/**
 * Created by quinnbanet on 9/21/16.
 */

public class GameUtils {
    public static final String WIN = "Win";
    public static final String LOSE = "lose";
    public static final String TIES = "Cat's Game";


    public static Integer getComputerChoice() {

        Random rand = new Random();

        int n = rand.nextInt(9) + 1;
        if (n == 1) {
            return R.id.btn1;
        } else if (n == 2) {
            return R.id.btn5;
        } else if (n == 3) {
            return R.id.btn6;
        } else if (n == 4) {
            return R.id.btn4;
        } else if (n == 5) {
            return R.id.btn5;
        } else if (n == 6) {
            return R.id.btn6;
        } else if (n == 7) {
            return R.id.btn7;
        } else if (n == 8) {
            return R.id.btn8;
        } else {
            return R.id.btn9;
        }
    }

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {

        if (playerSelectedChoice == R.id.xBtn) {
            Log.d("player", "selected x");
        }
        if (playerSelectedChoice == R.id.oBtn) {
            Log.d("player", "selected o");
        }
        return "";
    }
    public static Integer convertButtonToImage(Integer buttonChoice) {

        // if user choice = x, user btnchoice = x button pic
        // else user choice = o, user btnhoice = o button pic
        return 1;
    }
}

/*public static Boolean getTurn() {
    Random rand = new Random();

    boolean turn = rand.nextBoolean();

    if(turn==true) {
        return
    }
    else {
        return
    } */
