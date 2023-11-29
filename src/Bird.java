public class Bird extends Animal {
    private String name;
    private Colors colors;

    public Bird(int old, Colors colors, String name, Colors colors1) {
        super(old, colors);
        this.name = name;
        this.colors = colors1;
    }

    public String getName() {
        return name;

    }

    public Bird(int old, Colors colors, String name) {
        super(old, colors);
        this.name = name;
    }

    @Override
    public Colors getColors() {
        return colors;
    }
    public String name (String name){
        return name;
    }
    public final Colors name(Colors colors) {
        return colors;
    }

    @Override
    public String info() {
        return super.info();
    }
}