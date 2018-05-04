package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     * @param index
     * @param object
     */
    public static void print(int index, Object object) {
        System.out.println(String.format("{%d},%s", index, object.toString()));
    }

    public static void demoList() {
        List<String> strList = new ArrayList<String>(10);
        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i * i));
        }
        print(1, strList);
        List<String> strListB = new ArrayList<String>();
        for (int i = 0; i < 4; ++i) {
            strListB.add(String.valueOf(i));
        }
        strList.addAll(strListB);
        print(2, strList);
        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1));
        print(4, strList);
        Collections.reverse(strList);
        print(5, strList);
        Collections.sort(strList);
        print(6, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(8, strList);
        for (String obj : strList) {
            print(9, obj);
        }
    }

    public static void demoMapTable() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 4; ++i) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + "|" + entry.getValue());
            print(3, map.values());
            print(4, map.keySet());
            print(5, map.get("3"));
        }
    }

    public static void demoException() {
        try {
            int k = 2;
//            k = k / 0;
            if (k == 2) {
                throw new Exception("我故意的");
            }
        } catch (Exception e) {
//            e.printStackTrace();
            print(2, e.getMessage());
        } finally {
            print(3, "finally");

        }
    }

    public static void demo00() {
        Animal a = new Animal("JIM", 1);
        a.say();
    }
public static void demoFuntion(){
        Random random=new Random();
//        random.setSeed(1);
        print(1,random.nextInt(1000));
        print(2,random.nextFloat());
        List<Integer> array=Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.shuffle(array);
        print(3,array);
        Date date=new Date();
        print(4,date);
        print(5,date.getTime());
    DateFormat df=new SimpleDateFormat("MM/dd/yyyy");
    print(6,df.format(date));

}
    public static void main(String[] args) {
        // write your code here
//        print(1, "hello world");
//        demoList();
//              demoMapTable();
//        demoException();
//        demo00();
        demoFuntion();
    }
}
