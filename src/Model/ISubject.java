package Model;

import Controller.Observer;

public interface ISubject {
    void attach(Observer o);
    void detach(Observer o);
    void notify1();
}
