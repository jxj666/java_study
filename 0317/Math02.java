
public class Math01 {
 
    public static void main(String[] args) {
 
        long leftNum1 = cube(3) + cube(4) + cube(5);
        long rightNum1 = cube(6);
 
        if (leftNum1 == rightNum1) {
            System.out.println("等式 3³+4³+5³=6³ 成立");
        } else {
            System.out.println("等式 3³+4³+5³=6³ 不成立");
        }
 
        long leftNum2 = 0;
        for (int i = 6; i <= 69; i++) {
            leftNum2 = leftNum2 + cube(i);
        }
        long rightNum2 = cube(180);
 
        if (leftNum2 == rightNum2) {
            System.out.println("等式 6³+7³+……+69³=180³ 成立");
        } else {
            System.out.println("等式 6³+7³+……+69³=180³ 不成立");
        }
    }
 
    // 计算数的立方
    private static long cube(long factor) {
        return factor * factor * factor;
    }
}