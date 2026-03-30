package online_voting_system;

public class OnlineVotingSystem {
	public static void main(String[] args) {

        OnlineElection election = new OnlineElection();

        election.registerVoter(new Voter(1, "Aryansh"));
        election.registerVoter(new Voter(2, "Rohit"));

        election.addCandidate(new Candidate(101, "Candidate A"));
        election.addCandidate(new Candidate(102, "Candidate B"));

        try {
            election.castVote(1, 101);
            election.castVote(2, 102);
            election.castVote(1, 102); 
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        election.declareResult();
	}
}
