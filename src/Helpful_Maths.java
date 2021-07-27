import java.util.*;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i=i+2) {
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        int count=0;
        for (char i:list) {
            System.out.print(i);
            if (count<list.size()-1){
                System.out.print("+");
            }
            count++;
        }


    }
}
