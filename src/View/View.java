package View;

import Controller.Controller;

import java.util.Scanner;

public class View {
    public View() {
        Controller controller = new Controller(this);

        while(true) {

            Scanner sc = new Scanner(System.in);
            String input = "";
            System.out.println("Vill du skapa en bil eller visa alla bilar?");
            System.out.println("(skapa) eller (visa)");
            double price;
            input = sc.nextLine();

            switch(input) {

                case "skapa":
                    System.out.print("Ange modell och pris: ");
                    input = sc.next();
                    if(sc.hasNextDouble()) {
                        price = sc.nextDouble();
                        controller.addCar(input, price);
                    }
                    else {
                        System.out.println("Ange priset med siffror!");
                    }

                    break;

                case "visa":
                    controller.getCars();
                    break;

            }
        }
    }


    public void printCars(String modell, double price) {
        System.out.println("Bilen: " + modell + " med priset: " + price + "kr");
    }

    public void printInfo(String modell) {
       if(modell == null) {
           System.out.println("Garaget är tomt");
       }
       else {
           System.out.println("Bilen: " + modell + " lades till i garaget");
       }
    }
}
