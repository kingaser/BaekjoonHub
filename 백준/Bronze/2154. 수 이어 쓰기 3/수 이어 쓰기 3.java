import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (int i = 1; i <= Integer.parseInt(s); i++) {
            sb.append(i);
        }

        System.out.println(sb.indexOf(s) + 1);
    }
}