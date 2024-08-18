package id.my.avzy.sb1.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ApiResponseData<T> extends ApiResponse {
    private T data;
}
