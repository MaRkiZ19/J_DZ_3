package dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * task01
 */
public class task01 {

    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i<20; i++){
            integers1.add(new Random().nextInt(20)+1);
        }
        System.out.println(integers1);
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i =0; i<20; i++){
            if (integers1.get(i) %2!=0 ){
                temp.add(integers1.get(i));
            }
        }
        System.out.println(temp);
        System.out.println(Collections.min(temp));
        System.out.println(Collections.max(temp));
        System.out.println(temp.stream().mapToInt(Integer::intValue).average());
        
    }
}