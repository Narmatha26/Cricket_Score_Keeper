package android.example.cricketscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int noOfBallsA = 0;
    int noOfBallsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementRunsBy1A(View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void incrementRunsBy2A(View view){
        scoreTeamA = scoreTeamA + 2;
        displayScoreForTeamA(scoreTeamA);

    }

    public void incrementRunsBy3A(View view){
        scoreTeamA = scoreTeamA + 3;
        displayScoreForTeamA(scoreTeamA);

    }

    public void incrementRunsBy4A(View view){
        scoreTeamA = scoreTeamA + 4;
        displayScoreForTeamA(scoreTeamA);

    }

    public void incrementRunsBy6A(View view){
        scoreTeamA = scoreTeamA + 6;
        displayScoreForTeamA(scoreTeamA);

    }

    public void incrementNoOfBallsB(View view){
        noOfBallsB = noOfBallsB + 1;
        displayNoOfBallsB(noOfBallsB);
    }

    public void incrementNoOfBallsA(View view){
        noOfBallsA = noOfBallsA + 1;
        displayNoOfBallsA(noOfBallsA);
    }



    public void incrementRunsBy1B(View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    public void incrementRunsBy2B(View view){
        scoreTeamB = scoreTeamB + 2;
        displayScoreForTeamB(scoreTeamB);

    }

    public void incrementRunsBy3B(View view){
        scoreTeamB = scoreTeamB + 3;
        displayScoreForTeamB(scoreTeamB);

    }

    public void incrementRunsBy4B(View view){
        scoreTeamB = scoreTeamB + 4;
        displayScoreForTeamB(scoreTeamB);

    }

    public void incrementRunsBy6B(View view){
        scoreTeamB = scoreTeamB + 6;
        displayScoreForTeamB(scoreTeamB);

    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        noOfBallsA = 0;
        noOfBallsB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayNoOfBallsA(noOfBallsA);
        displayNoOfBallsB(noOfBallsB);
    }
    public void displayScoreForTeamA(int scoreTeamA){
        TextView scoreView = (TextView)findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayScoreForTeamB(int scoreTeamB){
        TextView scoreView = (TextView)findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void displayNoOfBallsA(int balls){
      TextView ballsView = (TextView)findViewById(R.id.no_of_balls_team_a);
      ballsView.setText(String.valueOf(balls));
    }

    public void displayNoOfBallsB(int balls){
        TextView ballsView = (TextView)findViewById(R.id.no_of_balls_team_b);
        ballsView.setText(String.valueOf(balls));
    }
}
