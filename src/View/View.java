package View;

import Controller.Controller;

import java.util.Scanner;

public class View {
    public View() {
        Controller controller = new Controller(this);

        while(true) {

            Scanner sc = new Scanner(System.in);
            String input = "";
            System.out.println("(skapa) eller (visa)");
            double price;
            input = sc.nextLine();

            switch(input) {

                case "skapa":
                    System.out.print("Ange modell och pris: ");
                    input = sc.next();
                    price = sc.nextDouble();
                    System.out.println("Bil skapad");
                    controller.addCar(input, price);
                    break;

                case "visa":
                    controller.getCars();
                    break;

                default:
                    System.out.println("im here");

            }
        }
    }
    public void printShit(String msg) {
        System.out.println(msg);
    }
}
