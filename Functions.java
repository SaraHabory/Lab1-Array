import java.util.Scanner;

/**
 * Created by TGC on 09/01/2022.
 */
public class Functions {
    public static void main(String[] args) {
        int[] a=new  int[5];
        inputElement(a);
        printElement(a);
        }
        public static void printElement(int[]x)
        {
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]+"\t");
        }

    }


    public static void inputElement(int[]y)
    {
        Scanner in =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            y[i]=in.nextInt();
        }

    }

}
