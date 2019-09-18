package com.example.project2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int scoreTeamA = 0, scoreTeamB = 0, foulsTeamA = 0, foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayScoreTeamA(0);
        displayScoreTeamB(0);
        displayFoulsTeamA(0);
        displayFoulsTeamB(0);
    }

    public void goalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void missTeamA(View view) {
        scoreTeamA = scoreTeamA + 0;
        displayScoreTeamA(scoreTeamA);
    }

    public void foulTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }

    public void goalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void missTeamB(View view) {
        scoreTeamB = scoreTeamB + 0;
        displayScoreTeamB(scoreTeamB);
    }

    public void foulTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }

    private void displayScoreTeamA(int score) {
        TextView scoreTeamATv = findViewById(R.id.score_team_a_id);
        scoreTeamATv.setText(String.valueOf(score));
    }

    private void displayScoreTeamB(int score) {
        TextView scoreTeamBTv = findViewById(R.id.score_team_b_id);
        scoreTeamBTv.setText(String.valueOf(score));
    }

    private void displayFoulsTeamA(int fouls) {
        TextView foulsTeamATv = findViewById(R.id.fouls_team_a_id);
        foulsTeamATv.setText(String.valueOf(fouls));
    }

    private void displayFoulsTeamB(int fouls) {
        TextView foulsTeamBTv = findViewById(R.id.fouls_team_b_id);
        foulsTeamBTv.setText(String.valueOf(fouls));
    }
}
