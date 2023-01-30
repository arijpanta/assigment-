import model.Books;
import model.Order;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Books b1= new Books("Novel", "Fiction", "hope", 1200, 1122);
        Books b2= new Books("Novel", "comedy", "jokes", 800, 1234);
        Books b3= new Books("Magazine", "Non fiction", "nepal", 500, 4568);
        Books b4= new Books("Magazine", "non fiction", "himal", 1000, 7896);
        ArrayList<Books> booksArrayList1 = new ArrayList<>();
        ArrayList<Books> booksArrayList2 = new ArrayList<>();
        booksArrayList1.add(b1);
        booksArrayList1.add(b2);
        booksArrayList2.add(b3);
        booksArrayList2.add(b4);
        User u1= new User("Ramhari", 1111, booksArrayList1);
        User u2= new User("Joti shree", 2222, booksArrayList2);
        ArrayList<User> us1 = new ArrayList<>();
        ArrayList<User> us2 = new ArrayList<>();
        us1.add(u1);
        us2.add(u2);
        Order o1=new Order(11, us1);
        Order o2=new Order(12, us2);
        o1.listUser();
        b1.getInfo();
        b2.getInfo();

        o2.listUser();
        b3.getInfo();
        b4.getInfo();




    }
}