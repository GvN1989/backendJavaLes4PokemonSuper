public class GrassPokemon extends Pokemon {

    private int numberOfLeaves;
    private boolean hasSeed;

    public GrassPokemon(String name, int xp, int level, boolean hasSeed, int numberOfLeaves) {
        super(name, xp, level);
        super.setType ("Grass");

        this.numberOfLeaves= numberOfLeaves;
        this.hasSeed= hasSeed;
    }

  @Override
    public void eats(){
        System.out.println(super.getName() + " eats grass food.");
    }

    public void throwLeaves(){
        if(numberOfLeaves <=0) {
            System.out.println(super.getName()+ " is out of leaves.");
        } else {
            System.out.println(super.getName() + " throws leaf." );
            numberOfLeaves--;
        }
    }

    public void growSeed (){
        if(hasSeed) {
            System.out.println("Seed has grown.");
        } else {
            System.out.println(super.getName() + " has no seed");
        }
    }

    public int getNumberOfLeaves() { return numberOfLeaves;}

    public void setNumberOfLeaves(int numberOfLeaves) { this.numberOfLeaves= numberOfLeaves;}

    public boolean hasSeed(){ return hasSeed;}

    public void toggleSeed(boolean hasSeed){
        this.hasSeed=hasSeed;
    }


}
