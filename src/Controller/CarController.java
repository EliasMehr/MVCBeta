package Controller;

import Model.Car;
import Model.Facade;
import View.CarView;

public class CarController implements IObserver {
    //private Car car;
    private CarView view;
    private Facade facade = new Facade();

    public CarController(CarView view) {

        this.view = view;
    }

    public void getCar(){
        facade.showAvailableCars();
    }

    public void createCar(String model, double price){
        facade.addCar(model, price);
    }

    @Override
    public void update() {
        view.printCarModelDetails(facade.getCar().getModel(), facade.getCar().getPrice());
    }

}
