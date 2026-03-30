package online_auction_bidding_system;
class User {
    @SuppressWarnings("unused")
	private String userId;
    private String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
