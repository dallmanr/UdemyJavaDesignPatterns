package behavioural.observer;

/*
* Role: Observer
* Any display element that wants to get updates must implement this interface
* The subject calls updateScore() whenever setScore() is called
* */

public interface ScoreObserver {
    void updateScore(int homeTeamScore, int awayTeamScore);
}
