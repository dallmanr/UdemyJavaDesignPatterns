package behavioural.observer;

/*
* Role: Subject aka Publisher
* Maintains a list of observers which want score updates
* Notifies all registered observers when the score changes
* */
public interface ScoreSubject {
    void registerObserver(ScoreObserver observer);
    void removeObserver(ScoreObserver observer);
    void notifyObservers();

}
