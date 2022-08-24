package zoo;
public class Animal{

    public String name;
    public  String species;
     public int numLegs;
     public String location;

     public Animal(String name, String species, int numLegs, String location){
        this.name=name;
        this.species=species;
        this.numLegs=numLegs;
        this.location=location;



     }
     public void diet(){
        System.out.println("Animal eats");

     }
     public void move(){
        System.out.println("Animal moves");

     }
     public final void getLocation(){
        System.out.println("Animal lives in different locations");}



        public String toString(){
           return name + species + numLegs + location;
        }

    


    
    


}