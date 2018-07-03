import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {


        final int MARGHERITA_OPTION = 1;
        final int SALAMI_OPTION = 2;
        final int HAWAIIAN_OPTION = 3;
        final int EXIT_MENU = 0;

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int choice;

        Waiter waiter = new Waiter();

        while (!exit) {

            System.out.println("Menu:");
            System.out.println("Margherita = 1");
            System.out.println("Salami = 2");
            System.out.println("Hawaiian = 3");
            System.out.println("Exit menu = 0");
            System.out.println("Your choice:");

            choice = scanner.nextInt();

            switch (choice) {
                case MARGHERITA_OPTION:
                    waiter.setPizzaBuilder(new MargheritaPizzaBuilder());
                    break;
                case SALAMI_OPTION:
                    waiter.setPizzaBuilder(new SalamiPizzaBuilder());
                    break;
                case HAWAIIAN_OPTION:
                    waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
                    break;
                case EXIT_MENU:
                    exit = true;
                    break;
                default:
                    System.out.println("Doesn't exist");
                    break;
            }
            System.out.println(waiter.getPizza());
        }
    }
}

