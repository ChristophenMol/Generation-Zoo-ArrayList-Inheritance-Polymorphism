package zoo;

import java.util.ArrayList;

public class zoo {
    public static void main(String[] args){

        ArrayList<Animal>zoo = new ArrayList<Animal>();

        Animal bird= new Birds("Peacock", "Animalia", 2,"Indea");
        zoo.add(bird);

        Animal mammals= new Mammals("Dog", "welsh corgi ",4, "UK");
        zoo.add(mammals);

        Animal fish= new Fish("Shark"," welsh corgi",0, "South America");
        zoo.add(fish);

        Animal reptiles= new Reptiles("Cobra", "Serpentes",0,"China");
        zoo.add(reptiles);

        Birds bird1 = new Birds("Peacock" ,"Animalia",2,"India" );
        bird.diet();
        bird.move();

        Reptiles reptiles1 =new Reptiles("Cobra", "Serpentes",0,"China");
        reptiles1.diet();
        reptiles1.move();


        Mammals human =new Mammals("Dog", "welsh corgi ",4, "UK");
        human.diet();
        human.move();

        Fish fish1 =new Fish("Shark"," welsh corgi",0, "South America");
        fish1.diet();
        fish1.move();






    }
    
}
