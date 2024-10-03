import java.util.Scanner;
import java.util.HashMap;

public class VoteResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> voteCountMap = new HashMap<>();
        String subject;

        // Input subjects
        System.out.println("Enter the voting subjects (type 'done' when finished):");
        while (true) {
            System.out.print("Subject: ");
            subject = input.nextLine();
            if (subject.equalsIgnoreCase("done")) {
                break;
            }
            voteCountMap.put(subject, 0);
        }
        
        // Input voteCountMap for each subject
        for (String voteSubject : voteCountMap.keySet()) {
            System.out.print("Enter the number of voteCountMap for " + voteSubject + ": ");
            int numberOfVotes = input.nextInt();
            voteCountMap.put(voteSubject, numberOfVotes);
        }
        
        // Output the results
        System.out.println("\nVoting Results:");
        for (String voteSubject : voteCountMap.keySet()) {
            System.out.println(voteSubject + ": " + voteCountMap.get(voteSubject) + " voteCountMap");
        }
        
        input.close();
    }
}
