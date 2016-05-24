package designPattern.observer.entity;

/**
 * Created by ht002 on 2016/5/23.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
