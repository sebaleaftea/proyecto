package proyecto;

public abstract class Item {

    private String name;
    private int value;

    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }

    //Getters

    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setValue(int value){
        if(value > 0){
            this.value = value;}        
    }

    public abstract void use();

}
