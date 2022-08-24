package zoo;
public class Mammals extends Animal{
    public Mammals(String name, String species, int numLegs, String location) {
        super(name, species, numLegs,location);

    }
    @Override
    public void diet(){
        System.out.println("Mammals eat");

     }
     @Override
     public void move(){
        System.out.println("Mammals walk");

    
     }
     


       

    
    
}
