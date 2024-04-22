package test1;
import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //계산기
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        int result = 0;
        if(b == '+'){
            result = a + c;
            System.out.println(result);
        }else if(b == '-'){
            result = a - c;
            System.out.println(result);
        }else if(b == '*'){
            result = a * c;
            System.out.println(result);
        }else if(b == '/'){
            result = a / c;
            System.out.println();
        }else{
            System.out.println("err");
        }



    }
}
