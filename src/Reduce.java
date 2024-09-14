public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int number = 100;
        while (number != 0) {
            if (number % 2 == 0){
                number = number / 2;
                count += 1;
            }
            else {
                number = number - 1;
                count += 1;
            }
        }
        System.out.println(count);

    }
}
