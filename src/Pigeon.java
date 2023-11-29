public class Pigeon extends Bird {
    private String sound ;
    private Colors colors;

    public Pigeon(int old, Colors colors, String name, Colors colors1, String sound, Colors colors2) {
        super(old, colors, name, colors1);
        this.sound = sound;
        this.colors = colors2;
    }

    public String getSound() {
        return sound;

    }

    public Pigeon(int old, Colors colors, String name) {
        super(old, colors, name);
        this.sound = sound;
        this.colors = colors;
    }

    @Override
    public Colors getColors() {
        return colors;
    }

    @Override
    public String name(String name) {
        return super.name(name);
    }
}
