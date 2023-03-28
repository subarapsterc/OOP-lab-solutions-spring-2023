package Lab08;

public class Main {
    public static void main(String[] args) {
        problem01();
        problem02();
        problem03();
    }

    private static void problem01() {
        System.out.println("Problem 1:");
        Manager manager1 = new Manager("manager1", 80000);
        Programmer programmer1 = new Programmer("programmer1", 65000);

        System.out.printf("%s's salary with bonus: %.0f\n", manager1.name, manager1.salary + manager1.calculateBonus());
        manager1.promote(manager1.salary + 15000);
        System.out.printf("%s's new salary with bonus: %.0f\n\n", manager1.name, manager1.salary + manager1.calculateBonus());

        System.out.printf("%s's salary with bonus: %.0f\n", programmer1.name, programmer1.salary + programmer1.calculateBonus());
        programmer1.promote(programmer1.salary + 15000);
        System.out.printf("%s's new salary with bonus: %.0f\n\n", programmer1.name, programmer1.salary + programmer1.calculateBonus());
    }

    private static void problem02() {
        System.out.println("Problem 2:");
        // im tired
        System.out.println();
    }
    private static void problem03() {
        System.out.println("Problem 3:");
        Platypus plat = new Platypus();
        Bat bat = new Bat();
        Chimera chim = new Chimera();

        plat.layEggs();
        plat.giveMilk();

        bat.fly();
        bat.giveMilk();

        chim.breatheWater();
        chim.fly();
        chim.giveMilk();
        chim.layEggs();
    }
}
