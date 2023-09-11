public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }

        }

        System.out.println("There are " + count + " numbers divisible by 3 or 5 between 1 and 1000.");

    }
}