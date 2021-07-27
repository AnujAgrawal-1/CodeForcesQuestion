import java.util.Arrays;
import java.util.Scanner;

public class StringTask {

    public void stringTask(String str){
        String str1 =null;
        char [] arr ={'A','O', 'Y', 'E', 'U', 'I','a','o', 'y', 'e', 'u', 'i'};
        for (int i = 0; i <str.length() ; i++) {
            String str2 = String.valueOf(str.charAt(i));
            if (!("AoyeuiAOYEUI".contains(str2))){
                str1=str1.concat("."+str2.toLowerCase());
            }
     }
        System.out.println(str1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTask st = new StringTask();
        st.stringTask(str);
    }


}
