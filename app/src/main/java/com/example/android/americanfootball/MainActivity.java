 package com.example.android.americanfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int currentScoreTeamA = 0;
    private int currentScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void getTouchDownForTeamA(View view) {
        currentScoreTeamA += 6;
        displayForTeamA(currentScoreTeamA);

    }

    public void getFieldGoalForTeamA(View view) {
        currentScoreTeamA += 3;
        displayForTeamA(currentScoreTeamA);

    }


    public void getSafetyForTeamA(View view) {
        currentScoreTeamA += 2;
        displayForTeamA(currentScoreTeamA);
    }

    public void getPointsConversionForTeamA(View view) {
        currentScoreTeamA += 2;
        displayForTeamA(currentScoreTeamA);
    }


    public void getTouchDownForTeamB(View view) {
        currentScoreTeamB += 6;
        displayForTeamB(currentScoreTeamB);

    }

    public void getFieldGoalForTeamB(View view) {
        currentScoreTeamB += 3;
        displayForTeamB(currentScoreTeamB);

    }


    public void getSafetyForTeamB(View view) {
        currentScoreTeamB += 2;
        displayForTeamB(currentScoreTeamB);
    }

    public void getPointsConversionForTeamB(View view) {
        currentScoreTeamB += 2;
        displayForTeamB(currentScoreTeamB);
    }

    /**
     * Resets the score for both teams beck to 0.
     */

    public void resetScore(View view) {
        currentScoreTeamA = 0;
        currentScoreTeamB = 0;
        displayForTeamA(currentScoreTeamA);
        displayForTeamB(currentScoreTeamB);
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