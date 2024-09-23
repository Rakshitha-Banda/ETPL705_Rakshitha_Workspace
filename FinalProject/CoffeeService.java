package com.evergent.corejava.rakshitha.finalproject;


public class CoffeeService {
    String str = "";
    CoffeeDAO coffeeDAO = new CoffeeDAO();

    public int addCoffee(int coffeeId, String coffeeName, long supplierContact, double price) {
        CoffeeBean coffeeBean = new CoffeeBean();
        coffeeBean.setCoffeeId(coffeeId);
        coffeeBean.setCoffeeName(coffeeName);
        coffeeBean.setSupplierContact(supplierContact);
        coffeeBean.setPrice(price);
        int result = coffeeDAO.addCoffee(coffeeBean);
        if (result != 0) {
            str = "New Coffee Added: " + coffeeName;
            coffeeDAO.addLog(coffeeId, str);
        }
        return result;
    }

    public double getPrice(int coffeeId) {
        return coffeeDAO.getPrice(coffeeId);
    }

    public double updatePrice(int coffeeId, double newPrice) {
        double currentPrice = coffeeDAO.getPrice(coffeeId);
        int result = coffeeDAO.updatePrice(coffeeId, newPrice);
        double updatedPrice = coffeeDAO.getPrice(coffeeId);
        str = "Price Updated for Coffee ID: " + coffeeId + " to: " + newPrice;
        coffeeDAO.addLog(coffeeId, str);
        return updatedPrice;
    }

    public int orderCoffee(int coffeeId, int quantity) {
        double price = coffeeDAO.getPrice(coffeeId);
        if (price == 0) {
            return 0;
        } else {
            int result = coffeeDAO.placeOrder(coffeeId, quantity);
            str = "Order Placed for Coffee ID: " + coffeeId + " Quantity: " + quantity;
            coffeeDAO.addLog(coffeeId, str);
            return result;
        }
    }

    public String getTransactionLog(int coffeeId) {
        return coffeeDAO.getLog(coffeeId);
    }
}

