package proyecto;

public class Main {
    public static void main(String[] args) {
        Weapon bow = new Weapon(" Draconic Bow", 50000, 2000);
        Potion smallPotion = new Potion(" Small Potion",500, 700);
        Inventory bag = new Inventory();

        bow.use();
        bow.use(10);
        smallPotion.use();

        bag.addItem(bow);
        bag.addItem(smallPotion);

        bag.userItem(1);

        bag.showInventory();
    }
}