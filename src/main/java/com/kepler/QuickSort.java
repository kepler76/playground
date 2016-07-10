package com.kepler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauldowney on 7/9/16.
 */
public class QuickSort {

    public static List<Integer> quickSort(List<Integer> list) {

        if(isSingleElementList(list)) return list;

        // Calculate Pivot

        int pivot = list.get(0);


        ArrayList<Integer> lowerList = new ArrayList<Integer>();
        ArrayList<Integer> upperList = new ArrayList<Integer>();

        for(int count=1;count<list.size();count++) {
            if(list.get(count)<pivot)
                lowerList.add(list.get(count));
            else
                upperList.add(list.get(count));
        }

        return combineLists(quickSort(lowerList), pivot, quickSort(upperList));

    }

    private static boolean isSingleElementList(List<Integer> list) {
        return list.size()<=1;
    }

    static List<Integer> combineLists(List<Integer> listA, int pivot, List<Integer> listB) {
        List<Integer> combinedList = new ArrayList<Integer>();
        combinedList.addAll(listA);
        combinedList.add(pivot);
        combinedList.addAll(listB);
        return combinedList;
    }


}
