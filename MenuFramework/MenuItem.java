package MenuFramework;

public abstract class MenuItem {
    public enum MenuItemReturnValue {
        EXIT,
        CONTINUE
    }
    String title;

    public MenuItem(String title) {
        this.title = title;
    }

    public String toString() {
        return this.title;
    }

    public abstract MenuItemReturnValue selected();
} 
