public class Main {
    public static void main(String[] args) {
        int i;

        for(i=1; i<=100; i++)
        {
            if (i == 42) {
                System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
            }
            else if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else if (i%3 == 0 ) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}

