package com.training.collections.internal.list;

public class ArrayListWorking {
    /**
     * 🔹 Example
     *
     *  ArrayList<Integer> list = new ArrayList<>();
     *  Internally → elementData = new Object[10] (default capacity = 10).
     *
     *  size = 0.
     *
     * 🔹 Adding elements one by one
     *  Step 1 → Add first element
     *  size = 0, capacity = 10.
     *
     * Enough room → element goes to elementData[0].
     *
     * Now: size = 1.
     *
     * Step 2 → Add until 10th element
     * You keep adding…
     *
     * At 10th element → size = 10, capacity = 10.
     *
     * Still fits perfectly.
     *
     * Step 3 → Add 11th element
     * Now size = 10, but capacity = 10 → array full.
     *
     * ensureCapacity(11) is called.
     *
     * grow() makes new capacity = 10 + (10 / 2) = 15.
     *
     * Old 10 elements are copied to new array of length 15.
     *
     * 11th element is added.
     *
     * Now: size = 11, capacity = 15.
     *
     * Step 4 → Keep adding until 15th element
     * Fits without issue.
     *
     * At 15th → full again.
     *
     * Step 5 → Add 16th element
     * Now size = 15, capacity = 15.
     *
     * Full → grow() called.
     *
     * New capacity = 15 + (15 / 2) = 22.
     *
     * Old 15 copied → new array of length 22.
     *
     * 16th element added.
     *
     * Now: size = 16, capacity = 22.
     *
     * Step 6 → Add until 22nd element
     * Fits.
     *
     * At 22nd → full again.
     *
     * Step 7 → Add 23rd element
     * Now capacity = 22.
     *
     * grow() → 22 + (22 / 2) = 33.
     *
     * Copy elements → add new one.
     *
     * Capacity = 33.
     *
     * 🔹 Growth Pattern
     * Capacity grows as:
     * 10 → 15 → 22 → 33 → 49 → 73 → 109 → … (about 1.5x each time).
     *
     * ✅ So in short:
     *
     * First 10 elements → no resize.
     *
     * 11th element → resize to 15.
     *
     * 16th element → resize to 22.
     *
     * 23rd element → resize to 33.
     *
     * And so on…
     */
}
