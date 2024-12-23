import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        
        String[] tokens = br.readLine().split(" ");
        int[] arr = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(arr);
        
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            int pairSum = arr[i] + arr[2 * N - 1 - i];
            maxSum = Math.max(maxSum, pairSum);
        }
        
        System.out.println(maxSum);
    }
}
