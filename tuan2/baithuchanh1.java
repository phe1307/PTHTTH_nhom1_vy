package tuan2;

public class baithuchanh1 
    extends Thread {
    @Override
    public void  run() {
        for (int i=0; i<5; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            System.out.println("Random number is : " + randomInt);
        }
    }

    public class start {
    }
}
class C
 {

public static void main(String[] args) {

    new baithuchanh1().start();

    
}
 }
