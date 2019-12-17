package Controller;

import Model.Car;
import Model.Facade;
import View.View;

public class Controller implements Observer {
    View view;
    Facade facade = new Facade();
    int index = 0;
    public Controller(View view) {
        facade.attach(this);
        this.view = view;
    }

    public void addCar(String modell, double price) {
        facade.addCar(modell, price);
    }

    public void getCars() {
        for(Car c: facade.getCar()) {
            System.out.println(c.getModell());
            System.out.println(c.getPrice());
        }
    }

    @Override
    public void update() {
        System.out.println("La till bilen " + facade.getCar().get(index).getModell() + " i listan");
        index++;
    }
}
