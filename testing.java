import java.util.Random;

public class testing{

    public static void main(String[] args) {
        
        System.out.println("Hello World!");

        Random rand = new Random();

        //This is a comment

        /**
         * Big Comment
         * 
         * 
         * 
         * See told you it was big
         * (That's what she said)
         */

        for(int i = 0; i < 10; i++){

            int randnum = rand.nextInt(0, 10);

            System.out.println("Random Number: " + randnum);

        }

    }

}