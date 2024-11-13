package lv.rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int newnumber) {
        this.count = this.count + 1;
        this.sum = this.sum + newnumber;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return 1.0 * this.sum/this.count;

    }
}