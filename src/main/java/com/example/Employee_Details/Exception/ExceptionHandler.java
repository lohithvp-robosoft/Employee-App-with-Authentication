package com.example.Employee_Details.Exception;

import com.example.Employee_Details.DTO.EmployeeResponseDTO;
import com.example.Employee_Details.Utils.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<EmployeeResponseDTO> handleNotFoundException(NotFoundException exception) {
        return ResponseUtil.errorResponseDefault(exception.getMessage());
//        return new ResponseEntity<>(new EmployeeResponseDTO(exception.getStatus(), exception.getCode(), exception.getMessage(), null), HttpStatus.NOT_FOUND);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {EmptyEmployeeListException.class})
    public ResponseEntity<EmployeeResponseDTO> handleEmptyEmployeeListException(EmptyEmployeeListException exception) {
        return ResponseUtil.errorResponseDefault(exception.getMessage());
//        return new ResponseEntity<>(new EmployeeResponseDTO(exception.getStatus(), exception.getCode(), exception.getMessage(), null), HttpStatus.NOT_FOUND);
    }
}
