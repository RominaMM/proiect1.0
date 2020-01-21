package Lab2.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Miau";
        cat.age = 7;
        cat.healthLevel = 9;
        cat.hungerLevel = 8;
        cat.preferedFood = "Purina";
        cat.recreationActivity = "Playing with a ball of wool";

        AnimalRescuer romina = new AnimalRescuer();
        romina.name = "Romina M";
        romina.amountOfMoney = 500;

        AnimalFood catFood = new AnimalFood();
        catFood.name = "Purina for cats";
        catFood.price = 10;
        catFood.quantity = 2;
        catFood.inStock = true;

        RecreationActivity recreation = new RecreationActivity();
        recreation.name = "Sitting at the window";

        Veterinarian doctorVet = new Veterinarian();
        doctorVet.name = " Dr. V.";
        doctorVet.specialisation = "Feline Neurology";

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.healthLevel);
        System.out.println(cat.hungerLevel);
        System.out.println(cat.preferedFood);
        System.out.println(cat.recreationActivity);

        System.out.println(romina.name);
        System.out.println(romina.amountOfMoney);

        System.out.println(catFood.name);
        System.out.println(catFood.price);
        System.out.println(catFood.quantity);
        System.out.println(catFood.inStock);

        System.out.println(recreation.name);

        System.out.println(doctorVet.name);
        System.out.println(doctorVet.specialisation);

    }
}
