package cn.broken.client.mod;

public class Mod {
    private final String name;
    private boolean enable;

    private int key;

    public Mod (String name, boolean enable) {
        this.name = name;
        this.enable = enable;
    }


    public String getName () {
        return name;
    }

    public boolean isEnable () {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getKey () {
        return key;
    }

    public void setKey (int key) {
        this.key = key;
    }

    public void render () {

    }
    public void update () {

    }

}
