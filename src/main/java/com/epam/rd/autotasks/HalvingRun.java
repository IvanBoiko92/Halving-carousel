package com.epam.rd.autotasks;

public class HalvingRun extends CarouselRun {

    @Override
    public int next() {
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        int temp = array[position];
        array[position] /= 2;
        position++;
        return temp;
    }

    @Override
    public boolean isFinished() {
        for (int el : array)
            if ((el > 0)||(el < 0))
                return false;
        return true;
    }
}
