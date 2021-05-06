public class MainClass {
    public static void main(String args[]){
        BirdSanctuaryManager birdSanctuarymanager = new BirdSanctuaryManager();

        Parrot parrot = new Parrot("p");
        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Duck duck = new Duck("d");
        Penguin penguin  = new Penguin("pn");
        Crow crow = new Crow("c");
        Crow crow1 = new Crow("c");

        birdSanctuarymanager.add(parrot);
        birdSanctuarymanager.add(parrot);
        birdSanctuarymanager.add(parrot1);
        birdSanctuarymanager.add(parrot2);
        birdSanctuarymanager.add(parrot3);
        birdSanctuarymanager.add(duck);
        birdSanctuarymanager.add(penguin);
        birdSanctuarymanager.add(crow);
        birdSanctuarymanager.add(crow1);

        System.out.println("Total birds =" + birdSanctuarymanager.getAllCount());

        birdSanctuarymanager.print();
        System.out.println("parrots are " + parrot.getCount());
        System.out.println("penguin are " + penguin.getCount());
        System.out.println("duck " + duck.getCount());
        System.out.println("crow" + crow.getCount());

        //birdSanctuarymanager.remove(parrot1);
        //birdSanctuarymanager.remove(parrot2);

        System.out.println("parrots are " + parrot.getCount());
        System.out.println("penguin are " + penguin.getCount());
        System.out.println("duck are " + duck.getCount());
        System.out.println("crow are " + crow.getCount());
        System.out.println("Total birds =" + birdSanctuarymanager.getAllCount());
    }
}
