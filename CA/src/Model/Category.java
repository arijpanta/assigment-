package Model;

public class Category extends MainCatagory{
    public void getCode(){}

    public void getInfo(){

    }
    String Genre;

    public Catagory(String type, String genre) {
        super(type);
        Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
