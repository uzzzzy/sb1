package id.my.avzy.sb1.controller;

import id.my.avzy.sb1.dto.ApiResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<ApiResponseData<String>> test() {
        ApiResponseData<String> apiResponseData = new ApiResponseData<>();
        apiResponseData.setStatus(200);
        apiResponseData.setMessage("Hello World");
        apiResponseData.setData("Hello Sang");
        return ResponseEntity.ok(apiResponseData);
    }

    @GetMapping("/test/exception")
    public String testException() {
        throw new Error();
    }
}
