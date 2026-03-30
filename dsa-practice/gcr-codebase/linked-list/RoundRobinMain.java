package circular_linked_list;
class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    Process next;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);

        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        System.out.println("Process added: PID " + pid);
    }

    private void displayProcesses() {
        if (head == null) {
            System.out.println("No processes left.");
            return;
        }

        Process temp = head;
        do {
            System.out.print("[PID " + temp.pid +
                    " | Remaining " + temp.remainingTime + "] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    private void removeProcess(Process prev, Process current) {
        if (current == head && current == tail) {
            head = tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }
    }

    public void simulate() {
        if (head == null) return;

        int currentTime = 0;
        int totalProcesses = countProcesses();
        int completed = 0;

        Process current = head;
        Process prev = tail;

        while (completed < totalProcesses) {

            if (current.remainingTime > 0) {
                int executionTime = Math.min(timeQuantum, current.remainingTime);
                currentTime += executionTime;
                current.remainingTime -= executionTime;

                Process temp = head;
                do {
                    if (temp != current && temp.remainingTime > 0) {
                        temp.waitingTime += executionTime;
                    }
                    temp = temp.next;
                } while (temp != head);
                
                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    completed++;
                    removeProcess(prev, current);
                    current = prev.next;
                } else {
                    prev = current;
                    current = current.next;
                }

                displayProcesses();
            }
        }

        calculateAverages(totalProcesses);
    }

    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    private void calculateAverages(int total) {
        double totalWT = 0;
        double totalTAT = 0;

        Process temp = head;
        if (temp == null) return;

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\nAverage Waiting Time: " + (totalWT / total));
        System.out.println("Average Turnaround Time: " + (totalTAT / total));
    }
}
public class RoundRobinMain {
	public static void main(String[] args) {
		 RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

	        scheduler.addProcess(1, 10, 1);
	        scheduler.addProcess(2, 5, 2);
	        scheduler.addProcess(3, 8, 1);

	        System.out.println("\nScheduling Start");
	        scheduler.simulate();
	}
}
