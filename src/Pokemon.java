/* bonus .1 -> abstracte class hieronder*/
public abstract class Pokemon {

    private String name;
    private int level;
    private int xp;
    private String type;


    public Pokemon (String name, int xp, int level){
        this.name= name;
        this.xp = xp;
        this.level=level;
    }

    public abstract void eats();

    public void tackle(){
        System.out.println(name + " performs a tackle");
    }

    public String getName() { return name;}

    public void setName (String name){
        this.name = name;
    }

    /*public int getXp() {return xp;}

    public void setXp(int xp) {
        this.xp = xp;
    } */

    public int getLevel() {return level;}

    public void setLevel(int level) {
        this.level = level;
    }

    public String getType() { return type;}

    public void setType (String type ){
        this.type = type;
    }

    public void printPokemon () {
        System.out.println("My Pokemon is called " + name + "and has " + xp + " experience points");
    }
    public void levelUp() {
        this.level++;
        System.out.println("Congratulations, " + name + " has now reached level "+ level);
    }

}
