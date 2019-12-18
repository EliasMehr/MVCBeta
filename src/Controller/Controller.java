package Controller;

import Model.Car;
import Model.Facade;
import View.View;

public class Controller implements Observer {

    private View view;
    private Facade facade = new Facade();

    public Controller(View view) {
        facade.attach(this);
        this.view = view;

    }

    public void addCar(String modell, double price) {
        facade.addCar(modell, price);
    }

    public void getCars() {

        if(facade.getCar().size() == 0) {
            view.printInfo(null);
        }
        for(Car c: facade.getCar()) {
            view.printCars(c.getModell(), c.getPrice());
        }
    }

    @Override
    public void update() {
        view.printInfo(facade.getCar().get(facade.getCar().size() - 1).getModell());
    }
}
