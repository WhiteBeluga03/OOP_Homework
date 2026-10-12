import java.util.Scanner;

public class Homework4 {

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        
        int smaller = Math.min(m, n);
        int larger = Math.max(m, n);
        
        return gcd(smaller, larger % smaller);
    }

    public static int gcdIterative(int m, int n) {
        while (n != 0) {
            int smaller = Math.min(m, n);
            int larger = Math.max(m, n);
            m = smaller;
            n = larger % smaller;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int recursiveResult = gcd(m, n);
        System.out.println("최대공약수 (재귀 방식): " + recursiveResult);

        int iterativeResult = gcdIterative(m, n);
        System.out.println("최대공약수 (반복문 방식): " + iterativeResult);

        scanner.close();
    }
}