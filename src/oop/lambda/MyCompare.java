package oop.lambda;

import jdk.nashorn.internal.ir.Node;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        Node t;
        return Integer.compare(s.length(), t1.length());
    }
}
