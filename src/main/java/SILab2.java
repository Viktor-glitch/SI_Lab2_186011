public class SILab2 {
    static boolean checkPrime(int n) {//1
        if (n < 0) {//2
            throw new RuntimeException("Number should not be negative");//3
        }
        int m = n / 2;//4
        if (n == 0 || n == 1) {//5
            return false;//6
        } else {//7
            for (int i = 2; i <= m; i++) {//8
                if (n % i == 0) {//9
                    return true;//10
                }
            }
            return false;//11
        }
    }//12
}
