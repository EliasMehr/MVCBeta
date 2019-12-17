package Model;

import Controller.Observer;

import java.util.ArrayList;
import java.util.List;

public class Facade implements ISubject {
    List<Observer> observers;
    List<Car> carList;

    public Facade() {
        this.carList = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addCar(String name, double price) {
        this.carList.add(new Car(name, price));
        notify1();
    }

    public List<Car> getCar() {
        return this.carList;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notify1() {
        for(Observer o: observers) {
            o.update();
        }
    }
}
