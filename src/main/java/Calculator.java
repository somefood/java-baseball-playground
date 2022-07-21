import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

public class Calculator {

    int result = 0;
    Deque<Integer> nums = new LinkedList<>();
    Deque<String> op = new LinkedList<>();

    public int add(Integer a, Integer b) {
        int result = a + b;
        nums.addFirst(result);
        return result;
    }

    public int sub(Integer a, Integer b) {
        int result = a - b;
        nums.addFirst(result);
        return result;
    }

    public int multiply(Integer a, Integer b) {
        int result = a * b;
        nums.addFirst(result);
        return result;
    }

    public int divide(Integer a, Integer b) {
        int result = a / b;
        nums.addFirst(result);
        return result;
    }

    public int calc(String[] values) {
        separate(values);

        for (String s : op) {
            switch (s) {
                case "+":
                    result = add(nums.pollFirst(), nums.pollFirst());
                    break;
                case "-":
                    result = sub(nums.pollFirst(), nums.pollFirst());
                    break;
                case "*":
                    result = multiply(nums.pollFirst(), nums.pollFirst());
                    break;
                case "/":
                    result = divide(nums.pollFirst(), nums.pollFirst());
                    break;
            }
        }
        return result;
    }

    private void separate(String[] values) {
        for (String value : values) {
            try {
                nums.add(Integer.parseInt(value));
            } catch (Exception e) {
                op.add(value);
            }
        }
    }
}
