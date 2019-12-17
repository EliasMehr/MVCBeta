package Model;

import Controller.IObserver;

import java.util.ArrayList;

public class Facade implements ISubject {
    Car car;
    ArrayList<IObserver> observer;
    ArrayList<Car> carList;

    public void addCar(String name, double price){
        this.carList.add(new Car(name, price));
        Notify();
    }

    public ArrayList showAvailableCars(){
        return carList;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void Notify() {
        this.observer.forEach(printUpdate -> {
            printUpdate.update();
        } );
    }

    @Override
    public void Attach(IObserver observer) {
        this.observer.add(observer);
    }

    @Override
    public void Detach(IObserver observer) {
        this.observer.remove(observer);
    }
}
