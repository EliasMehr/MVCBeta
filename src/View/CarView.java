package View;

import Controller.CarController;
import Model.Car;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class CarView {

    private Consumer<String> outputMessage = text -> System.out.println(text);
    private CarController controller = new CarController(this);

    public CarView() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Add Cars\n2) Show available cars");

        String input = sc.nextLine();

        switch (input) {
            case "1":
                outputMessage.accept("Enter Model: ");
                input = sc.nextLine();
                outputMessage.accept("Enter price: ");
                String input2 = sc.nextLine();
                controller.createCar(input, Double.parseDouble(input2));
                break;
            case "2":
                controller.getCar();
                break;
            default:
        }
    }

    public void printCarModelDetails(String carModel, double price) {

        outputMessage.accept("Car model: ");
        outputMessage.accept("Model: " + carModel);
        outputMessage.accept("Price: " + NumberFormat.getCurrencyInstance().format(price));
        outputMessage.accept(" ");

    }

    public void printCars(ArrayList<Car> list){
        list.forEach(cars -> {
            System.out.println(cars.getModel());
        });

    }
}
