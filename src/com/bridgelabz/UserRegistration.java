package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserValidation firstName=(firstname)->{
            Boolean check = Pattern.matches("^[A-Z][a-z]{2,}$",firstname);
            if (check == true) {
                System.out.println("First name is Valid");
            }else
                System.out.println("First name is Invalid");
        };
        firstName.userValidate("Manoj");
        UserValidation lastName=(lastname)->{
            Boolean check = Pattern.matches("^[A-Z][a-z]{2,}$",lastname);
            if (check == true) {
                System.out.println("Last name is Valid");
            }else
                System.out.println("Last name is Invalid");
        };
        lastName.userValidate("Kumar");
        UserValidation emailId=(email)->{
            Boolean check = Pattern.matches("^([A-Za-z0-9]{3,}+)((?:[\\.\\+\\-][a-zA-Z0-9]+)*)@([a-z0-9]{1,}+)\\.([a-z]{2,}+)((?:\\.[a-zA-Z]+)?)$",email);
            if (check == true) {
                System.out.println("Email Id is Valid");
            }else
                System.out.println("Email Id is Invalid");
        };
        emailId.userValidate("abc.xyz@bl.co.in");
        UserValidation mobileNumber=(mobilenumber)->{
            Boolean check = Pattern.matches("^(91 )[0-9]{10}$",mobilenumber);
            if (check == true) {
                System.out.println("Mobile number is Valid");
            }else
                System.out.println("Mobile number is Invalid");
        };
        mobileNumber.userValidate("91 9999999999");
        UserValidation passWord=(password)->{
            Boolean check = Pattern.matches("^(?=.*[A-z])(?=.*[0-9])(?=.*[~`!@#$%^&*_])[a-zA-Z0-9~`!@#$%^&*_]{8,}$",password);
            if (check == true) {
                System.out.println("Password is Valid");
            }else
                System.out.println("Password is Invalid");
        };
        passWord.userValidate("manojKumar@22225");

    }

}
