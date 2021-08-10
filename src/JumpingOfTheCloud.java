import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int i=0;
        int count =0;
        while(true){
            if(i>=c.size()-1){
                break;
            }
            if(i+2 <c.size () && c.get(i+2)!=1){
                count++;
                i=i+2;
            }
            else{
                i=i+1;
                count++;
            }
        }
        return count;

    }
}

public class JumpingOfTheCloud {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }
        int result = Result.jumpingOnClouds(c);

        System.out.println(result);
    }
}
//