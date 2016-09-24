package com.quinnbanet.tictactoe;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    String player1;
    String player2;
    Integer playerCount = 1;
    Integer x1Track = 11;
    Integer x2Track = 12;
    Integer x3Track = 13;
    Integer x4Track = 14;
    Integer x5Track = 15;
    Integer x6Track = 16;
    Integer x7Track = 17;
    Integer x8Track = 18;
    Integer x9Track = 19;
    Integer o1Track = 1;
    Integer o2Track = 2;
    Integer o3Track = 3;
    Integer o4Track = 4;
    Integer o5Track = 5;
    Integer o6Track = 6;
    Integer o7Track = 7;
    Integer o8Track = 8;
    Integer o9Track = 9;
    Integer xMainTracker = 1;
    Integer oMainTracker = 1;


   // Button startGame = (Button) findViewById(R.id.playGameBtn);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // When submit btn is clicked get user input and close
    // x & o choice
    public void submitBtn(View view){
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.overlay);
        rl1.setVisibility(View.GONE);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);


        if (selectedId == R.id.xBtn) {
            player1 = "X";
            player2 = "O";
        }
        else if (selectedId == R.id.oBtn) {
            player1 = "O";
            player2 = "X";
        }
        else{
            player1="You're not very good at this stuff d00d";
    }
        Log.d("SubmitBtn", player1);
      gameEval();
    }

    // ---------------Set each click of tiles to x or o---------------
                // odd playerCount = player1 Turn
                // even playerCount = player2 Turn
                // x = minimum height 1
                // o = minimum height 2
    public void btn1Click(View view) {
        ImageView xo1 = (ImageView) findViewById(R.id.xo1);
        // If user / comp has not selected this tile
        if (xo1.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo1.setImageResource(R.drawable.x);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x1Track;
                }
                if (player2 == "O") {
                    xo1.setImageResource(R.drawable.o);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o1Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo1.setImageResource(R.drawable.x);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x1Track;
                }
                if (player1 == "O") {
                    xo1.setImageResource(R.drawable.o);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o1Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn2Click(View view) {
        ImageView xo2 = (ImageView) findViewById(R.id.xo2);
        // If user / comp has not selected this tile
        if (xo2.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo2.setImageResource(R.drawable.x);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x2Track;
                }
                if (player2 == "O") {
                    xo2.setImageResource(R.drawable.o);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o2Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo2.setImageResource(R.drawable.x);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x2Track;
                }
                if (player1 == "O") {
                    xo2.setImageResource(R.drawable.o);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o2Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn3Click(View view) {
        ImageView xo3 = (ImageView) findViewById(R.id.xo3);
        // If user / comp has not selected this tile
        if (xo3.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo3.setImageResource(R.drawable.x);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x3Track;
                }
                if (player2 == "O") {
                    xo3.setImageResource(R.drawable.o);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o3Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo3.setImageResource(R.drawable.x);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x3Track;
                }
                if (player1 == "O") {
                    xo3.setImageResource(R.drawable.o);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o3Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn4Click(View view) {
        ImageView xo4 = (ImageView) findViewById(R.id.xo4);
        // If user / comp has not selected this tile
        if (xo4.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo4.setImageResource(R.drawable.x);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x4Track;
                }
                if (player2 == "O") {
                    xo4.setImageResource(R.drawable.o);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o4Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo4.setImageResource(R.drawable.x);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x4Track;
                }
                if (player1 == "O") {
                    xo4.setImageResource(R.drawable.o);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o4Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn5Click(View view) {
        ImageView xo5 = (ImageView) findViewById(R.id.xo5);
        // If user / comp has not selected this tile
        if (xo5.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo5.setImageResource(R.drawable.x);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x5Track;
                }
                if (player2 == "O") {
                    xo5.setImageResource(R.drawable.o);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o5Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo5.setImageResource(R.drawable.x);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x5Track;
                }
                if (player1 == "O") {
                    xo5.setImageResource(R.drawable.o);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o5Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn6Click(View view) {
        ImageView xo6 = (ImageView) findViewById(R.id.xo6);
        // If user / comp has not selected this tile
        if (xo6.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo6.setImageResource(R.drawable.x);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x6Track;
                }
                if (player2 == "O") {
                    xo6.setImageResource(R.drawable.o);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o6Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo6.setImageResource(R.drawable.x);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x6Track;
                }
                if (player1 == "O") {
                    xo6.setImageResource(R.drawable.o);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o6Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn7Click(View view) {
        ImageView xo7 = (ImageView) findViewById(R.id.xo7);
        // If user / comp has not selected this tile
        if (xo7.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo7.setImageResource(R.drawable.x);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x7Track;
                }
                if (player2 == "O") {
                    xo7.setImageResource(R.drawable.o);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o7Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo7.setImageResource(R.drawable.x);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x7Track;
                }
                if (player1 == "O") {
                    xo7.setImageResource(R.drawable.o);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o7Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn8Click(View view) {
        ImageView xo8 = (ImageView) findViewById(R.id.xo8);
        // If user / comp has not selected this tile
        if (xo8.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo8.setImageResource(R.drawable.x);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x8Track;
                }
                if (player2 == "O") {
                    xo8.setImageResource(R.drawable.o);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o8Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo8.setImageResource(R.drawable.x);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x8Track;
                }
                if (player1 == "O") {
                    xo8.setImageResource(R.drawable.o);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o8Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }
    public void btn9Click(View view) {
        ImageView xo9 = (ImageView) findViewById(R.id.xo9);
        // If user / comp has not selected this tile
        if (xo9.getVisibility()==View.INVISIBLE) {
            if (playerCount % 2 == 0) {
                //player2 turn
                if (player2 == "X") {
                    xo9.setImageResource(R.drawable.x);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x9Track;
                }
                if (player2 == "O") {
                    xo9.setImageResource(R.drawable.o);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o9Track;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo9.setImageResource(R.drawable.x);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    xMainTracker = xMainTracker * x9Track;
                }
                if (player1 == "O") {
                    xo9.setImageResource(R.drawable.o);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                    oMainTracker = oMainTracker * o9Track;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }

    public void getLog(View view) {
        Log.d("test", xMainTracker.toString());
        Log.d("test", oMainTracker.toString());
    }

    //---------------Evaluate Game Win/Tie/Loss-----------------
    public void gameEval() {
        //TODO: Implement game logic: if a combo of TTT is successful display player x wins
        //TODO: evaluate by if 147 is all x then its a win if 147 is all o its a win...etc
        Integer x147Win = 2618;
        Integer x258Win = 3240;
        Integer x369Win = 3952;
        Integer x123Win = 1716;
        Integer x456Win = 3360;
        Integer x789Win = 5814;
        Integer x159Win = 3135;
        Integer x357Win = 3315;

        Integer o147Win = 28;
        Integer o258Win = 80;
        Integer o369Win = 162;
        Integer o123Win = 6;
        Integer o456Win = 120;
        Integer o789Win = 504;
        Integer o159Win = 45;
        Integer o357Win = 105;

        ImageView im1 = (ImageView) findViewById(R.id.xo1);
        ImageView im2 = (ImageView) findViewById(R.id.xo2);
        ImageView im3 = (ImageView) findViewById(R.id.xo3);
        ImageView im4 = (ImageView) findViewById(R.id.xo4);
        ImageView im5 = (ImageView) findViewById(R.id.xo5);
        ImageView im6 = (ImageView) findViewById(R.id.xo6);
        ImageView im7 = (ImageView) findViewById(R.id.xo7);
        ImageView im8 = (ImageView) findViewById(R.id.xo8);
        ImageView im9 = (ImageView) findViewById(R.id.xo9);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        Integer minTurnsToWin = 4;

        // if minimum turns to win
        //if (playerCount > minTurnsToWin) {
            // Log.d("test", "playercount >4");
            // Vertical Cases || 1=4=7, 2=5=8, and 3=6=9
                if (xMainTracker == x147Win) {
                    Log.d("pls", "good job puppo, ya did it");
                }

            // Horizontal Cases|| 1=2=3, 4=5=6, 7=8=9
            // xtracker = -4, -7, or -10
            // o tracker = 6, 120, or 504
            if (xMainTracker == -4 || xMainTracker == -7 || xMainTracker == -10 ||
                oMainTracker == 6 || oMainTracker == 120 || oMainTracker == 504) {
                tv1.setVisibility(View.VISIBLE);
                Log.d("test", xMainTracker.toString());

                // Diagonal Cases || 1=5=9, 3=5=7
            }
            if (im1.getMinimumHeight() == im3.getMinimumHeight()) {
                Log.d("pls", "x's are same");
            }
            if (im1.getMinimumHeight() == im2.getMinimumHeight()) {
                Log.d("pls", "wrong, x=o");
            }
            if (im2.getMinimumHeight() == im4.getMinimumHeight()) {
                Log.d("pls", "o's are same");
            }
        /*Log.d("pls",im1.getMinimumHeight());
        Log.d("pls",im2.getDrawingCache().toString());
        Log.d("pls",im3.getDrawingCache().toString());
        Log.d("pls",im4.getDrawingCache().toString());*/

        //}


    }


}



