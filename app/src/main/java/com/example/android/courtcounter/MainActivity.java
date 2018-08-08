package com.example.android.courtcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    int scoreTeamC = 0;

    int scoreTeamD = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 5 points.
     */
    public void fiveForTeamA (View v) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void oneForTeamA (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Decrease the score for Team A by 1 point.
     */
    public void minusOneForTeamA (View v) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Decrease the score for Team A by 5 points.
     */
    public void minusFiveForTeamA (View v) {
        scoreTeamA = scoreTeamA - 5;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 5 points.
     */
    public void fiveForTeamB (View v) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 points.
     */
    public void oneForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Decrease the score for Team B by 1 point.
     */
    public void minusOneForTeamB (View v) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Decrease the score for Team B by 5 points.
     */
    public void minusFiveForTeamB (View v) {
        scoreTeamB = scoreTeamB - 5;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team C.
     */
    public void displayForTeamC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team C by 5 points.
     */
    public void fiveForTeamC (View v) {
        scoreTeamC = scoreTeamC + 5;
        displayForTeamC(scoreTeamC);
    }

    /**
     * Increase the score for Team C by 1 point.
     */
    public void oneForTeamC (View v) {
        scoreTeamC = scoreTeamC + 1;
        displayForTeamC(scoreTeamC);
    }

    /**
     * Decrease the score for Team C by 1 point.
     */
    public void minusOneForTeamC (View v) {
        scoreTeamC = scoreTeamC - 1;
        displayForTeamC(scoreTeamC);
    }

    /**
     * Decrease the score for Team C by 5 points.
     */
    public void minusFiveForTeamC (View v) {
        scoreTeamC = scoreTeamC - 5;
        displayForTeamC(scoreTeamC);
    }

    /**
     * Displays the given score for Team D.
     */
    public void displayForTeamD(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_d_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team D by 5 points.
     */
    public void fiveForTeamD (View v) {
        scoreTeamD = scoreTeamD + 5;
        displayForTeamD(scoreTeamD);
    }

    /**
     * Increase the score for Team D by 1 point.
     */
    public void oneForTeamD (View v) {
        scoreTeamD = scoreTeamD + 1;
        displayForTeamD(scoreTeamD);
    }

    /**
     * Decrease the score for Team D by 1 point.
     */
    public void minusOneForTeamD (View v) {
        scoreTeamD = scoreTeamD - 1;
        displayForTeamD(scoreTeamD);
    }

    /**
     * Decrease the score for Team D by 5 points.
     */
    public void minusFiveForTeamD (View v) {
        scoreTeamD = scoreTeamD - 5;
        displayForTeamD(scoreTeamD);
    }
    /**
     * Reset the score for Team A, B, & C to zero.
     */
    public void resetScores (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamC = 0;
        scoreTeamD = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamC(scoreTeamC);
        displayForTeamD(scoreTeamD);
    }

    /**
     * This was an attempt to set up an onFocus but I couldn't quite get it right. Removed the
     * 'onFocus' from the xml.
    public void onFocusChangeA (View v, boolean hasFocus) {
        EditText nameText = (EditText) findViewById(R.id.EditText_Team_A);
        if (v.getId() == nameText.getId())
        {
            nameText.setCursorVisible(true);
        }
    }

    /**
     * Makes the cursor visible when you click to edit the team name.
     * @param view

    public void onFocusChangeA(View view) {
        EditText nameText = (EditText) findViewById(R.id.EditText_Team_A);
        nameText.setCursorVisible(true);
    }
    */
}

