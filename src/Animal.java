public class Animal {
     private int old;
    private Colors colors;

    public Animal(int old, Colors colors) {
        this.old = old;
        this.colors = colors;
    }

    public int getOld() {
        return old;
    }

    public Colors getColors() {
        return colors;
    }
    public String info() {
        return "color "+ colors+" old "+ old;
    }
}