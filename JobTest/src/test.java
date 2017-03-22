import java.util.Random;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by luzhang on 2017/3/21
 */

public class test {

    public static void main(String... args) {
//        int[] a = new int[]{1,8,3,2,9};
//        int[] b = doShuffle(a);
//        for (int s : b) {
//            System.out.println(s);
//        }
        String s = "hello world my dear";
        String t = doReverse(s);
        System.out.println(t);
    }

    private static String doReverse(String s) {
        String t = "";
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        Stack<String> stack = new Stack<>();
        while (stringTokenizer.hasMoreTokens()) {
            stack.push(stringTokenizer.nextToken());
        }
        while (!stack.empty()) {
            t +=stack.pop()+" ";
        }

        return t;
    }

    private static int[] doShuffle(int[] a) {
        Random random = new Random();
        int k = 0;
        int[] b = new int[5];
        int length = a.length;
        while (length > 0) {
            int index = random.nextInt(length);
            b[k++] = a[index];
            a[index] = a[length-1];
//            k++;
            length--;
        }
        return b;
    }
}
