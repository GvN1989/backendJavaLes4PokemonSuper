public class WaterPokemon extends Pokemon {

    private boolean livesInWater;
    private int liters;


    public WaterPokemon(String name, int xp, int level, int liters, boolean livesInWater) {
        super(name, xp, level);
        super.setType("Water");

        this.livesInWater = livesInWater;
        this.liters = liters;

    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats water food");
    }

    @Override
    public void tackle() {
        if (livesInWater) {
            System.out.println("This pokemon cannot tackle, because it live in water.");
        } else {
            super.tackle();
        }
    }

    public void waterGun() {
        if (liters <= 0) {
            System.out.println(super.getName() + " is out of water.");
        } else {
            System.out.println(super.getName() + " squirts water.");
        }
    }

    public boolean LivesInWater() {
        return livesInWater;
    }

    public void toggleLivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

}
