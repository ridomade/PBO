package com.view;

import javax.swing.JTextField;

import com.config.cConfig;

import payroll.employee.registerEmployee;

public class cView {
  public static void getAccountData() {
    // pesan header
    System.out.println("\n::: Acount Data :::");
    // data semua barangnya
    System.out.println(cConfig.getAccountData());
  }

  // public static void addEmployeeData(String employeeID, String firstName, String surname,
  // String dateOfBirth, String gender, String email, String defaultPassword, String departement,
  // String jobTitle, String status, String dateHired, String contact, String basicSalary,
  // String seledtedPosition, String cardHolderName, String cardName, String cardNumber) {
  // cConfig.addEmployeeData(employeeID, firstName, surname, dateOfBirth, gender, email,
  // defaultPassword, departement, jobTitle, status, dateHired, contact, basicSalary,
  // seledtedPosition, cardHolderName, cardName, cardNumber);
  // }
}
