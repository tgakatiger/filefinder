package core;

public class Flag {
    private String name;
    private boolean state;

    public Flag() {
        this.state = false;
        this.name = "";
    }

    public Flag(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void change() {
        this.state = !this.state;
    }

}
