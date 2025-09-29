import java.util.*;

class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers separated by spaces: ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of integers = " + sum);
    }
}
