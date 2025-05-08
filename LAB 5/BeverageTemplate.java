class Rum {
    private void pour() {
        System.out.println("Pour the Bond rum in a glass");
    }
}

abstract class Beverage {
    private void pour(int qty) {
        System.out.println("Pour " + qty + "ml of beverage in a glass");
    }

    protected abstract void addCondiment();

    protected void stir() {}

    private void serve() {
        System.out.println("Serve through waiter");
    }

    public void templateMethod(int qty) {
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}

class Whisky extends Beverage {
    protected void addCondiment() {
        System.out.println("Add some ice");
    }

    protected void stir() {
        System.out.println("Stir it for some time");
    }
}

public class BeverageTemplate {
    public static void main(String[] args) {
        Beverage whisky = new Whisky();
        whisky.templateMethod(60);
    }
}
