package id.my.avzy.sb1.exception;

import id.my.avzy.sb1.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> handleException(Exception e) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus(500);
        if (e.getMessage() != null) {
            apiResponse.setMessage(e.getMessage());
        } else {
            apiResponse.setMessage("Internal Server Error");
        }
        return ResponseEntity.status(500).body(apiResponse);
    }
}
