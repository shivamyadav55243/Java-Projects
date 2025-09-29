import java.util.*;

 class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integers separated by spaces: ");
        String input = sc.nextLine();

        String[] nums = input.split(" ");
        List<Integer> numbers = new ArrayList<>();

        // Parsing strings → Integer (Autoboxing via parseInt)
        for (String num : nums) {
            numbers.add(Integer.parseInt(num));
        }

        int sum = 0;
        for (Integer n : numbers) {
            sum += n; // Unboxing: Integer → int
        }

        System.out.println("Sum of integers = " + sum);
    }
}
