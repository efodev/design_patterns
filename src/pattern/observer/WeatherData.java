package pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * WeatherData class servers as the subject in the Observer pattern implementation
 */
public class WeatherData implements ISubject{
  private List<IObserver> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(IObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(IObserver observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update(this.temperature, this.humidity, this.pressure);
    }
  }

  /**
   * Called anytime the current states changed
   */
  public void measurementsChanged() {
    this.notifyObservers();
  }

  /**
   * Called to updates the current states
   * @param temperature
   * @param humidity
   * @param pressure
   */
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.measurementsChanged();
  }

  // other WeatherData methods here
}
