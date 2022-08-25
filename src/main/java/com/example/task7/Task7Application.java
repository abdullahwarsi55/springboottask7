package com.example.task7;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task7Application {

	public static void main(String[] args) {
		SpringApplication.run(Task7Application.class, args);
                System.out.println("NUMBER VALID : " + validatePhoneNumber("+92332-1373637"));
                System.out.println("NUMBER VALID : " + validatePhoneNumber("+923321373637"));
                System.out.println("NUMBER VALID : " + validatePhoneNumber("+92332 1373637"));
                System.out.println("NUMBER VALID : " + validatePhoneNumber("92332 1373637"));
                System.out.println("NUMBER VALID : " + validatePhoneNumber("+92332.1373637"));
	}
        @Test
  private static boolean validatePhoneNumber(String phoneNumber) {
  if (phoneNumber.matches("\\+\\d{5}[-\\.\\s]\\d{7}")){
   return true;
  }
  else {
   return false;
         
           }
}
}
