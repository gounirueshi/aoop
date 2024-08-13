package com.example.sorting;

public class SortContext {
	private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int[] data) {
        return strategy.sort(data);
    }

}
