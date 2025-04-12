package proyecto;

public class Potion extends Item {

    private int heal;

    public Potion(String name, int value, int heal){
        super(name, value);
        this.heal = heal;
    }

    //Getter
    public int getHeal(){
        return heal;
    }
    //Setter

    //Metodo
    public void use(){
        System.out.println("Healing with" + getName() + "Heal: " + heal);
    }
}
