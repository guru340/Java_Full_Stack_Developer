package Sorting;

public class Number implements Comparable<Number>{
    int val;

    public Number(int val) {
        this.val = val;
    }

    @Override
    public int compareTo(Number o) {
        return this.val-o.val;
    }

    @Override
    public String toString() {
        return "Number{" +
                "val=" + val +
                '}';
    }
}
