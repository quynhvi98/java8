package coursera.algorithmic.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Posted from Dec 02, 2018, 10:26 AM
 *
 * @author Vi Quynh (vi.quynh.31598@gmail.com)
 */
public class readData {
    public static void main(String args[])
            throws IOException
    {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Cho mot so nguyen: ");
        String st=new String (cin.readLine());
        int a= Integer.parseInt(st);
        System.out.println("So do la "+" "+a);
        System.out.println("Cho mot so thuc");
        st=new String(cin.readLine());
        float b = new Float(st).floatValue();
        System.out.println("So do la: "+" "+ b );
    }
}
