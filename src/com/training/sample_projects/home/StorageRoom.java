package com.training.sample_projects.home;

import java.util.Arrays;

public class StorageRoom {
    private String[] oldThings;

    public String[] getOldThings() {
        return oldThings;
    }

    public void setOldThings(String[] oldThings) {
        this.oldThings = oldThings;
    }

    @Override
    public String toString() {
        return "StorageRoom{" +
                "oldThings=" + Arrays.toString(oldThings) +
                '}';
    }

}
