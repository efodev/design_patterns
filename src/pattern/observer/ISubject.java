package pattern.observer;

import java.util.Observer;

/**
 * IISubject models the ISubject in the IObserver Pattern
 */
public interface ISubject {

  /**
   * Adds a new observer to the list of observers to notify when any of the states changes.
   * @param observer An observer instance to be notified
   */
  public void registerObserver(IObserver observer);

  /**
   * Removes a given observer from the list on dependent observers
   * @param observer An Observer to be removed
   */
  public void removeObserver(IObserver observer);

  /**
   * Notifies an Observer to update its states
   */
  public void notifyObservers();

}
