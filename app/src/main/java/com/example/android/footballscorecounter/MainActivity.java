package com.example.android.footballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscorecounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int shotsTeamA = 0;
    int shotsTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Sets the score for Team A
     */
    public void setScoreTeamA(View View){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Sets the score for team B
     */
    public void setScoreTeamB(View View){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Sets the shots for Team A
     */
    public void setShotsTeamA(View View){
        shotsTeamA += 1;
        displayShotsTeamA(shotsTeamA);
    }

    /**
     * Sets the shots for team B
     */
    public void setShotsTeamB(View View){
        shotsTeamB += 1;
        displayShotsTeamB(shotsTeamB);
    }
    /**
     * Sets the shots for Team A
     */
    public void setFoulsTeamA(View View){
        foulsTeamA += 1;
        displayFoulsTeamA(foulsTeamA);
    }

    /**
     * Sets the shots for team B
     */
    public void setFoulsTeamB(View View){
        foulsTeamB += 1;
        displayFoulsTeamB(foulsTeamB);
    }

    /**
     * Resets the stats
     */
    public void resetStats(View View){
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayShotsTeamA(shotsTeamA);
        displayShotsTeamB(shotsTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
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
    /**
     * Displays the shots score for Team A.
     */
    public void displayShotsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shots);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the shots score for Team B.
     */
    public void displayShotsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls score for Team A.
     */
    public void displayFoulsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the fouls score for Team B.
     */
    public void displayFoulsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }
}
