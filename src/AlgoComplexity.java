import java.util.List;

public class AlgoComplexity {
    public static void main(String[] args){

    }

    // O(1)
    public static boolean isNumberGreaterThanOne(int n) {
        return n > 1;
    }

    // O(n)
    public static boolean containsA(String str){
        for(char c : str.toCharArray()){
            if(c == 'A'){
                return true;
            }
        }
        return false;
    }

    // O(n^2)
    public static boolean containsDuplicateChars(String str){
        for(char c1 : str.toCharArray()){
            for(char c2: str.toCharArray()){
                if(c1 == c2){
                    return true;
                }
            }
        }
        return false;
    }

    // O(2^n) *Hard to visualize*
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }

    // O(log n)
    public static boolean containsNumber(List<Integer> numbers, int comparisonNumber) {
        int low = 0;
        int high = numbers.size() - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (comparisonNumber < numbers.get(middle)) {
                high = middle - 1;
            } else if (comparisonNumber > numbers.get(middle)) {
                low = middle + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    //log linear and factorial will be covered later
}
