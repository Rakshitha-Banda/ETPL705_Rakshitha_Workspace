package com.evergent.corejava.rakshitha.finalproject;


import java.util.Scanner;



public class CoffeeController {
    public static void main(String[] args) {
        int coffeeId = 0;
        String coffeeName = "";
        double price = 0;
        long supplierContact = 0;
        int choice, repeat = 1;
        Scanner s = new Scanner(System.in);
        CoffeeService coffeeService = new CoffeeService();

        System.out.println("------------------- Welcome to Coffee Inventory -------------------");
        while (repeat != 0) {
            System.out.println("1. Add a New Coffee");
            System.out.println("2. Show Coffee Price");
            System.out.println("3. Update Coffee Price");
            System.out.println("4. Place Coffee Order");
            System.out.println("5. View Transaction Log");
            System.out.println("Enter your choice:");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Coffee ID:");
                    coffeeId = s.nextInt();
                    System.out.println("Enter Coffee Name:");
                    coffeeName = s.next();
                    System.out.println("Enter Supplier Contact:");
                    supplierContact = s.nextLong();
                    System.out.println("Enter Coffee Price:");
                    price = s.nextDouble();
                    int result = coffeeService.addCoffee(coffeeId, coffeeName, supplierContact, price);
                    System.out.println(result + " Coffee Added Successfully");
                    break;

                case 2:
                    System.out.println("Enter Coffee ID:");
                    coffeeId = s.nextInt();
                    double coffeePrice = coffeeService.getPrice(coffeeId);
                    System.out.println("Coffee Price: " + coffeePrice);
                    break;

                case 3:
                    System.out.println("Enter Coffee ID:");
                    coffeeId = s.nextInt();
                    System.out.println("Enter New Price:");
                    double newPrice = s.nextDouble();
                    double updatedPrice = coffeeService.updatePrice(coffeeId, newPrice);
                    System.out.println("Updated Price: " + updatedPrice);
                    break;

                case 4:
                    System.out.println("Enter Coffee ID:");
                    coffeeId = s.nextInt();
                    System.out.println("Enter Quantity:");
                    int quantity = s.nextInt();
                    int orderResult = coffeeService.orderCoffee(coffeeId, quantity);
                    System.out.println("Order placed successfully.");
                    break;

                case 5:
                    System.out.println("Enter Coffee ID:");
                    coffeeId = s.nextInt();
                    String log = coffeeService.getTransactionLog(coffeeId);
                    System.out.println("----- Transaction Log -----\n" + log);
                    break;

                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }

            System.out.println("\nEnter 1 to perform more operations or 0 to exit:");
            repeat = s.nextInt();
        }
    }
}
