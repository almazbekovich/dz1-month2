public class Main {
    public static void main(String[] args) {
        Animal animal= new Animal(4,Colors.WRITE);
        Bird bird = new Bird(3, Colors.BLACK,"REKS");
        Pigeon pigeon = new Pigeon(6,Colors.RED,"Popugai" );
        System.out.println("Animal "+ animal.info()+"\nBird "+ bird.info()+"\nPigeon "+pigeon.info());
    }
}