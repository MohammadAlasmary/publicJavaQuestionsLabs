package lab4;
import java.util.Scanner;
public class Q0 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Employee 1
            String name1 = null;
            int id1 = 0;
            String role1 = null;
            double salary1 = 0;
            double bonus1 = 0;
            boolean exists1 = false;

            // Employee 2
            String name2 = null;
            int id2 = 0;
            String role2 = null;
            double salary2 = 0;
            double bonus2 = 0;
            boolean exists2 = false;

            while (true) {
                System.out.println("\n--- Employee Menu ---");
                System.out.println("1. Enter Employee Info");
                System.out.println("2. Display All Employees");
                System.out.println("3. Update Bonus or Salary");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        if (!exists1) {
                            System.out.println("Enter info for Employee 1:");
                            System.out.print("Name: ");
                            name1 = scanner.nextLine();
                            System.out.print("ID: ");
                            id1 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Role: ");
                            role1 = scanner.nextLine();
                            System.out.print("Salary: ");
                            salary1 = scanner.nextDouble();
                            System.out.print("Bonus: ");
                            bonus1 = scanner.nextDouble();
                            scanner.nextLine();
                            exists1 = true;
                            System.out.println("Employee 1 added.");
                        } else if (!exists2) {
                            System.out.println("Enter info for Employee 2:");
                            System.out.print("Name: ");
                            name2 = scanner.nextLine();
                            System.out.print("ID: ");
                            id2 = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Role: ");
                            role2 = scanner.nextLine();
                            System.out.print("Salary: ");
                            salary2 = scanner.nextDouble();
                            System.out.print("Bonus: ");
                            bonus2 = scanner.nextDouble();
                            scanner.nextLine();
                            exists2 = true;
                            System.out.println("Employee 2 added.");
                        } else {
                            System.out.println("Both employee slots are filled.");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Employee Info ---");
                        if (exists1) {
                            System.out.println("Name: " + name1);
                            System.out.println("ID: " + id1);
                            System.out.println("Role: " + role1);
                            System.out.println("Total Salary: " + (salary1 + bonus1));
                            System.out.println("----------------------");
                        }
                        if (exists2) {
                            System.out.println("Name: " + name2);
                            System.out.println("ID: " + id2);
                            System.out.println("Role: " + role2);
                            System.out.println("Total Salary: " + (salary2 + bonus2));
                            System.out.println("----------------------");
                        }
                        if (!exists1 && !exists2) {
                            System.out.println("No employees entered yet.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter employee ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        boolean updated = false;

                        if (exists1 && updateId == id1) {
                            System.out.println("1. Update Salary");
                            System.out.println("2. Update Bonus");
                            int updateChoice = scanner.nextInt();
                            scanner.nextLine();
                            if (updateChoice == 1) {
                                System.out.print("New Salary: ");
                                salary1 = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Salary updated.");
                            } else if (updateChoice == 2) {
                                System.out.print("New Bonus: ");
                                bonus1 = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Bonus updated.");
                            }
                            updated = true;
                        } else if (exists2 && updateId == id2) {
                            System.out.println("1. Update Salary");
                            System.out.println("2. Update Bonus");
                            int updateChoice = scanner.nextInt();
                            scanner.nextLine();
                            if (updateChoice == 1) {
                                System.out.print("New Salary: ");
                                salary2 = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Salary updated.");
                            } else if (updateChoice == 2) {
                                System.out.print("New Bonus: ");
                                bonus2 = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Bonus updated.");
                            }
                            updated = true;
                        }

                        if (!updated) {
                            System.out.println("Employee ID not found.");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting program. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
        }
}
