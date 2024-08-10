public class WaterIcePokemon extends WaterPokemon {

        private String iceColor;
        private int temperature;

        public WaterIcePokemon (String name, int level, int xp, boolean livesInWater, int liters, String iceColor, int temperature) {
            super(name, level, xp,liters, livesInWater);
            super.setType("Water and ice");

            this.iceColor=iceColor;
            this.temperature= temperature;

        }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats watery and icy food.");
    }

    public void freeze(){
        System.out.println("all water around freezes to " + temperature + "degrees below zero");
    }

    public void icicle(){
        System.out.println(super.getName() + " shoots " + iceColor + " colored icicles");
    }

    public String getIceColor(){
            return iceColor;
    }

    public void setIceColor(String iceColor){
            this.iceColor=iceColor;
    }

    public int getTemperature(){
            return temperature;
    }

    public void setTemperature(int temperature){
            this.temperature=temperature;
    }


}
