package voting_system;
import java.util.*;

class VotingSystem {

    private HashMap<String, Integer> voteCount = new HashMap<>();

    private LinkedHashMap<Integer, String> voteOrder = new LinkedHashMap<>();

    private int voteId = 1;

    void castVote(String candidate) {

        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        voteOrder.put(voteId++, candidate);
    }

    void displayVoteCount() {
        System.out.println("Vote Count (HashMap):");
        System.out.println(voteCount);
    }

    void displayVoteOrder() {
        System.out.println("\nVote Order:");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);

        System.out.println("\nSorted Results:");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

