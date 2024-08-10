public class FirePokemon extends Pokemon {

    private int temperature;
    private String flameColor;

    public FirePokemon(String name, int xp, int level, int temperature, String flameColor) {
        super(name, xp, level);
        super.setType ("Fire");

        this.temperature= temperature;
        this.flameColor= flameColor;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + "eats fire food.");
    }

    @Override
    public void tackle()   {
        super.tackle();
        if(temperature > 70) {
            System.out.println("and burns its opponent");
        }
    }

    public void flameThrower (){
        System.out.println(super.getName() + " shoots a massive " + flameColor + " flame at its opponent");
    }

    public String getFlameColor() { return flameColor;}

    public void setFlameColor(String flameColor){
        this.flameColor=flameColor;
    }

    public int getTemperature(){ return temperature;}

    public void setTemperature(int temperature){
        this.temperature=temperature;
    }

}
