package com.nhlstenden.algorithmic.bigo;

public class timeComplexity
{
    private int i;
    private int j;

    public timeComplexity(int i, int j)
    {
        this.i = i;
        this.j = j;
    }

    public int getFactorial() {
        int factorial = 1;
        for (int k = 1; k <= i; k++ ) {
            factorial *= k;
        }
        return factorial;
    }

    public String getFibonacci() {
        int n = 0;
        int m = 1;
        for (int k = 0; k < i; k++ ) {
            int next = m + j;
            n = m;
            m = next;
        }
        return "Fibonacci is " + n + m;
    }

    public double getMean() {
        int[] arr = new int[i];
        int sum = 0;
        for (int k = 0; k < arr.length; k++ ) {
            sum += arr[k];
        }
        return (double) sum / arr.length;
    }
}
