// Max Maslov
// 10/3/2024
// SDEV301

import java.util.Scanner;
import java.util.HashMap;

public class VoteResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> voteCountMap = new HashMap<>(); // hashmap to store results
        String subject; // string variable to store user input for the keyset

        // input subjects
        System.out.println("Enter the voting subjects (type 'done' when finished):");
        while (true) {
            System.out.print("Subject: ");
            subject = input.nextLine();
            if (subject.equalsIgnoreCase("done")) {
                break;
            }
            voteCountMap.put(subject, 0);
        }
        
        // input votes
        for (String voteSubject : voteCountMap.keySet()) {
            System.out.print("Enter the number of votes for " + voteSubject + ": ");
            int numberOfVotes = input.nextInt();
            voteCountMap.put(voteSubject, numberOfVotes);
        }
        
        // print results
        System.out.println("Voting Results:");
        for (String voteSubject : voteCountMap.keySet()) {
            System.out.println(voteSubject + ": " + voteCountMap.get(voteSubject) + " votes");
        }
        
        input.close();
    }
}
