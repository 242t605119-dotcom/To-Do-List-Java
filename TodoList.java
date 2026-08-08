import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();

                tasks.add(task);
                System.out.println("Task added!");

            } else if (choice == 2) {

                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                } else {
                    System.out.println("\nYour Tasks:");

                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }

            } else if (choice == 3) {

                if (tasks.isEmpty()) {
                    System.out.println("No tasks to remove.");
                } else {
                    System.out.print("Enter task number to remove: ");
                    int number = sc.nextInt();

                    if (number >= 1 && number <= tasks.size()) {
                        tasks.remove(number - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
