package com.training.workplace;

class OwnArrayList <T> {
    private T[] data;
    private int size;

    public OwnArrayList() {
        this.data = (T[]) new Object[10];
        this.size = 0;
    }

    public void add(T elements){
        if(size == data.length){
            T[] temp = (T[]) new Object[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        data[size] = elements;
        size++;
    }

    public T get(int index) {
        validateIndex(index);
        return data[index];
    }

    public int size() {
        return size;
    }

    public void update(int index, T element) {
        validateIndex(index);
        data[index] = element;
    }

    public void remove(int index){
        validateIndex(index);
        T[] temp = (T[]) new Object[data.length];
        System.arraycopy(data, 0, temp, 0, index);
        System.arraycopy(data, index + 1, temp, index, size - index - 1);
        data = temp;
        size--;
    }



    private void validateIndex(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size : " + size);
        }
    }

}

class OwnArrayListTest {
    public static void main(String[] args) {

        OwnArrayList<Integer> arrayList = new OwnArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.update(1, 100);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("-------------------------------------");
        arrayList.remove(2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
