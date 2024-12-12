package com.training.collectionframework;

import java.util.*;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ArrList {
    private List<Integer> list;
    private Scanner sc;

    public ArrList() {
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrList arrList = new ArrList();
            while (true) {
                System.out.println("1. Add Element");
                System.out.println("2. Add Element By Index");
                System.out.println("3. Add All Elements");
                System.out.println("4. Remove Element");
                System.out.println("5. Remove Element By Index");
                System.out.println("6. Remove All Elements");
                System.out.println("7. Clear List");
                System.out.println("8. Set Element By Index");
                System.out.println("9. Replace All Elements");
                System.out.println("10. Contain Element");
                System.out.println("11. Contain All Elements");
                System.out.println("12. Get Element By Index");
                System.out.println("13. Index Of Element");
                System.out.println("14. Last Index Of Element");
                System.out.println("15. Sort List");
                System.out.println("16. Sublist");
                System.out.println("17. Check If Empty");
                System.out.println("18. Size of List");
                System.out.println("19. Convert List to Array");
                System.out.println("20. Retain All Elements");
                System.out.println("21. Remove If");
                System.out.println("22. ListIterator");
                System.out.println("23. forEach");
                System.out.println("24. Show All Elements");
                System.out.println("25. Find Duplicate");
                System.out.println("26. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        arrList.addElement();
                        break;
                    case 2:
                        arrList.addEleByIndex();
                        break;
                    case 3:
                        arrList.addAllElements();
                        break;
                    case 4:
                        arrList.removeEle();
                        break;
                    case 5:
                        arrList.removeEleByInd();
                        break;
                    case 6:
                        arrList.removeAllEle();
                        break;
                    case 7:
                        arrList.clearList();
                        break;
                    case 8:
                        arrList.setEleById();
                        break;
                    case 9:
                        arrList.replaceEle();
                        break;
                    case 10:
                        arrList.containEle();
                        break;
                    case 11:
                        arrList.containAll();
                        break;
                    case 12:
                        arrList.getEleByIndex();
                        break;
                    case 13:
                        arrList.indexOfEle();
                        break;
                    case 14:
                        arrList.lastIndexOfEle();
                        break;
                    case 15:
                        arrList.sortList();
                        break;
                    case 16:
                        arrList.subList();
                        break;
                    case 17:
                        arrList.isEmpty();
                        break;
                    case 18:
                        arrList.size();
                        break;
                    case 19:
                        arrList.toArray();
                        break;
                    case 20:
                        arrList.retainAll();
                        break;
                    case 21:
                        arrList.removeIf();
                        break;
                    case 22:
                        arrList.listIterator();
                        break;
                    case 23:
                        arrList.forEach();
                        break;
                    case 24:
                        arrList.showAllElements();
                        break;
                    case 25:
                        arrList.findDuplicate();
                        break;
                    case 26:
                        System.out.println("Exiting");
                        return;
                    default:
                        System.out.println("Enter a valid choice!");
                        break;
                }
            }
        }
    }

    public void addElement() {
        System.out.println("Enter the element you want to add: ");
        int n = sc.nextInt();
        list.add(n);
        System.out.println("Element added successfully...");
    }

    public void addEleByIndex() {
        System.out.println("Enter the index value where you want to add the element: ");
        int index = sc.nextInt();
        System.out.println("Enter the element: ");
        int element = sc.nextInt();
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index.");
            return;
        }
        list.add(index, element);
        System.out.println("Element added successfully...");
    }

    public void addAllElements() {
        System.out.println("How many elements do you want to add to the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Elements added successfully...");
    }

    public void removeEle() {
        System.out.println("Enter the element you want to remove: ");
        int element = sc.nextInt();
        if (list.remove(Integer.valueOf(element))) {
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Element not found in the list.");
        }
        System.out.println("Updated List: " + list);
    }

    public void removeEleByInd() {
        System.out.println("Enter the index of the element you want to remove: ");
        int index = sc.nextInt();
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return;
        }
        list.remove(index);
        System.out.println("Element removed successfully.");
    }

    public void removeAllEle() {
        System.out.println("How many elements do you want to remove from the list: ");
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter the elements you want to remove: ");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        list.removeAll(list1);
        System.out.println("Elements removed successfully.");
        System.out.println("Updated List: " + list);
    }

    public void clearList() {
        list.clear();
        System.out.println("List cleared.");
    }

    public void setEleById() {
        System.out.println("Enter the index where you want to set the element: ");
        int index = sc.nextInt();
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.println("Enter the new element: ");
        int element = sc.nextInt();
        list.set(index, element);
        System.out.println("Element updated successfully.");
    }

    public void replaceEle() {
        System.out.println("Enter the old element you want to replace: ");
        int oldElement = sc.nextInt();
        System.out.println("Enter the new element: ");
        int newElement = sc.nextInt();

        UnaryOperator<Integer> replaceOperator = x -> (x == oldElement) ? newElement : x;
        list.replaceAll(replaceOperator);

        System.out.println("Modified List: " + list);
    }

    public void containEle() {
        System.out.println("Enter the element to check: ");
        int n = sc.nextInt();
        boolean isAvailable = list.contains(n);
        if (isAvailable) {
            System.out.println("The element is available in the list.");
        } else {
            System.out.println("The element is not available in the list.");
        }
    }

    public void containAll() {
        System.out.println("How many elements do you want to check: ");
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        if (list.containsAll(list1)) {
            System.out.println("All elements are available in the list.");
        } else {
            System.out.println("Not all elements are available.");
        }
    }

    public void getEleByIndex() {
        System.out.println("Enter the index to get the element: ");
        int index = sc.nextInt();
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index.");
            return;
        }
        System.out.println("Element at index " + index + " is: " + list.get(index));
    }

    public void indexOfEle() {
        System.out.println("Enter the element to find its index: ");
        int element = sc.nextInt();
        int index = list.indexOf(element);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    public void lastIndexOfEle() {
        System.out.println("Enter the element to find its last index: ");
        int element = sc.nextInt();
        int index = list.lastIndexOf(element);
        if (index != -1) {
            System.out.println("Element last found at index: " + index);
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    public void sortList() {
        Collections.sort(list);
        System.out.println("List sorted: " + list);
    }

    public void subList() {
        System.out.println("Enter the start index of the sublist: ");
        int startIndex = sc.nextInt();
        System.out.println("Enter the end index of the sublist: ");
        int endIndex = sc.nextInt();
        if (startIndex < 0 || endIndex > list.size() || startIndex > endIndex) {
            System.out.println("Invalid indices.");
            return;
        }
        List<Integer> subList = list.subList(startIndex, endIndex);
        System.out.println("Sublist: " + subList);
    }

    public void isEmpty() {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
    }

    public void size() {
        System.out.println("Size of the list: " + list.size());
    }

    public void toArray() {
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("List to array: " + Arrays.toString(array));
    }

    public void retainAll() {
        System.out.println("How many elements do you want to retain: ");
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter the elements to retain: ");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        list.retainAll(list1);
        System.out.println("Retained elements successfully.");
        System.out.println("Updated List: " + list);
    }

    public void removeIf() {
        System.out.println("Enter a number to remove all elements greater than or equal to this number: ");
        int threshold = sc.nextInt();
        list.removeIf(e -> e >= threshold);
        System.out.println("Elements removed successfully.");
        System.out.println("Updated List: " + list);
    }

    public void listIterator() {
        System.out.println("ListIterator (forward): ");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("ListIterator (backward): ");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public void forEach() {
        System.out.println("Applying forEach to print elements: ");
        list.forEach(numbers -> System.out.println(numbers));
    }

    public void showAllElements() {
        System.out.println("Current List: " + list);
    }

    public void findDuplicate() {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer number : list) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values are available in the list.");
        } else {
            System.out.println("Duplicate values are: " + duplicates);
        }
    }

}
