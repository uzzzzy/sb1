package id.my.avzy.sb1.controller;

import id.my.avzy.sb1.dto.ApiResponseData;
import id.my.avzy.sb1.repository.TestRepository;
import id.my.avzy.sb1.run.Run;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping("/runs/all")
    List<Run> findAll() {
        return testRepository.findAll();
    }

    @GetMapping("/runs/{id}")
    Run findById(@PathVariable Integer id) {
        return testRepository.findById(id);
    }

    @GetMapping("/")
    public ResponseEntity<ApiResponseData<String>> test() {
        ApiResponseData<String> apiResponseData = new ApiResponseData<>();
        apiResponseData.setStatus(200);
        apiResponseData.setMessage("Hello World");
        apiResponseData.setData("Hello Sang");
        return ResponseEntity.ok(apiResponseData);
    }

    @GetMapping("/exception")
    public String testException() {
        throw new Error();
    }
}
