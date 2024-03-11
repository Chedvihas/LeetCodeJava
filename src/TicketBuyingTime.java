import java.util.ArrayDeque;
import java.util.Queue;

public class TicketBuyingTime {
    public static int timeToBuyTicket(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> queue = new ArrayDeque<>();

        // Initialize the queue with indices of people
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }


        int[] remainingTickets = tickets.clone();
        int time = 0;

        while (remainingTickets[k] > 0) {
            int currentPerson = queue.poll();
            time++;
            remainingTickets[currentPerson]--;
            if (currentPerson == k && remainingTickets[k] == 0) {
                break;
            }
            // Re-add the person to the queue if they still need to buy tickets
            if (remainingTickets[currentPerson] > 0) {
                queue.add(currentPerson);
            }
        }

        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {5, 1, 1, 1};
        int k = 2;
        System.out.println("Time taken for person at position " + k + " is: " + timeToBuyTicket(tickets, k));
    }
}
