package model;

public class  MainCatagory{
    public void getID(){
        System.out.println("Library code: 1001");
    }
    String type;

    public void getInfo(){
        System.out.println("Book");
    }

    public MainCatagory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


}