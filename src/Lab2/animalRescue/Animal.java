package Lab2.animalRescue;

public class Animal {
    private String name;
    private float age;
    private int healthLevel ;
    private int hungerLevel;
    private String preferedFood;
    private String recreationActivity;

    public Animal() {
    }

    //
    public void setName(String Name){
        name = Name;
    }
    public String getName(){
     return name;
    }
//
    public void setAge( float  Age){
        age = Age;
    }
    public float getAge(){
        return age;
    }
//
    public void setHealthLevel(int HealthLevel){
        healthLevel = HealthLevel;
    }
    public int getHealthLevel(){
        return healthLevel;
    }
//
    public void  setHungerLevel(int HungerLevel) {
        hungerLevel = HungerLevel;
    }

        public int getHungerLevel () {
            return hungerLevel;
        }

//
    public void setPreferedFood(String PreferedFood) {
        preferedFood = PreferedFood;
        }
        public String getPreferedFood(){
            return preferedFood;
        }

 //

    public void setRecreationActivity(String RecreationActivity){
        recreationActivity = RecreationActivity;
    }
    public String getRecreationActivity(){
        return recreationActivity;
    }











}
