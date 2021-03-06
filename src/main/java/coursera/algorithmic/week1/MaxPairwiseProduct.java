package coursera.algorithmic.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Posted from Dec 02, 2018, 10:51 AM
 *
 * @author Vi Quynh (vi.quynh.31598@gmail.com)
 */

public class MaxPairwiseProduct {

    static long getMaxPairwiseProductFast(int[] numbers) {
        int nSize = numbers.length;
        int max_index1 = -1;
        for (int i = 0; i < nSize; i++) {
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;
        }
        int max_index2 = -1;
        for (int j = 0; j < nSize; j++) {
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
                max_index2 = j;
        }
        return (long) numbers[max_index1] * numbers[max_index2];
    }

    static long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((long) numbers[i] * numbers[j] > result) {
                    result = (long) numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));

        // stress test
//        while (true) {
//            Random ran = new Random();
//            int max = 6;
//            int min = 3;
//            int randomNum = ran.nextInt((max - min) + 1) + min;
//            System.out.println("Random number: " + randomNum);
//            int[] list = new int[randomNum];
//            for (int i = 0; i < randomNum; i++) {
//                list[i] = ran.nextInt((10) + 1);
//                System.out.println(list[i]);
//            }
//            System.out.println("");
//            double result1 = getMaxPairwiseProduct(list);
//            double result2 = getMaxPairwiseProductFast(list);
//            if (result1 != result2) {
//                System.out.println("Error! slow:  " + result1 + " fast: " + result2);
//                break;
//            } else {
//                System.out.println("OK");
//            }
//        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
