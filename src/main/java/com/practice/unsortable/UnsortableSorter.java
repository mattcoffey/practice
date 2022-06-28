package com.practice.unsortable;

import java.util.Arrays;

public class UnsortableSorter {

    public Object[] sort(Object[] nested) {
        return Arrays.stream(nested).sorted(this::compareUnsortable).toArray();
    }

    private int compareUnsortable(Object a, Object b) {
        if(a instanceof Integer) {
            if(b instanceof Integer) {
                return ((Integer) a).compareTo((Integer) b);
            } else if(b instanceof int[]) {
                return ((Integer) a).compareTo(((int[]) b)[0]);
            }
        } else if(a instanceof int[]) {
            if(b instanceof Integer) {
                return Integer.compare(((int[]) a)[0], ((Integer) b));
            } else if(b instanceof int[]) {
                return Integer.compare(((int[]) a)[0], ((int[]) b)[0]);
            }
        }
        throw new IllegalArgumentException("Can't compare objects in 'unsortable' array " + a.getClass() + " " + b.getClass());
    }
}
