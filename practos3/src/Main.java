import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("Запишите палиндром: ");
            String predlojenie = in.nextLine();
            char[] text = predlojenie.replaceAll("\\s", "").toLowerCase().toCharArray();
            int i = 0;
            int a = text.length - 1;
            System.out.println(text);
            boolean f = true;
            while (i!=a & i<a )
            {
                if (text[i] == text[a]) {
                    i = i + 1;
                    a = a - 1;
                } else {
                    f = false;
                    System.out.print("это не полиндром");
                    break;}
            }
            if (f) System.out.println("это полиндром");
            else break;
        }
    }
}