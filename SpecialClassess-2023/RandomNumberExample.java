public class RandomNumberExample {
    public static void main(String[] args) {
     
        double randomDouble = Math.random();
        System.out.println("Random Double: " + randomDouble * 100);

     
        int randomIntWithinRange = (int) (Math.random() * 100);
        System.out.println("Random Integer (0-99): " + randomIntWithinRange);
    }
}