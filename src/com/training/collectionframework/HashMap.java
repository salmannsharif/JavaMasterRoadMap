package com.training.collectionframework;

public class HashMap {
    public static void main(String[] args) {

        // Get the information about the file

//        File file = new File("D:\\rough.txt");
//        if(file.exists()){
//            System.out.println(file.getName()+ " getName");
//            System.out.println(file.getPath()+ " getPath");
//            System.out.println(file.getAbsoluteFile()+ " getAbsoluteFile");
//            System.out.println(file.getParent()+ " getParent");
//            System.out.println(file.getTotalSpace()+ " getTotalSpace");
//            System.out.println(file.getUsableSpace()+ " getUsableSpace");
//            System.out.println(file.getClass()+ " getClass");
//            System.out.println(file.getFreeSpace()+" getFreeSpace");
//            System.out.println(file.getParentFile()+" getParentFile");
//        }

        // Read the file line by line

//        try(BufferedReader bf = new BufferedReader(new FileReader("D:\\\\rough.txt"))){
//            String line;
//            while ((line = bf.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // Read the file using Java 8 Stream API

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\\\rough.txt"));
//            String line;
//            while ((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
//            }
//
//        }catch (FileNotFoundException e) {
//            e.getMessage();
//        }catch (IOException e) {
//            e.getMessage();
//        }

        // Read the file using Java 8 Files.readAllLines() method

//        try {
//            List<String> files = Files.readAllLines(Paths.get("D:\\\\rough.txt"));
//            files.forEach(System.out::println);
//        }catch (FileNotFoundException e) {
//            e.getMessage();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // Write the file using Java 8 Files.writeAllLines() method

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\salman.txt"))) {
//            bw.write("This is a sample line of text.");
//            bw.newLine();
//            bw.write("Another line.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // Let's print the classloader name of current class.
        //Application/System classloader will load this class
//        Class c = HashMap.class;
//        System.out.println(c.getClassLoader());
        //If we print the classloader name of String, it will print null because it is an
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader
//        System.out.println(String.class.getClassLoader())

        int m = 7; // height of 'C'

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < m; y++) {
                // Conditions for printing 'C'
                if (x == 0 || x == m - 1 || y == 0 || (x > 0 && x < m - 1 && y == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();

        int d = 7; // height of 'O'

        for (int x = 0; x < d; x++) {
            for (int y = 0; y < d; y++) {
                // Conditions for printing 'O'
                if (x == 0 || x == d - 1 || y == 0 || y == d - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int a = 7; // height of 'L'

        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                // Conditions for printing 'L'
                if (y == 0 || x == a - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        int n = 7;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {

                if ((x == 0 && y != 0 && y != n - 1)
                        || (x == n / 2)
                        || (y == 0 && x != 0)
                        || (y == n - 1 && x != 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        StringBuilder pattern = new StringBuilder();

    }
}
