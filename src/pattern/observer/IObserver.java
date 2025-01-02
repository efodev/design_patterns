package pattern.observer;

public interface IObserver {

  /**
   * Updates the states of this Observer on when notified by subject instance to which it is subscribed.
   * @param temp new temperature value
   * @param humidity new humidity value
   * @param pressure new barometric pressure value
   */
  public void update(float temp, float humidity, float pressure);

}
