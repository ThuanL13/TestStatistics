import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Array to contain test scores
        int[] scores = {87, 92, 78, 96, 88, 79, 90, 83, 95, 100};

        // Variable to keep track of total of all scores
        int sum = 0;

        int highScore = scores[0]; // Assuming first is highest initially
        int lowScore = scores[0]; // Assuming first is lowest initially

        // For-each loop
        for (int score : scores) { // Checks if current score is > current highScore
            sum += score; // Adds current score to running sum
            if (score > highScore) { // If score is > highScore
                highScore = score;
            }
            // Checking if current score is < current low score
            if (score < lowScore) {
                lowScore = score; // If score is < lowScore
            }
        }
        // Finding average score
        double average = (double) sum / scores.length;

        // Sorting array
        Arrays.sort(scores);

        // Calculating median with the middle values as there is no singular middle
        double median = (scores[4] + scores[5]) / 2.0;

        //Displaying results
        System.out.println("Average: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
        System.out.println("Median: " + median);



    }
}
