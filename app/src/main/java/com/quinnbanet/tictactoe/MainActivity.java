/*
Quinn Banet
9/26/16
Tic Tac Toe


This is a simple TicTacToe app that lets two users play tic tac toe.
This works by assigning each value a letter, then checking the winning
combinations for those letter sequences.

ie:  refer to game board below: if a user wins with a diagonal (159, 195, 519, 591, 951, or 915)
     the xMainTracker would contain string values of aei and oMainTracker would contain string
     values of jnr. refer to gameEval(); for evaluation methods

 1 | 2 | 3
 __|___|___
 4 | 5 | 6
 __|___|___
 7 | 8 | 9



*/
package com.quinnbanet.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String player1;
    String player2;
    Integer playerCount = 1;
    String x1Track = "a";
    String x2Track = "b";
    String x3Track = "c";
    String x4Track = "d";
    String x5Track = "e";
    String x6Track = "f";
    String x7Track = "g";
    String x8Track = "h";
    String x9Track = "i";
    String o1Track = "j";
    String o2Track = "k";
    String o3Track = "l";
    String o4Track = "m";
    String o5Track = "n";
    String o6Track = "o";
    String o7Track = "p";
    String o8Track = "q";
    String o9Track = "r";
    String xMainTracker = "";
    String oMainTracker = "";
    String whoWon;
    Integer p1ScoreTracker = 1;
    Integer p2ScoreTracker = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // When submit btn is clicked get user input and close
    // x & o choice
    public void submitBtn(View view) {
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.overlay);
        rl1.setVisibility(View.GONE);

        RadioGroup radioGroup;
        int selectedId;
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        selectedId = radioGroup.getCheckedRadioButtonId();

        if (selectedId == R.id.xBtn) {
            player1 = "X";
            player2 = "O";
        }
        else if (selectedId == R.id.oBtn) {
            player1 = "O";
            player2 = "X";
        }
        
        RESET_LINES();
    }

    // ---------------Set each click of tiles to x or o---------------
    // odd playerCount = player1 Turn
    // even playerCount = player2 Turn
    public void btn1Click(View view) {
        constantWatcher();
        ImageView xo1 = (ImageView) findViewById(R.id.xo1);
        // If user1 / user 2 has not selected this tile
        if (xo1.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo1.setImageResource(R.drawable.x);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x1Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo1.setImageResource(R.drawable.o);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o1Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo1.setImageResource(R.drawable.x);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x1Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo1.setImageResource(R.drawable.o);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o1Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn2Click(View view) {
        constantWatcher();
        ImageView xo2 = (ImageView) findViewById(R.id.xo2);
        // If user1 / user 2 has not selected this tile
        if (xo2.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo2.setImageResource(R.drawable.x);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x2Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo2.setImageResource(R.drawable.o);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o2Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo2.setImageResource(R.drawable.x);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x2Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo2.setImageResource(R.drawable.o);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o2Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn3Click(View view) {
        constantWatcher();
        ImageView xo3 = (ImageView) findViewById(R.id.xo3);
        // If user1 / user 2 has not selected this tile
        if (xo3.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo3.setImageResource(R.drawable.x);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x3Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo3.setImageResource(R.drawable.o);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o3Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo3.setImageResource(R.drawable.x);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x3Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo3.setImageResource(R.drawable.o);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o3Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn4Click(View view) {
        constantWatcher();
        ImageView xo4 = (ImageView) findViewById(R.id.xo4);
        // If user1 / user 2 has not selected this tile
        if (xo4.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo4.setImageResource(R.drawable.x);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x4Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo4.setImageResource(R.drawable.o);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o4Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo4.setImageResource(R.drawable.x);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x4Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo4.setImageResource(R.drawable.o);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o4Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn5Click(View view) {
        constantWatcher();
        ImageView xo5 = (ImageView) findViewById(R.id.xo5);
        // If user1 / user 2 has not selected this tile
        if (xo5.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo5.setImageResource(R.drawable.x);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x5Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo5.setImageResource(R.drawable.o);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o5Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo5.setImageResource(R.drawable.x);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x5Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo5.setImageResource(R.drawable.o);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o5Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn6Click(View view) {
        constantWatcher();
        ImageView xo6 = (ImageView) findViewById(R.id.xo6);
        // If user1 / user 2 has not selected this tile
        if (xo6.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo6.setImageResource(R.drawable.x);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x6Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo6.setImageResource(R.drawable.o);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o6Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo6.setImageResource(R.drawable.x);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x6Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo6.setImageResource(R.drawable.o);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o6Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn7Click(View view) {
        constantWatcher();
        ImageView xo7 = (ImageView) findViewById(R.id.xo7);
        // If user1 / user 2 has not selected this tile
        if (xo7.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo7.setImageResource(R.drawable.x);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x7Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo7.setImageResource(R.drawable.o);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o7Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo7.setImageResource(R.drawable.x);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x7Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo7.setImageResource(R.drawable.o);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o7Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn8Click(View view) {
        constantWatcher();
        ImageView xo8 = (ImageView) findViewById(R.id.xo8);
        // If user1 / user 2 has not selected this tile
        if (xo8.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo8.setImageResource(R.drawable.x);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x8Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo8.setImageResource(R.drawable.o);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o8Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo8.setImageResource(R.drawable.x);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x8Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo8.setImageResource(R.drawable.o);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o8Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }
    public void btn9Click(View view) {
        constantWatcher();
        ImageView xo9 = (ImageView) findViewById(R.id.xo9);
        // If user1 / user 2 has not selected this tile
        if (xo9.getVisibility() == View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo9.setImageResource(R.drawable.x);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x9Track;
                    constantWatcher();
                }
                if (player2 == "O") {
                    xo9.setImageResource(R.drawable.o);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o9Track;
                    constantWatcher();
                }
            } else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo9.setImageResource(R.drawable.x);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker + x9Track;
                    constantWatcher();
                }
                if (player1 == "O") {
                    xo9.setImageResource(R.drawable.o);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker + o9Track;
                    constantWatcher();
                }
            }
        }
        //user1 / user 2 selected an existing tile
        else {

        }

    }

    public void constantWatcher() {
        //Set gameEval(); watcher on each player move
        if (playerCount > 5) //minimum turns to win = 5
            for (int i = 1; i < 1000; i++) { // for infinite triggers of gameEval();
                if (i == playerCount) {
                    gameEval();
                    //Log.d("test","count is" + i);
                }
            }
    }

    //---------------Evaluate Game Win/Tie/Loss-----------------
    public void gameEval() {
        Log.d("test","gameEval triggered");
        Log.d("test", xMainTracker);
        Log.d("test", oMainTracker);

        ImageView im1 = (ImageView) findViewById(R.id.xo1);
        ImageView im2 = (ImageView) findViewById(R.id.xo2);
        ImageView im3 = (ImageView) findViewById(R.id.xo3);
        ImageView im4 = (ImageView) findViewById(R.id.xo4);
        ImageView im5 = (ImageView) findViewById(R.id.xo5);
        ImageView im6 = (ImageView) findViewById(R.id.xo6);
        ImageView im7 = (ImageView) findViewById(R.id.xo7);
        ImageView im8 = (ImageView) findViewById(R.id.xo8);
        ImageView im9 = (ImageView) findViewById(R.id.xo9);

        ImageView win147 = (ImageView) findViewById(R.id.win147);
        ImageView win258 = (ImageView) findViewById(R.id.win258);
        ImageView win369 = (ImageView) findViewById(R.id.win369);
        ImageView win123 = (ImageView) findViewById(R.id.win123);
        ImageView win456 = (ImageView) findViewById(R.id.win456);
        ImageView win789 = (ImageView) findViewById(R.id.win789);
        ImageView win159 = (ImageView) findViewById(R.id.win159);
        ImageView win357 = (ImageView) findViewById(R.id.win357);
        ImageView cats = (ImageView) findViewById(R.id.winCATS);

        // Vertical Cases || 1=4=7, 2=5=8, and 3=6=9
        if (xMainTracker.contains("a") && xMainTracker.contains("d") && xMainTracker.contains("g")) {
            win147.setVisibility(View.VISIBLE);
            WIN();
            Log.d("test", "good job, ya did it");
            whoWon = "X";
        }
        else if (oMainTracker.contains("j") && oMainTracker.contains("m") && oMainTracker.contains("p")) {
            win147.setVisibility(View.VISIBLE);
            WIN();
            Log.d("test", "good job, ya did it");
            whoWon = "O";
        }
        else if (xMainTracker.contains("b") && xMainTracker.contains("e") && xMainTracker.contains("h")) {
            win258.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if(oMainTracker.contains("k") && oMainTracker.contains("n") && oMainTracker.contains("q")) {
            win258.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }
        else if (xMainTracker.contains("c") && xMainTracker.contains("f") && xMainTracker.contains("i")) {
            win369.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if (oMainTracker.contains("l") && oMainTracker.contains("o") && oMainTracker.contains("r")) {
            win369.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }

        // Horizontal Cases|| 1=2=3, 4=5=6, 7=8=9
        else if (xMainTracker.contains("a") && xMainTracker.contains("b") && xMainTracker.contains("c")) {
            win123.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if (oMainTracker.contains("j") && oMainTracker.contains("k") && oMainTracker.contains("l")) {
            win123.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }
        else if (xMainTracker.contains("d") && xMainTracker.contains("e") && xMainTracker.contains("f")) {
            win456.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if(oMainTracker.contains("m") && oMainTracker.contains("n") && oMainTracker.contains("o")) {
           win456.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }
        else if (xMainTracker.contains("g") && xMainTracker.contains("h") && xMainTracker.contains("i")) {
            win789.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if (oMainTracker.contains("p") && oMainTracker.contains("q") && oMainTracker.contains("r")) {
            win789.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }

        // Diagonal Cases || 1=5=9, 3=5=7
        else if (xMainTracker.contains("a") && xMainTracker.contains("e") && xMainTracker.contains("i")) {
            win159.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if (oMainTracker.contains("j") && oMainTracker.contains("n") && oMainTracker.contains("r")) {
            win159.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }
        else if (xMainTracker.contains("c") && xMainTracker.contains("e") && xMainTracker.contains("g")) {
            win357.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "X";
        }
        else if (oMainTracker.contains("l") && oMainTracker.contains("n") && oMainTracker.contains("p")) {
            win357.setVisibility(View.VISIBLE);
            WIN();
            whoWon = "O";
        }
        // if all selected but no win, call CATS(); game
        else if (im1.getVisibility() == View.VISIBLE && im2.getVisibility() == View.VISIBLE &&
                 im3.getVisibility() == View.VISIBLE && im4.getVisibility() == View.VISIBLE &&
                 im5.getVisibility() == View.VISIBLE && im6.getVisibility() == View.VISIBLE &&
                 im7.getVisibility() == View.VISIBLE && im8.getVisibility() == View.VISIBLE &&
                 im9.getVisibility() == View.VISIBLE) {
            cats.setVisibility(View.VISIBLE);
           CATS();
        }

    }


    public void WIN() {
        TextView ps1 = (TextView) findViewById(R.id.p1s);
        TextView ps2 = (TextView) findViewById(R.id.p2s);
        TextView score1 = (TextView) findViewById(R.id.player1Score);
        TextView score2 = (TextView) findViewById(R.id.player2Score);

        ps1.setVisibility(View.VISIBLE);
        ps2.setVisibility(View.VISIBLE);
        score1.setVisibility(View.VISIBLE);
        score2.setVisibility(View.VISIBLE);

        Log.d("playCount", p1ScoreTracker.toString());
        Log.d("playCount", p2ScoreTracker.toString());


        if (player1 == "X" && whoWon == "X")  {
            p1ScoreTracker = p1ScoreTracker + 1;
            score1.setText(p1ScoreTracker.toString());
            Log.d("playCount", p1ScoreTracker.toString());
        }
        else if (player1 == "O" && whoWon == "O")  {
            p1ScoreTracker = p1ScoreTracker + 1;
            score1.setText(p1ScoreTracker.toString());
            Log.d("playCount", p1ScoreTracker.toString());
        }
        else if (player2 == "X" && whoWon == "X") {
            p2ScoreTracker = p2ScoreTracker + 1;
            score2.setText(p2ScoreTracker.toString());
            Log.d("playCount", p2ScoreTracker.toString());
        }
        if (player2 == "O" && whoWon == "O")  {
            p2ScoreTracker = p2ScoreTracker + 1;
            score1.setText(p2ScoreTracker.toString());
            Log.d("playCount", p2ScoreTracker.toString());
        }

        RESET();
    }
    public void CATS() {
        RESET();
    }
    public void RESET() {
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.overlay);
        rl1.setVisibility(View.VISIBLE);
        playerCount = 1;
        xMainTracker = "";
        oMainTracker = "";

        ImageView im1 = (ImageView) findViewById(R.id.xo1);
        ImageView im2 = (ImageView) findViewById(R.id.xo2);
        ImageView im3 = (ImageView) findViewById(R.id.xo3);
        ImageView im4 = (ImageView) findViewById(R.id.xo4);
        ImageView im5 = (ImageView) findViewById(R.id.xo5);
        ImageView im6 = (ImageView) findViewById(R.id.xo6);
        ImageView im7 = (ImageView) findViewById(R.id.xo7);
        ImageView im8 = (ImageView) findViewById(R.id.xo8);
        ImageView im9 = (ImageView) findViewById(R.id.xo9);

        im1.setVisibility(View.INVISIBLE);
        im2.setVisibility(View.INVISIBLE);
        im3.setVisibility(View.INVISIBLE);
        im4.setVisibility(View.INVISIBLE);
        im5.setVisibility(View.INVISIBLE);
        im6.setVisibility(View.INVISIBLE);
        im7.setVisibility(View.INVISIBLE);
        im8.setVisibility(View.INVISIBLE);
        im9.setVisibility(View.INVISIBLE);
    }
    public void RESET_LINES() {
        ImageView win147 = (ImageView) findViewById(R.id.win147);
        ImageView win258 = (ImageView) findViewById(R.id.win258);
        ImageView win369 = (ImageView) findViewById(R.id.win369);
        ImageView win123 = (ImageView) findViewById(R.id.win123);
        ImageView win456 = (ImageView) findViewById(R.id.win456);
        ImageView win789 = (ImageView) findViewById(R.id.win789);
        ImageView win159 = (ImageView) findViewById(R.id.win159);
        ImageView win357 = (ImageView) findViewById(R.id.win357);
        ImageView cats = (ImageView) findViewById(R.id.winCATS);


        cats.setVisibility(View.INVISIBLE);
        win147.setVisibility(View.INVISIBLE);
        win258.setVisibility(View.INVISIBLE);
        win369.setVisibility(View.INVISIBLE);
        win123.setVisibility(View.INVISIBLE);
        win456.setVisibility(View.INVISIBLE);
        win789.setVisibility(View.INVISIBLE);
        win159.setVisibility(View.INVISIBLE);
        win357.setVisibility(View.INVISIBLE);
    }
}



