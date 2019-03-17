package test;
import java.util.Scanner;
class Math01{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数");
        int a = scanner.nextInt();
        int  x[]=new int[a];
        long sum = 0;
        int i=0,j=0,k=0;
        for (i = 0; i < a; i++)
            x[i] = i * i * i;
        for (i = 2; i < a; i++)
            for (j = 1; j < i; j++)
                for (k = j; k < i; k++)
                {
                    sum += x[k];
                    if (sum == x[i])
                    {
                        System.out.printf("%d^3 + ...... + %d^3 = %d^3\n", j, k, i);
                        sum = 0;
                        break;
                    }
                    if (k + 1 == i)
                    {
                        sum = 0;
                        break;
                    }

                }
    }
}
