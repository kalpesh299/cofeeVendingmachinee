package org.example;

import cofiimachine.CoffeeMachine;

import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while (true) {
            System.out.println("\nSelect an option:\n1 - Buy\n2 - Fill\n3 - Take\n4 - Show\n0 - Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nSelect a coffee type:\n1 - Espresso\n2 - Latte\n3 - Cappuccino\n0 - Back");
                    int coffeeType = scanner.nextInt();

                    switch (coffeeType) {
                        case 1:
                            coffeeMachine.makeCoffee(250, 0, 16, 4);
                            break;
                        case 2:
                            coffeeMachine.makeCoffee(350, 75, 20, 7);
                            break;
                        case 3:
                            coffeeMachine.makeCoffee(200, 100, 12, 6);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Error: Invalid option!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount of water to add:");
                    int addedWater = scanner.nextInt();
                    System.out.println("Enter the amount of milk to add:");
                    int addedMilk = scanner.nextInt();
                    System.out.println("Enter the amount of beans to add:");
                    int addedBeans = scanner.nextInt();
                    coffeeMachine.fill(addedWater, addedMilk, addedBeans);
                    break;
                case 3:
                    coffeeMachine.take();
                    break;
                case 4:
                    coffeeMachine.show();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Error: Invalid option!");
                    break;
            }
        }
    }
}