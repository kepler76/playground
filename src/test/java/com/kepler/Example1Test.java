package com.kepler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by pauldowney on 7/8/16.
 */
public class Example1Test {


    @Test
    public void testBubbleSort() {

        List<Integer> vals = new Sorting().names;

        List<Integer> sortedVals = new ArrayList<Integer>(vals);

        new Sorting().bubbleSort(sortedVals);

        System.out.println(vals);

        System.out.println(sortedVals);
        Collections.sort(vals);


        Assert.assertEquals(vals,sortedVals);
    }


}
