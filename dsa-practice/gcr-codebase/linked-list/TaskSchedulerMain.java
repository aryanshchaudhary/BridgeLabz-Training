package circular_linked_list;
import java.time.LocalDate;
class Task {
 int taskId;
 String taskName;
 int priority;
 LocalDate dueDate;
 Task next;

 Task(int taskId, String taskName, int priority, LocalDate dueDate) {
     this.taskId = taskId;
     this.taskName = taskName;
     this.priority = priority;
     this.dueDate = dueDate;
     this.next = null;
 }
}

class TaskScheduler {
 private Task head = null;
 private Task tail = null;
 private Task current = null;

 public void addAtBeginning(int id, String name, int priority, LocalDate date) {
     Task newTask = new Task(id, name, priority, date);

     if (head == null) {
         head = tail = current = newTask;
         newTask.next = head;
     } else {
         newTask.next = head;
         head = newTask;
         tail.next = head;
     }
     System.out.println("Task added at beginning.");
 }

 public void addAtEnd(int id, String name, int priority, LocalDate date) {
     Task newTask = new Task(id, name, priority, date);

     if (head == null) {
         head = tail = current = newTask;
         newTask.next = head;
     } else {
         tail.next = newTask;
         tail = newTask;
         tail.next = head;
     }
     System.out.println("Task added at end.");
 }

 public void addAtPosition(int position, int id, String name, int priority, LocalDate date) {
     if (position <= 1 || head == null) {
         addAtBeginning(id, name, priority, date);
         return;
     }

     Task temp = head;
     for (int i = 1; i < position - 1 && temp.next != head; i++) {
         temp = temp.next;
     }

     Task newTask = new Task(id, name, priority, date);
     newTask.next = temp.next;
     temp.next = newTask;

     if (temp == tail) {
         tail = newTask;
     }

     System.out.println("Task added at position " + position);
 }

 public void removeTask(int taskId) {
     if (head == null) {
         System.out.println("No tasks to remove.");
         return;
     }

     Task currentNode = head;
     Task previous = tail;

     do {
         if (currentNode.taskId == taskId) {

             if (head == tail) {
                 head = tail = current = null;
             }
             else if (currentNode == head) {
                 head = head.next;
                 tail.next = head;
             }
             else if (currentNode == tail) {
                 tail = previous;
                 tail.next = head;
             }
             else {
                 previous.next = currentNode.next;
             }

             System.out.println("Task removed successfully.");
             return;
         }

         previous = currentNode;
         currentNode = currentNode.next;

     } while (currentNode != head);

     System.out.println("Task not found.");
 }

 public void viewAndMoveNext() {
     if (current == null) {
         System.out.println("No tasks available.");
         return;
     }

     displayTask(current);
     current = current.next;
 }

 public void displayAllTasks() {
     if (head == null) {
         System.out.println("No tasks scheduled.");
         return;
     }

     Task temp = head;
     System.out.println("\nScheduled Tasks:");
     do {
         displayTask(temp);
         temp = temp.next;
     } while (temp != head);
 }

 public void searchByPriority(int priority) {
     if (head == null) {
         System.out.println("No tasks available.");
         return;
     }

     Task temp = head;
     boolean found = false;

     do {
         if (temp.priority == priority) {
             displayTask(temp);
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found) {
         System.out.println("No tasks found with priority " + priority);
     }
 }

 private void displayTask(Task t) {
     System.out.println(
             "Task ID: " + t.taskId +
             ", Name: " + t.taskName +
             ", Priority: " + t.priority +
             ", Due Date: " + t.dueDate
     );
 }
}
public class TaskSchedulerMain {
	public static void main(String[] args) {
		TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Design Module", 1, LocalDate.of(2026, 1, 15));
        scheduler.addAtEnd(2, "Write Code", 2, LocalDate.of(2026, 1, 18));
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, LocalDate.of(2026, 1, 10));
        scheduler.addAtPosition(2, 4, "Testing", 3, LocalDate.of(2026, 1, 20));

        scheduler.displayAllTasks();

        System.out.println("\nView Current Task (Round Robin):");
        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);

        scheduler.removeTask(2);
        scheduler.displayAllTasks();
	}
}
