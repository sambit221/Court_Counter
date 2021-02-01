package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the methods for Team A.
     */
    public void addThreeForTeamA (View v){
        scoreTeamA  = scoreTeamA  + 3;
        displayForTeamA(scoreTeamA );
    }
    public void addTwoForTeamA (View v){
        scoreTeamA  = scoreTeamA  + 2;
        displayForTeamA(scoreTeamA );
    }
    public void addOneForTeamA (View v){
        scoreTeamA  = scoreTeamA  + 1;
        displayForTeamA(scoreTeamA );
    }

    /**
     * Displays the methods for Team B.
     */
    public void addThreeForTeamB (View v){
        scoreTeamB  = scoreTeamB  + 3;
        displayForTeamB(scoreTeamB );
    }
    public void addTwoForTeamB (View v){
        scoreTeamB  = scoreTeamB  + 2;
        displayForTeamB(scoreTeamB );
    }
    public void addOneForTeamB (View v){
        scoreTeamB  = scoreTeamB  + 1;
        displayForTeamB(scoreTeamB );
    }

    public void resetScore (View v){
        scoreTeamB  = 0;
        scoreTeamA  = 0;
        displayForTeamA(scoreTeamA );
        displayForTeamB(scoreTeamB );
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}