package com.training.jdbc;


import java.sql.*;

public class DataBaseConnectivity {

    public static void main(String[] args) throws SQLException , ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/dev_power_gym";
        String username = "postgres";
        String password = "root123";
        String query = "select * from users";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String address = resultSet.getString("address");

                System.out.println("Id : "+id);
                System.out.println("First Name : "+firstName);
                System.out.println("Last Name : "+lastName);
                System.out.println("Address : "+address);
                System.out.println();
            }

        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }

        if(resultSet != null){
            connection.close();
            statement.close();
            resultSet.close();
        }


    }
}