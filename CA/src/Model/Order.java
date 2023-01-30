package Model;

import java.util.ArrayList;

public class Order {
    int orderNumber;

    ArrayList<User> User;

    public Order(int orderNumber, ArrayList<model.User> user) {
        this.orderNumber = orderNumber;
        User = user;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ArrayList<model.User> getUser() {
        return User;
    }

    public void setUser(ArrayList<model.User> user) {
        User = user;
    }

    public void listUser() {
        ArrayList<User> cl = this.User;

        for (User  c : cl) {
            System.out.println("Username: "+c.Name);
            System.out.println("User ID: "+c.userID +"\n"+ "Books Taken:");

        }

    }


}

