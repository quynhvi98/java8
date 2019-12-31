import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Posted from Dec 02, 2018, 5:36 PM
 *
 * @author HonorableMan
 */
public class MaxPaiwiseProduct {
    private static long getMaxPairwiseProductFast(int[] numbers) {
        int size = numbers.length;
        int max1stIndex = 0;
        int max2ndIndex = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] >= numbers[max1stIndex]) {
                max2ndIndex = max1stIndex;
                max1stIndex = i;
            }
        }

        if(max1stIndex == 0) {
            max2ndIndex = 1;
            for(int i = 2; i < size; i++) {
                if(numbers[i] > numbers[max2ndIndex]) {
                    max2ndIndex = i;
                }
            }
        }

        return (long) numbers[max1stIndex] * numbers[max2ndIndex];
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProductFast(numbers));
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


