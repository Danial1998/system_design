import java.util.*;

// Theater Class
class Theater {
    private String name;
    private List<Screen> screens;

    public Theater(String name) {
        this.name = name;
        this.screens = new ArrayList<>();
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public List<Screen> getScreens() {
        return screens;
    }
}