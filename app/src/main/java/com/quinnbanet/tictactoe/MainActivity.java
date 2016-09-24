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

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    String player1;
    String player2;
    Integer playerCount = 1;
    Button startGame = (Button) findViewById(R.id.playGameBtn);


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
                }
                if (player2 == "O") {
                    xo1.setImageResource(R.drawable.o);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo1.setImageResource(R.drawable.x);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo1.setImageResource(R.drawable.o);
                    xo1.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo2.setImageResource(R.drawable.o);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo2.setImageResource(R.drawable.x);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo2.setImageResource(R.drawable.o);
                    xo2.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo3.setImageResource(R.drawable.o);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo3.setImageResource(R.drawable.x);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo3.setImageResource(R.drawable.o);
                    xo3.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo4.setImageResource(R.drawable.o);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo4.setImageResource(R.drawable.x);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo4.setImageResource(R.drawable.o);
                    xo4.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo5.setImageResource(R.drawable.o);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo5.setImageResource(R.drawable.x);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo5.setImageResource(R.drawable.o);
                    xo5.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo6.setImageResource(R.drawable.o);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo6.setImageResource(R.drawable.x);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo6.setImageResource(R.drawable.o);
                    xo6.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo7.setImageResource(R.drawable.o);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo7.setImageResource(R.drawable.x);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo7.setImageResource(R.drawable.o);
                    xo7.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo8.setImageResource(R.drawable.o);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo8.setImageResource(R.drawable.x);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo8.setImageResource(R.drawable.o);
                    xo8.setVisibility(View.VISIBLE);
                    playerCount++;
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
                }
                if (player2 == "O") {
                    xo9.setImageResource(R.drawable.o);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
            else {
                //player1 turn
                // if != x or o
                if (player1 == "X") {
                    xo9.setImageResource(R.drawable.x);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                }
                if (player1 == "O") {
                    xo9.setImageResource(R.drawable.o);
                    xo9.setVisibility(View.VISIBLE);
                    playerCount++;
                }
            }
        }
        //User / comp selected an existing tile
        else {

        }

    }


    //---------------Evaluate Game Win/Tie/Loss-----------------
    public void gameEval() {
        //TODO: Implement game logic: if a combo of TTT is successful display player x wins
        //TODO: evaluate by if 147 is all x then its a win if 147 is all o its a win...etc
    }





}



