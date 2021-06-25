import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args){
        FizzBuzz1();
        // Clever is evil: https://guifroes.com/clever-code-is-bad
        // HW: Stats
    }

    private static void FizzBuzz1(){
        for(int i = 1; i <= 100; i++){
            if(i%15 == 0){
                System.out.println("FizzBuzz");
            } else if(i%3 == 0){
                System.out.println("Fizz");
            } else if(i%5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void FizzBuzz2(){
        for(int i = 1; i <= 100; i++){
            System.out.println(
                    i%15 == 0 ? "FizzBuzz" :
                            i%3 == 0 ? "Fizz" :
                                    i%5 == 0 ? "Buzz" : i);
        }
    }

    private static void FizzBuzz3(){
        IntStream.rangeClosed(1, 100)
                .mapToObj(e -> e%15 == 0 ? "FizzBuzz" : e%3 == 0 ? "Fizz" : e%5 == 0 ? "Buzz" : e)
                .forEach(System.out::println);
    }

    private static void FizzBuzz4(){
        for(int i = 1; i <= 100; i++){
            boolean skip = false;
            if(i%3 == 0){
                System.out.print("Fizz");
            }
            if(i%5 == 0){
                System.out.print("Buzz");
                skip = true;
            }
            if(!skip && i%3 != 0){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
