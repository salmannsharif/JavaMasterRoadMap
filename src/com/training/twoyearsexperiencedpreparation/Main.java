package com.training.twoyearsexperiencedpreparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    public int id;
    public Long salary;
    public String department;
    public String address;

    Employee(int id, Long salary, String department, String address){
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


public class Main {


    static void moveZeroElementToRightInArray(){
        int[] arr = {0, 1, 0, 3, 12};
        int count = 0;
        // Traverse the array. If element
        // encountered is non-zero, then
        // replace the element at index 'count'
        // with this element
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while(count < arr.length){
         arr[count++] = 0;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }

    }

    static void moveZeroElementToRightInList() {
        List<Integer> numbers = List.of(1,0,-3,0,5,-2,0,8,0,-4);
        List<Integer> collect = Stream.concat(numbers.stream().filter(n -> n != 0), numbers.stream().filter(n -> n == 0))
                .toList();
        System.out.println(collect);
//        0(n)
    }

    static void sortingMapUsingByValue(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("D", 32);
        map.put("H", 76);
        map.put("B", 97);
        map.put("U", 43);
        map.put("G", 95);

        LinkedHashMap<String, Integer> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        collect.forEach((key, value)->
                System.out.println(key+ "-" +value));
    }

    //Don't want to use condition here
    static int  testData(int a){
        //write  logic to return 7-11, 11-7
        return 7+11-a;
    }

    static void findingDuplicates() {
        int[] arr = {1, 1, 3, 4, 5, 6, 7, 4, 9, 10};
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    static void findingDuplicatesUsingStream(){
        List<Integer> num = List.of(8, 2, 7, 4, 9, 6, 7, 8, 9, 10);
//        Map<Integer, Long> collect = num.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        Set<Integer> collect = num.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() > 1).map(n -> n.getKey()).
//                collect(Collectors.toSet());
        Set<Integer> collect = num.stream().filter(n -> Collections.frequency(num, n) > 1).collect(Collectors.toSet());
        System.out.println(collect);
    }

    static void removeEmptyStrings(){
        String []  strArr = {"Java", "Python", "", "Dotnet", "NodeJS",};
        String []  strArr1 = {"Java", "Python", " ", "", "Dotnet", "NodeJS"};
        String []  strArr2 = {"Java", "Python", "Dotnet", "NodeJS", null};
        Arrays.stream(strArr).filter(i-> !i.isEmpty()).forEach(System.out::println); // -> When array value has emptyString use this.
        Arrays.stream(strArr1).filter(i-> !i.isBlank()).forEach(System.out::println); // -> When array value has empty space as value then use this.
        Arrays.stream(strArr2).filter(Objects::nonNull).forEach(System.out::println); // -> When array value has null value then use this


    }

    static void getHighestSalary(){

        Employee emp1 = new Employee(1, 10000L, "java", "us");
        Employee emp2 = new Employee(2, 20000L, "python", "cn");
        Employee emp3 = new Employee(3, 30000L, "ml", "uk");
        Employee emp4 = new Employee(4, 50000L, "ai", "ru");
        Employee emp5 = new Employee(5, 60000L, "llm", "in");
        Employee emp6 = new Employee(6, 70000L, "da", "ir");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

//        employeeList.stream().filter(data -> data.getSalary() < 30000).forEach(System.out::println); // Used to print employee object who get more than 30000.
//        System.out.println(employeeList.stream().map(Employee::getSalary).sorted((data1, data2) -> (int) ((data2 - data1))).skip(2).findFirst().get());
    }



    public static void main(String[] args) {
//        moveZeroElementToRightInArray();
//        moveZeroElementToRightInList();
//        sortingMapUsingByValue();
//        System.out.println(testData(7));
//        System.out.println(testData(11));
//        findingDuplicates();
//        findingDuplicatesUsingStream();

//        removeEmptyStrings();

//        getHighestSalary();
    }
}
