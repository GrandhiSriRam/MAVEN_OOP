package epam.maven.oop;

public class Chocolates extends Sweets{
    //inheritance
    String name;
    String type;
    int cost;
    int weigth;
    Chocolates(String name,String type,int cost,int weigth){
        super(name,type,cost,weigth);
    }
}