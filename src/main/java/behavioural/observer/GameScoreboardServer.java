package behavioural.observer;

/*
* Role: Concrete subject
* Holds the game score state
* When the score is updated, notifies all subscribed observers
* */

import java.util.LinkedHashSet;
import java.util.Set;

public class GameScoreboardServer implements ScoreSubject {

    private int homeTeamScore;
    private int awayTeamScore;
    // Set avoids duplicates making managing the observers easier
    private final Set<ScoreObserver> observers = new LinkedHashSet<>();

    GameScoreboardServer(int homeTeamScore, int awayTeamScore) {
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    @Override
    public void registerObserver(ScoreObserver observer) {

        if (observer == null) {
            throw new  IllegalArgumentException("Observer cannot be null");
        }

        observers.add(observer);
    }

    @Override
    public void removeObserver(ScoreObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // For all of our registered observers, which implement the ScoreObserver interface, we call updateScore()
        // providing the home and away team score change.
        // Whenever the score changes, we can call this method to then update all the observers
        for (ScoreObserver observer : observers) {
            observer.updateScore(homeTeamScore, awayTeamScore);
        }
    }

    /**
     * When the score changes, notify all observers
     */
    public void setScore(int homeTeamScore, int awayTeamScore) {
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;

        notifyObservers();
    }
}
