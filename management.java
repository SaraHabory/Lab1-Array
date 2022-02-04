import java.util.Scanner;

/**
 * Created by TGC on 18/01/2022.
 */
public class management {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student1 team[]=new Student1[3];
        for (int i = 0; i <team.length ; i++) {
            Student1 s=new Student1(in.nextInt(),in.next());
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i]+"\t");
        }
    }
}
