import java.util.ArrayList;

public class arraylistsubstring {
    public static void main(String[] args) {
        // String str = "mrigank";
        // System.out.println(str);
        // char ch = str.charAt(2);
        // System.out.println(ch);
        // String ss = str.substring(1,3);
        // System.out.println(ss);

        //ArrayList :Dynamic arr
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // for(int val:list){
        //     System.out.println(val);
        // }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list + "->" + list.size());
        list.set(3,200);
        System.out.println(list + "->" + list.size());
        list.add(2,199);
        System.out.println(list + "->" + list.size());
    }
}