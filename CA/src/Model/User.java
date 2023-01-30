package Model;

import java.util.ArrayList;

public class User {
    String Name;
    int userID;

    ArrayList<Books> Books;

    public User(String name, int userID, ArrayList<model.Books> books) {
        Name = name;
        this.userID = userID;
        Books = books;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public ArrayList<model.Books> getBooks() {
        return Books;
    }

    public void setBooks(ArrayList<model.Books> books) {
        Books = books;
    }
}

}
