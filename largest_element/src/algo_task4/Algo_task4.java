package algo_task4;

public class Algo_task4 {

    static int s[];
    static int n;

    public Algo_task4(int n, int s[]) {
        this.n = n;
        this.s = s;
    }

    public static void main(String[] args) {
        int[] x = {1, 9, 6, 0, 7};
        Algo_task4 task = new Algo_task4(5, x);
        System.out.println(task.largest(0, x.length - 1));
    }

    public static int largest(int low, int high) {
        int mid = 0;
        int leftLarge = 0;
        int rightLarge = 0;

        if (low == high) {
            return s[low];
        } else {
            mid = (low + high) / 2;
            leftLarge = largest(low, mid);
            rightLarge = largest(mid + 1, high);
            if (leftLarge > rightLarge) {
                return leftLarge;
            } else {
                return rightLarge;
            }
        }
    }
}
