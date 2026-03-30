package online_voting_system;

class OnlineElection extends ElectionService {

    private Voter[] voters = new Voter[5];
    private Candidate[] candidates = new Candidate[5];
    private Vote[] votes = new Vote[5];

    private int voterCount = 0;
    private int candidateCount = 0;
    private int voteCount = 0;

    // CREATE - Register voter
    @Override
    void registerVoter(Voter voter) {
        voters[voterCount++] = voter;
    }

    // CREATE - Add candidate
    @Override
    void addCandidate(Candidate candidate) {
        candidates[candidateCount++] = candidate;
    }

    // UPDATE - Cast vote
    @Override
    void castVote(int voterId, int candidateId)
            throws DuplicateVoteException {

        Voter voter = null;
        Candidate candidate = null;

        for (int i = 0; i < voterCount; i++) {
            if (voters[i].getVoterId() == voterId) {
                voter = voters[i];
                break;
            }
        }

        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter has already voted!");
        }

        for (int i = 0; i < candidateCount; i++) {
            if (candidates[i].getCandidateId() == candidateId) {
                candidate = candidates[i];
                break;
            }
        }

        candidate.addVote();
        voter.hasVoted();
        votes[voteCount++] = new Vote(voter, candidate);

        System.out.println("Vote cast successfully by " + voter.getVoterName());
    }

    // READ - Declare result
    @Override
    void declareResult() {
        System.out.println("\n📊 Election Results:");
        for (int i = 0; i < candidateCount; i++) {
            System.out.println(candidates[i].getName()
                    + " → Votes: " + candidates[i].getVotes());
        }
    }
}

