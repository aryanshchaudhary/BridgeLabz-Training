package online_auction_bidding_system;
public class AuctionSystem {

    public static void main(String[] args) {

        try {

            User user1 = new User("U1", "Aryan");
            User user2 = new User("U2", "Riya");
            User user3 = new User("U3", "Karan");

            AuctionItem laptop = new AuctionItem("Gaming Laptop");

            laptop.placeBid(user1, 10000);
            laptop.placeBid(user2, 12000);
            laptop.placeBid(user3, 15000);

            laptop.placeBid(user1, 14000); 

            laptop.showHighestBid();

        } catch (InvalidBidException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
