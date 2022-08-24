package zoo;

public class Birds extends Animal  {
    
    public Birds(String name, String species, int numLegs, String location) {
        super(name, species, numLegs,location);

    }
    @Override
    public void diet(){
        System.out.println("Birds eat");

     }
     @Override
     public void move(){
        System.out.println("Birds fly");

    
     }
     


       


    
}
