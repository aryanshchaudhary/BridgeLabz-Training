package linked_list;
import java.util.Scanner;

class FriendNode {
	int friendId;
	FriendNode next;

	FriendNode(int friendId) {
		this.friendId = friendId;
		this.next = null;
	}
}

class UserNode {
	int userId;
	String name;
	int age;
	FriendNode friends; 
	UserNode next;

	UserNode(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friends = null;
		this.next = null;
	}
}

public class SocialMediaFriendConnections {

	static UserNode head = null;
	
	static void addUser(int id, String name, int age) {
		UserNode newUser = new UserNode(id, name, age);
		if (head == null) {
			head = newUser;
		} else {
			UserNode temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newUser;
		}
		System.out.println("User added successfully!");
	}

	static UserNode findUserById(int id) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.userId == id)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	static void searchUserByName(String name) {
		UserNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				System.out.println("User Found: ID=" + temp.userId + ", Age=" + temp.age);
				found = true;
			}
			temp = temp.next;
		}
		if (!found)
			System.out.println("User not found!");
	}

	static void addFriend(int user1, int user2) {
		UserNode u1 = findUserById(user1);
		UserNode u2 = findUserById(user2);

		if (u1 == null || u2 == null) {
			System.out.println("One or both users not found!");
			return;
		}

		u1.friends = addFriendToList(u1.friends, user2);
		u2.friends = addFriendToList(u2.friends, user1);

		System.out.println("Friend connection added!");
	}

	static FriendNode addFriendToList(FriendNode head, int id) {
		FriendNode newNode = new FriendNode(id);
		if (head == null)
			return newNode;

		FriendNode temp = head;
		while (temp.next != null) {
			if (temp.friendId == id)
				return head;
			temp = temp.next;
		}
		temp.next = newNode;
		return head;
	}

	static void removeFriend(int user1, int user2) {
		UserNode u1 = findUserById(user1);
		UserNode u2 = findUserById(user2);

		if (u1 == null || u2 == null) {
			System.out.println("User not found!");
			return;
		}

		u1.friends = removeFromList(u1.friends, user2);
		u2.friends = removeFromList(u2.friends, user1);

		System.out.println("Friend connection removed!");
	}

	static FriendNode removeFromList(FriendNode head, int id) {
		if (head == null)
			return null;

		if (head.friendId == id)
			return head.next;

		FriendNode temp = head;
		while (temp.next != null) {
			if (temp.next.friendId == id) {
				temp.next = temp.next.next;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	static void displayFriends(int userId) {
		UserNode user = findUserById(userId);
		if (user == null) {
			System.out.println("User not found!");
			return;
		}

		System.out.print("Friends of " + user.name + ": ");
		FriendNode temp = user.friends;
		if (temp == null) {
			System.out.println("No friends");
			return;
		}

		while (temp != null) {
			System.out.print(temp.friendId + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	static void mutualFriends(int user1, int user2) {
		UserNode u1 = findUserById(user1);
		UserNode u2 = findUserById(user2);

		if (u1 == null || u2 == null) {
			System.out.println("User not found!");
			return;
		}

		System.out.print("Mutual Friends: ");
		FriendNode f1 = u1.friends;
		boolean found = false;

		while (f1 != null) {
			FriendNode f2 = u2.friends;
			while (f2 != null) {
				if (f1.friendId == f2.friendId) {
					System.out.print(f1.friendId + " ");
					found = true;
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}

		if (!found)
			System.out.print("None");
		System.out.println();
	}

	static void countFriends() {
		UserNode temp = head;
		while (temp != null) {
			int count = 0;
			FriendNode f = temp.friends;
			while (f != null) {
				count++;
				f = f.next;
			}
			System.out.println(temp.name + " has " + count + " friends.");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		addUser(1, "Alice", 22);
		addUser(2, "Bob", 23);
		addUser(3, "Charlie", 24);
		addUser(4, "David", 25);

		addFriend(1, 2);
		addFriend(1, 3);
		addFriend(2, 3);
		addFriend(2, 4);

		displayFriends(1);
		displayFriends(2);

		mutualFriends(1, 2);

		removeFriend(1, 2);
		displayFriends(1);

		searchUserByName("Alice");
		countFriends();

		sc.close();
	}
}
