
public class AlgorithmFibonacci {
    public static void main(String[] args) {

        int fn = 10;
        int f1 = 0;
        int f2 = 1;


       for (int i = 0;i < fn;i++) {
            int result = f1 + f2;
            System.out.println(result);
            f1 = f2;
            f2 = result;
        }
    }
}