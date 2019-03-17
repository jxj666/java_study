
public class Math01 {
 
    public static void main(String[] args) {
 
        long leftNum1 = cube(3) + cube(4) + cube(5);
        long rightNum1 = cube(6);
 
        if (leftNum1 == rightNum1) {
            System.out.println(" 3?+4?+5?=6? right");
        } else {
            System.out.println(" 3?+4?+5?=6? error");
        }
 
        long leftNum2 = 0;
        for (int i = 6; i <= 69; i++) {
            leftNum2 = leftNum2 + cube(i);
        }
        long rightNum2 = cube(180);
 
        if (leftNum2 == rightNum2) {
            System.out.println(" 6?+7?+......+69?=180? right");
        } else {
            System.out.println(" 6?+7?+......+69?=180? error");
        }
    }
 
    // 计算数的立方
    private static long cube(long factor) {
        return factor * factor * factor;
    }
}