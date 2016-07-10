package com.kepler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by pauldowney on 7/9/16.
 */
public class SortTest {

    List<Integer> numberList = new ArrayList<Integer>();

    private static final int LIST_SIZE = 35;

    @Before
    public void setUpList() {
        for(int element=0; element<LIST_SIZE; element++) {
            numberList.add((int)(Math.random()*LIST_SIZE*25));
        }
    }

    @Test
    public void testMergeSort() {

        ArrayList<Integer> sortedArray = new ArrayList<Integer> (numberList);

        Collections.sort(sortedArray);


        Assert.assertEquals(MergeSort.mergeSort(numberList),
                sortedArray);
    }

    @Test
    public void testQuickSort() {

        ArrayList<Integer> sortedArray = new ArrayList<Integer> (numberList);

        Collections.sort(sortedArray);

        Assert.assertEquals(QuickSort.quickSort(numberList),
                sortedArray);
    }


    @Test
    public void testCombineLists() {

        ArrayList<Integer> listA = new ArrayList<Integer>(
                Arrays.asList(1,3,5));

        ArrayList<Integer> listB = new ArrayList<Integer>(
                Arrays.asList(2,4,6));

        List<Integer> combinedList = MergeSort.combineLists(listA, listB);

        ArrayList<Integer> correctCombinedlist = new ArrayList<Integer>(
                Arrays.asList(1,2,3,4,5,6));

        Assert.assertEquals(correctCombinedlist, combinedList);

    }




}
