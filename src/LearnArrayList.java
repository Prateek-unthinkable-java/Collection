import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();//it will increase its size by n((n/2)+1)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.add(50);
        System.out.println(list);

        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(5,60);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(110);
        newList.add(120);
        list.addAll(newList);// this will add newList at the last of list
        System.out.println(list);
        System.out.println(list.get(10));//get element by index

        list.remove(3);//remove element by index
        System.out.println(list);

        list.remove(Integer.valueOf(30));//remove element by taking element as argument
        System.out.println(list);

//        list.clear();//this will remove each element from list
//        System.out.println(list);

        list.set(4,1000);//update element by its index
        System.out.println(list);

        System.out.println(list.contains(40));//check element is present or not

        //list traversing
        for(int x: list){
            System.out.print(x);
        }
        System.out.println();
        System.out.println("___________________________");
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
