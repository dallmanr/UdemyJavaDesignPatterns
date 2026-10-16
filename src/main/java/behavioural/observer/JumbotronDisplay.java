package behavioural.observer;

/**
 * Role: Concrete observer
 *
 * Shows changes to the score on a large display
 */

public class JumbotronDisplay implements ScoreObserver {


    @Override
    public void updateScore(int homeTeamScore, int awayTeamScore) {
        System.out.println("[Jumbotron Display] Home: " + homeTeamScore + " | Away: " + awayTeamScore);
    }
}
