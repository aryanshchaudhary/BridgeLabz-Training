package online_auction_bidding_system;

@SuppressWarnings("serial")
class InvalidBidException extends Exception {
    public InvalidBidException(String message) {
        super(message);
    }
}
