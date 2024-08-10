public class Main {
    public static void main(String[] args) {

        GrassPokemon bulbassar = new GrassPokemon( "bulbassar", 5,2,true, 15);
        ElectricPokemon pikachu = new ElectricPokemon("pickachu", 15, 6,"pika pika", "Yellow");
        ElectricPokemon jolteon= new ElectricPokemon("jolteon", 10, 2, "brrrp", "Yellow");
        FirePokemon charmender = new FirePokemon("charmender", 17, 3,90, "Orange");
        WaterPokemon squirtle= new WaterPokemon("squirtle", 9,3,150, false);
        WaterIcePokemon spheal= new WaterIcePokemon("spheal", 2,1 , false, 30, "blue", 10);
        FirePokemon cyndaquil= new FirePokemon("cyndaquil", 6, 4, 120, "Orange");
        GrassPokemon treecko= new GrassPokemon("treecko", 18, 5, true, 25);

        System.out.println();
        System.out.println("We start with " + pikachu.getName());
        pikachu.tackle();
        pikachu.makeSound();
        pikachu.lightningBolt();

        System.out.println();
        System.out.println("Next up is " + charmender.getName());
        charmender.flameThrower();
        charmender.tackle();
        charmender.levelUp();

        System.out.println();
        System.out.println("Next up is " + bulbassar.getName());
        bulbassar.throwLeaves();
        bulbassar.growSeed();
        bulbassar.throwLeaves();
        bulbassar.throwLeaves();
        bulbassar.levelUp();

        System.out.println();
        System.out.println("Next upt is " + squirtle.getName());
        System.out.println("This pokemon has type " + squirtle.getType());
        squirtle.tackle();
        squirtle.toggleLivesInWater(true);
        System.out.println(squirtle.getName() + " now lives in water");
        squirtle.tackle();
        squirtle.waterGun();

        System.out.println();
        System.out.println("Next upt is " + spheal.getName());
        System.out.println(spheal.getName() + " has type " + spheal.getType() + " which is special because it has two types.");
        spheal.eats();
        spheal.tackle();
        spheal.freeze();
        spheal.waterGun();
        spheal.icicle();


    }
}
