import org.junit.Test;

import static org.junit.Assert.*;

/*
   This test program is going to display the first 100 pentagonal numbers
   with 10 numbers on each line

*/
public class Assignment_6Test2 {
 @Test
    public void getPentagonalNumber() throws Exception {

     

            for (int i = 1; i <=100; i++){

                System.out.print(Assignment_6.getPentagonalNumber(i) + " ");

                if((i %10) == 0){
                    System.out.println();
                }

            }

    }

}