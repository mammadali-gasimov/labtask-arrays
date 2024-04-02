public class Main {
    public static void main(String[] args) {
        int[] numbers = {21, 24, 19, 13, 200, 24, 21, 36};

        // ---- Task 1 ------
        int[] numbersCopy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];
        }

        // ------ Task 2 ---------
        int length = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count < 2) {
                length++;
            }
        }

        int[] uniques = new int[length];
        int countUnique = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count < 2 && countUnique < length) {
                uniques[countUnique] = numbers[i];
                countUnique++;
            }
        }

        for (int n : uniques) {
            System.out.print(n + " ");
        }
    }
}