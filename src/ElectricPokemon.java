public class ElectricPokemon extends Pokemon {

    private String lightningColor;
    private String sound;

    public ElectricPokemon(String name, int xp, int level, String sound, String lightningColor) {
        super(name, xp, level);
        super.setType ("Electric");

        this.lightningColor= lightningColor;
        this.sound= sound;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats electric food.");
    }

    public void makeSound (){
        System.out.println(sound);
    }

    public void lightningBolt(){
        System.out.println(super.getName() + " throws a " + lightningColor + "lightning bolt");
    }

    public String getLightningColor(){
        return lightningColor;
    }

    public void setLightningColor(){
        this.lightningColor=lightningColor;
    }

    public String getSound(){
        return sound;
    }

    public void setSound() {
        this.sound=sound;
    }

}
