package com.example.sorting.test;
import com.example.sorting.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    private SortContext context;

    @Before
    public void setUp() {
        context = new SortContext();
    }

    @Test
    public void testQuickSortCorrectness() {
        context.setStrategy(new QuickSort());
        assertArrayEquals(new int[]{}, context.sort(new int[]{}));
        assertArrayEquals(new int[]{42}, context.sort(new int[]{42}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, context.sort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, context.sort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, context.sort(new int[]{64, 34, 25, 12, 22, 11, 90}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 5, 5}, context.sort(new int[]{5, 1, 5, 3, 5, 2, 1}));
    }

    @Test
    public void testMergeSortCorrectness() {
        context.setStrategy(new MergeSort());
        assertArrayEquals(new int[]{}, context.sort(new int[]{}));
        assertArrayEquals(new int[]{42}, context.sort(new int[]{42}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, context.sort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, context.sort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, context.sort(new int[]{64, 34, 25, 12, 22, 11, 90}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 5, 5}, context.sort(new int[]{5, 1, 5, 3, 5, 2, 1}));
    }

    @Test
    public void testBubbleSortCorrectness() {
        context.setStrategy(new BubbleSort());
        assertArrayEquals(new int[]{}, context.sort(new int[]{}));
        assertArrayEquals(new int[]{42}, context.sort(new int[]{42}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, context.sort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, context.sort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, context.sort(new int[]{64, 34, 25, 12, 22, 11, 90}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 5, 5}, context.sort(new int[]{5, 1, 5, 3, 5, 2, 1}));
    }

    @Test
    public void testPerformance() {
        int[] largeArray = new int[10000];
        for (int i = 0; i < 10000; i++) {
            largeArray[i] = 10000 - i;
        }

        long timeThreshold = 500;  // in milliseconds

       
        context.setStrategy(new QuickSort());
        long startTime = System.currentTimeMillis();
        context.sort(largeArray.clone());
        long duration = System.currentTimeMillis() - startTime;
        assertTrue("QuickSort took too long: " + duration + " ms", duration < timeThreshold);

       
        context.setStrategy(new MergeSort());
        startTime = System.currentTimeMillis();
        context.sort(largeArray.clone());
        duration = System.currentTimeMillis() - startTime;
        assertTrue("MergeSort took too long: " + duration + " ms", duration < timeThreshold);

        context.setStrategy(new BubbleSort());
        startTime = System.currentTimeMillis();
        context.sort(largeArray.clone());
        duration = System.currentTimeMillis() - startTime;
        assertTrue("BubbleSort took too long: " + duration + " ms", duration < timeThreshold);
    }

}
