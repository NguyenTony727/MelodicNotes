import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing a music album
class Album {
    private String title;
    private String artist;
    private int rating; // Rating out of 5
    private String review;

    public Album(String title, String artist, int rating, String review) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.review = review;
    }

    @Override
    public String toString() {
        return "Album: " + title + " by " + artist +
               "\nRating: " + rating + "/5" +
               "\nReview: " + review + "\n";
    }
}

// Main app class
public class MelodicNotes {
    private List<Album> albumLogs;
    private Scanner scanner;

    public TuneJournalApp() {
        albumLogs = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Log an album");
            System.out.println("2. View album logs");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    logAlbum();
                    break;
                case 2:
                    viewAlbumLogs();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void logAlbum() {
        System.out.print("Enter album title: ");
        String title = scanner.nextLine();
        System.out.print("Enter artist name: ");
        String artist = scanner.nextLine();
        System.out.print("Enter rating (1-5): ");
        int rating = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter review: ");
        String review = scanner.nextLine();
        albumLogs.add(new Album(title, artist, rating, review));
        System.out.println("Album logged successfully!");
    }

    private void viewAlbumLogs() {
        System.out.println("\nLogged Albums:");
        for (Album album : albumLogs) {
            System.out.println(album);
        }
    }

    public static void main(String[] args) {
        TuneJournalApp app = new TuneJournalApp();
        app.run();
    }
}
