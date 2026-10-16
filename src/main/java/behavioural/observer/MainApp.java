package behavioural.observer;

/**
 * Role: Client / Demo / Driver
 * Sets up Subject and Observers
 * Simulates score updates
 */
public class MainApp {


    static void main() {
        // Create our Subject
        GameScoreboardServer gameScoreboardServer = new GameScoreboardServer(0,0);

        // Create our Observers
        JumbotronDisplay jumbotronDisplay = new JumbotronDisplay();
        MobileAppDisplay mobileAppDisplay = new MobileAppDisplay();

        // Register our Observers with our Subject
        gameScoreboardServer.registerObserver(mobileAppDisplay);
        gameScoreboardServer.registerObserver(jumbotronDisplay);

        // Update the score and notify Observers
        gameScoreboardServer.setScore(1, 0);
        System.out.println();

        // Remove the Mobile App from score updates
        gameScoreboardServer.removeObserver(mobileAppDisplay);

        // Update the score - Only Jumbotron display should now get the updates
        gameScoreboardServer.setScore(2, 0);
    }
}
