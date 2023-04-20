package ExceptionHandling;

// Checked and Unchecked Exception

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception11
{
    public static void main(String[] args) throws IOException {
        int result = 7/0;
        System.out.println(result);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String sc = br.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

