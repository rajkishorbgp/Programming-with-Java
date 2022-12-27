import java.util.ArrayList;

public class Insert_in_Heap {
    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(Integer data) {
            // add at last idx
            arr.add(data);
            int chil = arr.size() - 1; // child index
            int pare = (chil - 1) / 2; // par index
            while (arr.get(pare) > arr.get(chil)) {
                // swap
                Integer temp = arr.get(chil);
                arr.set(chil, arr.get(pare));
                arr.set(pare, temp);

                chil = pare;
                pare = (chil - 1) / 2;
            }
        }

        public Integer peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public Integer remove() {
            Integer data = arr.get(0);

            // step1: swap first & lest
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2: delete last
            arr.remove(arr.size() - 1);

            // step3: heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(8);
        h.add(2);
        h.add(4);
        h.add(5);
        h.add(7);
        h.add(3);
        while (!h.isEmpty()) {
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}

/*
 * Output:
 * 2 3 4 5 7 8
 */