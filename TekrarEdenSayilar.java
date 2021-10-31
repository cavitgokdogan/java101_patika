public class TekrarEdenSayilar {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 3, 2, 6, 9, 10, 8, 21, 1, 33, 9, 1};
        int[] even = new int[numbers.length];
        int startIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] % 2 == 0)) {
                    even[startIndex++] = numbers[i];
                    break;
                }
            }
        }

        System.out.print("Tekrar eden çift sayılar: ");

        for (int value : even) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
