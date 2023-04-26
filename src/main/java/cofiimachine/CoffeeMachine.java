package cofiimachine;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int money;

    public CoffeeMachine() {
        water = 0;
        milk = 0;
        beans = 0;
        money = 0;
    }

    public void fill(int addedWater, int addedMilk, int addedBeans) {
        water += addedWater;
        milk += addedMilk;
        beans += addedBeans;
    }

    public void take() {
        System.out.println("Money taken: $" + money);
        money = 0;
    }

    public void show() {
        System.out.println("Water: " + water + "ml\nMilk: " + milk + "ml\nBeans: " + beans + "g\nMoney: $" + money);
    }

    public boolean canMakeCoffee(int waterNeeded, int milkNeeded, int beansNeeded) {
        if (water >= waterNeeded && milk >= milkNeeded && beans >= beansNeeded) {
            return true;
        }
        System.out.println("Error: Not enough ingredients!");
        return false;
    }

    public void makeCoffee(int waterNeeded, int milkNeeded, int beansNeeded, int price) {
        if (canMakeCoffee(waterNeeded, milkNeeded, beansNeeded)) {
            System.out.println("Dispensing coffee...");
            water -= waterNeeded;
            milk -= milkNeeded;
            beans -= beansNeeded;
            money += price;
        }
    }
}
