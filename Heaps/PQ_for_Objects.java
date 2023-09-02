import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_for_Objects {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("raj", 20));
        pq.add(new Student("Amarjeet", 30));
        pq.add(new Student("amress", 15));
        pq.add(new Student("RajKishoe", 5));
        pq.add(new Student("rohan", 6));
        pq.add(new Student("Aman", 10));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + ": " + pq.peek().rank);
            pq.remove();
        }
    }
}

/*
 * Output:
 * 
 * // * RajKishoe: 5
 * // * rohan: 6
 * // * Aman: 10
 * // * amress: 15
 * // * raj: 20
 * // * Amarjeet: 30
 * 
 * Amarjeet: 30
 * raj: 20
 * amress: 15
 * Aman: 10
 * rohan: 6
 * RajKishoe: 5
 */