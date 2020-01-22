package Lab2.animalRescue;

public class Animal {
    private String name;
    private float age;
    private int healthLevel ;
    private int hungerLevel;
    private String preferedFood;
    private String recreationActivity;
//
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
     return name;
    }
//
    public void setAge( float  newAge){
        age = newAge;
    }
    public float getAge(){
        return age;
    }
//
    public void sethealthLevel(int newhealthLevel){
        healthLevel = newhealthLevel;
    }
    public int gethealthLevel(){
        return healthLevel;
    }
//
    public void sethungerLevel(int newhungerLevel){
        hungerLevel = newhungerLevel;
    }
    public int gethungerLevel(){
        return hungerLevel;
    }
//
    public void setpreferedFood(String newpreferedFood){
        preferedFood = newpreferedFood;
    }
    public String getPreferedFood(){
        return preferedFood;
    }

    public void setrecreationActivity(String newrecreationActivity){
        recreationActivity = newrecreationActivity;
    }
    public String getRecreationActivity(){
        return recreationActivity;
    }











}
