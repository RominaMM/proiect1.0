package Lab2.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal cat = new Animal();

        cat.setName("Miau");
        System.out.println(cat.getName());

        cat.setAge(7);
        System.out.println(cat.getAge());

        cat.setHealthLevel(9);
        System.out.println(cat.getHealthLevel());

        cat.setHungerLevel(8);
        System.out.println(cat.getHungerLevel());

        cat.setPreferedFood("Purina");
        System.out.println(cat.getPreferedFood());

        cat.setRecreationActivity("Playing with a ball of wool");
        System.out.println(cat.getRecreationActivity());
////
        AnimalRescuer romina = new AnimalRescuer();

        romina.setName("Romina");
        System.out.println(romina.getName());

        romina.setAmountOfMoney(500);
        System.out.println(romina.getAmountOfMoney());

////
        AnimalFood catFood = new AnimalFood();

        catFood.setNameFood("Purina, Kitty Kitty, Whiskas");
        System.out.println(catFood.getNameFood());

////

        RecreationActivity recreation = new RecreationActivity();

        recreation.setName("Sitting at the window");
        System.out.println(recreation.getName());

////

        Veterinarian doctorVet = new Veterinarian();

        doctorVet.setName(" Dr. V.");
        System.out.println(doctorVet.getName());

        doctorVet.setSpecialisation("Feline Neurology");
        System.out.println(doctorVet.getSpecialisation());











    }
}
