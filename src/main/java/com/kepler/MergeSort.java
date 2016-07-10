package com.kepler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauldowney on 7/9/16.
 */
public class MergeSort {

    public static List<Integer> mergeSort(List<Integer> list) {

        if(isSingleElementList(list)) return list;

        List<Integer> lowerList = list.subList(0, list.size()/2);
        List<Integer> upperList = list.subList(list.size()/2, list.size());

        return combineLists(mergeSort(lowerList),mergeSort(upperList));

    }

    private static boolean isSingleElementList(List<Integer> list) {
        return list.size()==1;
    }

    static List<Integer> combineLists(List<Integer> listA, List<Integer> listB) {
        List<Integer> combinedList = new ArrayList<Integer>();
        while(!listA.isEmpty() && !listB.isEmpty()) {
            if (listA.get(0) < listB.get(0)) {
                combinedList.add(listA.get(0));
                listA = listA.subList(1, listA.size());
            } else {
                combinedList.add(listB.get(0));
                listB = listB.subList(1, listB.size());
            }
        }

        if(listA.isEmpty()) {
            combinedList.addAll(listB);
        }

        if(listB.isEmpty()) {
            combinedList.addAll(listA);
        }


        return combinedList;
    }


}
