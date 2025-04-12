package proyecto;

public class Weapon extends Item implements Equippable{

    private int damage;
    private boolean equiped;

    public Weapon(String name, int value, int damage){
        super(name, value);
        this.damage = damage;
    }

    //Getter
    public int getDamage(){
        return damage;
    }

    //Setter
    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public void use() {
        if(equiped){
            System.out.println("Attacking with" + getName() + "damage: " + damage);
        }else{
            System.out.println("You need to equip the item.");
        }
    }

    public void use(int bonus){
        System.out.println("Attacking with" + getName() + "Damage: " + (damage + bonus));
    }

    @Override
    public void Equip(){
        equiped = true;
        System.out.println(getName() + "Equiped.");
    }

    public void Unequip(){
        equiped = false;
        System.out.println(getName() + "Unequiped.");
    }
}
