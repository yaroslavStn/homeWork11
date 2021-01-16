package ua.ithilel.vvp.menu.base;

public abstract class Item {
    private String name;
    private boolean exit;

    public Item(String name, boolean exit) {
        this.name = name;
        this.exit = exit;
    }

    public Item(String name) {
        this.name = name;
        this.exit=false;
    }

    String getName() {
        return name;
    }

    boolean isExit() {
        return exit;
    }

    public abstract void exec();

}
