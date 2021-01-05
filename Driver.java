import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Shapes.BaseShape;
import Shapes.House;
import Shapes.Tree;
import Shapes.WaterSource;

public class Driver {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> structures = new ArrayList<String>() {
        private static final long serialVersionUID = 1L;

        {
            add("Exit");
            add("House");
            add("Tree");
            add("Water Source");
            add("View village");
        }
    };
    private static BaseShape village = new BaseShape("Village", "Multiple", "Multiple", new ArrayList<>());

    public static void main(String args[]) {
        System.out.println("Welcome to Age of Villagers");

        while (true) {
            showStructureMenu(structures);

            try {
                int option = scanner.nextInt();

                if (option == 0)
                    break;

                performOption(option);
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice! Please re-enter!");
            }
        }

    }

    private static void performOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Building a house in your village!");
                village.addShape(new House());
                break;
            case 2:
                System.out.println("Building a tree in your village!");
                village.addShape(new Tree());
                break;
            case 3:
                System.out.println("Building a water source in your village!");
                village.addShape(new WaterSource());
                break;
            case 4:
                System.out.println("Viewing your village structure");
                village.printDetails(0);
                break;
            default:
                System.out.println("Invalid option entered! Please try again!");
        }
    }

    private static void showStructureMenu(List<String> structures) {
        System.out.println("What would you like to add to your village?");

        for (int i = 0; i < structures.size(); i++) {
            System.out.printf("%d) %s\n", i, structures.get(i));
        }

        System.out.printf("Enter choice: ");
    }
}