package com.algorithm.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BankBook {

    public List<Integer> vector = new Vector<>();
    public List<Integer> arrayList = new ArrayList<>();

    public int getAmount() {
        return this.vector.size();
    }
}
