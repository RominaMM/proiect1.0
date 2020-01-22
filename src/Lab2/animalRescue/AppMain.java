package Lab2.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal cat = new Animal();

        cat.setName("Miau");
        System.out.println(cat.getName());
        cat.setAge(7);
        System.out.println(cat.getAge());
        cat.sethealthLevel(9);
        System.out.println(cat.gethealthLevel());
        cat.sethungerLevel(8);
        System.out.println(cat.gethungerLevel());
        cat.setpreferedFood("Purina");
        System.out.println(cat.getPreferedFood());
        cat.setrecreationActivity("Playing with a ball of wool");
        System.out.println(cat.getRecreationActivity());
////
        AnimalRescuer romina = new AnimalRescuer();

        romina.setname("Romina");
        System.out.println(romina.getname());
        romina.setAmountOfMoney(500);
        System.out.println(romina.getAmountOfMoney());

////
        AnimalFood catFood = new AnimalFood();
        System.out.println(catFood.getname());


























        RecreationActivity recreation = new RecreationActivity();
        recreation.name = "Sitting at the window";

        Veterinarian doctorVet = new Veterinarian();
        doctorVet.name = " Dr. V.";
        doctorVet.specialisation = "Feline Neurology";







        System.out.println(recreation.name);

        System.out.println(doctorVet.name);
        System.out.println(doctorVet.specialisation);

    }
}
