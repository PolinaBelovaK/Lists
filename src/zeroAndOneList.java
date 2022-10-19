
import java.util.Scanner;
        import java.util.ArrayList;

public class zeroAndOneList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;

        ArrayList<String> list = new ArrayList<>();
        list.add(0,"1");

        while (a < n)
        {
            list.add("0");
            a++;
        }
        list.add("1");
        String formattedString = list.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        System.out.println(formattedString);
    }
}