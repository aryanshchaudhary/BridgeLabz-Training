package online_auction_bidding_system;
import java.util.*;

class AuctionItem {

    @SuppressWarnings("unused")
	private String itemName;
    private TreeMap<Double, User> bids; 

    public AuctionItem(String itemName) {
        this.itemName = itemName;
        bids = new TreeMap<>();
    }

    public void placeBid(User user, double amount) throws InvalidBidException {
        if (!bids.isEmpty() && amount <= bids.lastKey()) {
            throw new InvalidBidException("Bid must be higher than current highest bid!");
        }
        bids.put(amount, user);
    }

    public void showHighestBid() {
        if (bids.isEmpty()) {
            System.out.println("No bids placed yet.");
        } else {
            double highest = bids.lastKey();
            System.out.println("Highest Bid: " + highest +
                    " by " + bids.get(highest).getName());
        }
    }
}
