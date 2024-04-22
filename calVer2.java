package test1;
import java.util.Scanner;
public class calVer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] tt = new char[]{'+','-','*','/'};
        System.out.println("---------계산기 프로그램 --------");
        System.out.println("번호를 입력해주세요 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
        int first = sc.nextInt();
        System.out.println("계산할 수를 입력하세요");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        switch (first) {
            case 1:
                result = x+y;
                break;
            case 2:
                result = x-y;
                break;
            case 3:
                result = x*y;
                break;
            case 4:
                result = x/y;
                break;
            default:
                System.out.println("잘못입력");
        }
        System.out.println("결과값 = " + result);
    }
}
