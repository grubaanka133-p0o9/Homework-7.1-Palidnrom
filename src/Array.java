public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 5, 6};
        boolean isFirstTheLast = true;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == numbers[numbers.length - 1 - index]) {
            } else {
                isFirstTheLast = false;
                break;
            }
        }
        if (isFirstTheLast) {
            System.out.println("Array is a palindrome. ");
        } else {
            System.out.println("Array is not a palindrome.");
        }
    }
}
