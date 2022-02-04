import java.util.Scanner;

/**
 * Created by TGC on 09/01/2022.
 */
public class ArrayEnterElements {
    public static void main(String[] args) {
        int[] a=new  int[5];
        Scanner in=new Scanner(System.in);
        for (int i=0; i < 5; i++) {
            a[i]=in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]+"\t");
        }

    }
}
