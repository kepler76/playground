package com.kepler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauldowney on 7/8/16.
 */
public class Sorting {

List<Integer> names = new ArrayList<Integer>();

public Sorting() {

    names.add(7);
    names.add(1);
    names.add(6);
    names.add(3);
}



List<Integer> bubbleSort(List<Integer> list) {

    for(int iter=0;iter<list.size()-1;iter++)
        for(int count=0;count<list.size()-1;count++) {
            if(compare(list.get(count), list.get(count+1))==true) {
                swap(list, count, count+1);
            }

        }

    return list;

}

boolean compare(int elementA, int elementB) {
    return elementA>elementB;
}

void swap(List<Integer> list, int indexA, int indexB) {

    int temp = list.get(indexA);

    list.set(indexA, list.get(indexB));
    list.set(indexB, temp);
}

public static void main(String[] args) {

    List<Integer> vals = new Sorting().names;

    System.out.println(vals);
    System.out.println(new Sorting().bubbleSort(vals));

}


}
