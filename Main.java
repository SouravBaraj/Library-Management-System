import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("Python Guide", "Guido van Rossum"));
        library.addBook(new Book("C++ Mastery", "Bjarne Stroustrup"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Show Books\n2. Issue Book\n3. Return Book\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
