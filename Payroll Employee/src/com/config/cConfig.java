package com.config;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JTextField;
import com.mysql.cj.jdbc.Blob;
// mengeksekusi query mysql ke database
// menampung data dari mysql
import java.sql.*;
import java.text.SimpleDateFormat;


public class cConfig {
  private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
  private static final String DB_URL = "jdbc:mysql://localhost:3306/pbo_payroll";
  private static final String USER = "root";
  private static final String PASS = "";

  private static Connection connect;
  private static Statement statement;
  private static ResultSet resultData;

  public static void connection() {
    // method untuk melakukan koneksi ke database
    try {
      // registrasi driver yang akan dipakai
      Class.forName(JDBC_DRIVER);

      // buat koneksi ke database
      connect = DriverManager.getConnection(DB_URL, USER, PASS);
    } catch (Exception e) {
      // kalo ada error saat koneksi
      // maka tampilkan errornya
      System.out.println("Koneksi gagal");
      e.printStackTrace();
    }

  }

  // return string dari data yang ingiin diambil belom dengan parameter
  public static Map<String, String> getAccountData()

  {
    cConfig.connection();
    // isi nilai default dari variabel data
    String data = "Maaf data tidak ada";
    Map<String, String> accountData = new HashMap<String, String>();
    try {
      // buat object statement yang ambil dari koneksi
      statement = connect.createStatement();
      // query select all data from database
      String query = "SELECT email,password FROM account";
      // eksekusi query-nya
      resultData = statement.executeQuery(query);
      // set variabel data jadi null
      data = "";

      // looping pengisian variabel data
      while (resultData.next()) {
        accountData.put(resultData.getString("email"),
            new String(resultData.getString("password")));
      }


      // close statement dan connection
      statement.close();
      connect.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return accountData;
  }
  public static String getPositionByEmail(String email) {
    cConfig.connection();
    String position = null;

    try {
        // Use a PreparedStatement to safely select data from the database
        String query = "SELECT position FROM account WHERE email = ?";
        try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
            preparedStatement.setString(1, email);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a row is found
            if (resultSet.next()) {
                position = resultSet.getString("position");
            }
        }

        // Close connection
        connect.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return position;
}
  
  public static String getEmployeeIdByEmail(String email) {
    cConfig.connection();
    String employeeId = null;

    try {
        // Use a PreparedStatement to safely select data from the database
        String query = "SELECT employee_id FROM account WHERE email = ?";
        try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
            preparedStatement.setString(1, email);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a row is found
            if (resultSet.next()) {
                employeeId = resultSet.getString("employee_id");
            }
        }

        // Close connection
        connect.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return employeeId;
}
  public static Map<String, String> getAccountDataById(String employeeId) {
    cConfig.connection();
    Map<String, String> accountData = new HashMap<>();

    try {
        // Use a PreparedStatement to safely select data from the 'account' table
        String accountQuery = "SELECT name, email, password FROM account WHERE employee_id = ?";
        try (PreparedStatement accountStatement = connect.prepareStatement(accountQuery)) {
            accountStatement.setString(1, employeeId);

            // Execute the query for the 'account' table
            ResultSet accountResultSet = accountStatement.executeQuery();

            // Check if a row is found in 'account' table
            if (accountResultSet.next()) {
                accountData.put("name", accountResultSet.getString("name"));
                accountData.put("email", accountResultSet.getString("email"));
                accountData.put("password", accountResultSet.getString("password"));
            }
        }

        // Close connection
        connect.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return accountData;
}
    public static Map<String, String> getCardDataById(String employeeId) {
    cConfig.connection();
    Map<String, String> cardData = new HashMap<>();

    try {
        // Use a PreparedStatement to safely select data from the 'card' table
        String cardQuery = "SELECT card_holder_name, card_name, card_number, salary FROM card WHERE employee_id = ?";
        try (PreparedStatement cardStatement = connect.prepareStatement(cardQuery)) {
            cardStatement.setString(1, employeeId);

            // Execute the query for the 'card' table
            ResultSet cardResultSet = cardStatement.executeQuery();

            // Check if a row is found in 'card' table
            if (cardResultSet.next()) {
                cardData.put("card_holder_name", cardResultSet.getString("card_holder_name"));
                cardData.put("card_name", cardResultSet.getString("card_name"));
                cardData.put("card_number", cardResultSet.getString("card_number"));
                 cardData.put("salary", cardResultSet.getString("salary"));
            }
        }

        // Close connection
        connect.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return cardData;
}


   public static Map<String, String> getEmployeeDataByEmail(String email) {
        cConfig.connection();
        Map<String, String> employeeData = new HashMap<>();

        try {
            // Use a PreparedStatement to safely select data from the database
            String query = "SELECT employee_id, password FROM account WHERE email = ?";
            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                preparedStatement.setString(1, email);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Check if a row is found
                if (resultSet.next()) {
                    employeeData.put("employee_id", resultSet.getString("employee_id"));
                    employeeData.put("password", resultSet.getString("password"));
                }
            }

            // Close connection
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeData;
    }
  public static boolean addEmployeeData(String employeeID, String name, String email,
      String password) {
    cConfig.connection();
    boolean data = false;
    try {
      // Use a PreparedStatement to safely insert data into the database
      String query =
          "INSERT INTO employeeData (employee_id, name, email, password) VALUES (?, ?, ?, ?)";
      try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
        // Set values for the parameters using setters
        preparedStatement.setString(1, employeeID);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, email);
        preparedStatement.setString(4, password);

        // Execute the update
        int result = preparedStatement.executeUpdate();

        if (result > 0) {
          data = true;
        }
      }

      // Close connection
      connect.close();
      System.out.println("Berhasil Tambah Employee Data");
    } catch (Exception e) {
      e.printStackTrace();
    }

    return data;
  }


  public static boolean addAccountData(String email, String password, String employeeId, String position,String salary) {
    cConfig.connection();
    boolean data = false;

    try {
        // Use a PreparedStatement to safely insert data into the 'account' table
        String accountQuery = "INSERT INTO account (email, password, employee_id, position, name) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement accountStatement = connect.prepareStatement(accountQuery)) {
            accountStatement.setString(1, email);
            accountStatement.setString(2, password);
            accountStatement.setString(3, employeeId);
            accountStatement.setString(4, position);
            accountStatement.setString(5, ""); // Set name as empty string

            // Execute the update for the 'account' table
            int accountResult = accountStatement.executeUpdate();

            if (accountResult > 0) {
                // Use a PreparedStatement to safely insert data into the 'card' table
                String cardQuery = "INSERT INTO card (employee_id, card_holder_name, card_name, card_number, salary) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement cardStatement = connect.prepareStatement(cardQuery)) {
                    cardStatement.setString(1, employeeId);
                    cardStatement.setString(2, ""); // Set card_holder_name as empty string
                    cardStatement.setString(3, ""); // Set card_name as empty string
                    cardStatement.setString(4, ""); // Set card_number as empty string
                    
                    cardStatement.setString(5,salary);

                    // Execute the update for the 'card' table
                    int cardResult = cardStatement.executeUpdate();

                    if (cardResult > 0) {
                        data = true;
                    }
                }
            }
        }

        // Close connection
        connect.close();
        System.out.println("Berhasil Tambah Account Data");
    } catch (Exception e) {
        e.printStackTrace();
    }

    return data;
}




  public static boolean updateEmployeeData(String employeeId, String firstName, String surname,
      String dateOfBirth, String gender, String email, String defaultPassword, String department,
      String jobTitle, String status, String dateHired, String contact, String basicSalary,
      String selectedPosition, String cardHolderName, String cardName, String cardNumber,
      InputStream profilePhoto) {
    cConfig.connection();
    boolean success = false;
    try {
      // create object statement from connection
      statement = connect.createStatement();

      // query to update data for the specified employee ID
      String query = "UPDATE employeedata SET first_name=?, surname=?, date_of_birth=?, "
          + "gender=?, email=?, default_password=?, departement=?, job_title=?, "
          + "status=?, date_hired=?, contact=?, basic_salary=?, selected_position=?, "
          + "card_holder_name=?, card_name=?, card_number=?, profile_photo=? "
          + "WHERE employee_id=?";
      try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, surname);
        preparedStatement.setString(3, dateOfBirth);
        preparedStatement.setString(4, gender);
        preparedStatement.setString(5, email);
        preparedStatement.setString(6, defaultPassword);
        preparedStatement.setString(7, department);
        preparedStatement.setString(8, jobTitle);
        preparedStatement.setString(9, status);
        preparedStatement.setString(10, dateHired);
        preparedStatement.setString(11, contact);
        preparedStatement.setString(12, basicSalary);
        preparedStatement.setString(13, selectedPosition);
        preparedStatement.setString(14, cardHolderName);
        preparedStatement.setString(15, cardName);
        preparedStatement.setString(16, cardNumber);

        // Set profile_photo to null if profilePhoto is null
        if (profilePhoto != null) {
          preparedStatement.setBlob(17, profilePhoto);
        } else {
          preparedStatement.setNull(17, Types.BLOB);
        }

        preparedStatement.setString(18, employeeId); // Set the employee_id last

        // execute the query
        int result = preparedStatement.executeUpdate();

        if (result > 0) {
          success = true;
          System.out.println("Berhasil Update Employee Data");
        } else {
          System.out.println("Employee not found for update.");
        }
      }

      // close statement and connection
      statement.close();
      connect.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return success;
  }



  
  
  public static boolean updateEmployeeData(String employeeId, String cardName, String holderName, String cardNumber, String name, String email, String password) {
    cConfig.connection();
    boolean data = false;

    try {
        // Update data in the 'account' table
        String accountQuery = "UPDATE account SET name = ?, email = ?, password = ? WHERE employee_id = ?";
        try (PreparedStatement accountStatement = connect.prepareStatement(accountQuery)) {
            accountStatement.setString(1, name);
            accountStatement.setString(2, email);
            accountStatement.setString(3, password);
            accountStatement.setString(4, employeeId);

            // Execute the update for the 'account' table
            int accountResult = accountStatement.executeUpdate();

            // Update data in the 'card' table
            String cardQuery = "UPDATE card SET card_name = ?, card_holder_name = ?, card_number = ? WHERE employee_id = ?";
            try (PreparedStatement cardStatement = connect.prepareStatement(cardQuery)) {
                cardStatement.setString(1, cardName);
                cardStatement.setString(2, holderName);
                cardStatement.setString(3, cardNumber);
                cardStatement.setString(4, employeeId);

                // Execute the update for the 'card' table
                int cardResult = cardStatement.executeUpdate();

                // Check if both updates were successful
                if (accountResult > 0 && cardResult > 0) {
                    data = true;
                }
            }
        }

        // Close connection
        connect.close();
        System.out.println("Berhasil Update Data Karyawan");
    } catch (Exception e) {
        e.printStackTrace();
    }

    return data;
}
  
    public static boolean storeAttendance(String employeeId, String date, String time) {
        cConfig.connection();
        boolean alreadyAtt = false;
        try {
            // Format the date and time
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            java.util.Date formattedDate = dateFormat.parse(date);
            java.util.Date formattedTime = timeFormat.parse(time);

            // Pemeriksaan apakah employee_id sudah melakukan attendance pada tanggal yang sama
            if (!isAttendanceExists(employeeId, formattedDate)) {
                // SQL query to insert attendance into the 'attendance' table
                String query = "INSERT INTO attendance (employee_id, date, time) VALUES (?, ?, ?)";

                // Establish database connection using cConfig's connection method
                connection();

                try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                    // Set values for the parameters using setters
                    preparedStatement.setString(1, employeeId);
                    preparedStatement.setDate(2, new java.sql.Date(formattedDate.getTime())); // Convert java.util.Date to java.sql.Date
                    preparedStatement.setTime(3, new java.sql.Time(formattedTime.getTime()));

                    // Execute the update
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("Attendance stored successfully.");
                    } else {
                        System.out.println("Failed to store attendance.");
                    }
                } finally {
                    // Close connection after use
                    connect.close();
                }
            } else {
                alreadyAtt = true;
                System.out.println("Employee already attended on the same date.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return alreadyAtt;
    }


    private static boolean isAttendanceExists(String employeeId, java.util.Date date) throws SQLException {
        String query = "SELECT COUNT(*) FROM attendance WHERE employee_id = ? AND date = ?";
        try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
            preparedStatement.setString(1, employeeId);
            preparedStatement.setDate(2, new java.sql.Date(date.getTime()));

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }
    
   public static int countAttendances(String employeeId) {
        int totalCount = 0;

        try {
            // SQL query to count attendances for a specific employee_id in the same month
            String query = "SELECT COUNT(*) FROM attendance WHERE employee_id = ? AND MONTH(date) = MONTH(CURDATE())";

            // Establish database connection using cConfig's connection method
            connection();

            try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
                // Set the value for the parameter using setter
                preparedStatement.setString(1, employeeId);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Check if a row is found
                if (resultSet.next()) {
                    totalCount = resultSet.getInt(1);
                }
            } finally {
                // Close connection after use
                connect.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return totalCount;
    }
}
