/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap_task2;

/**
 *
 * @author ozzxx
 */
public class Lap_task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(iterativeFib(5));
         System.out.println(recursiveFib(5));
    }

    public static int recursiveFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }

    }

    public static int iterativeFib(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        if (n > 0) {
            f[1] = 1;
            for (int i = 2; i < f.length; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f[n];
    }

}
