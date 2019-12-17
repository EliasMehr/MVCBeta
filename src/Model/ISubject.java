package Model;

import Controller.IObserver;

public interface ISubject {
    void Notify();
    void Attach(IObserver observer);
    void Detach(IObserver observer);
}
