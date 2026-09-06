package EmployeePayroll;

public class DuplicateEmployeeException extends RuntimeException{
    DuplicateEmployeeException(String message){
        super(message);
    }
}
