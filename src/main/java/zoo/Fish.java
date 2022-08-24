package zoo;
public class Fish extends Animal {
    public Fish(String name, String species, int numLegs, String location) {
        super(name, species, numLegs,location);

    }
    @Override
    public void diet(){
        System.out.println("Reptiles eat");

     }
     @Override
     public void move(){
        System.out.println("Reptiles swim");

    
    
}
}
