package com.example.courseerp.models.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse<T> {

    HttpStatus httpStatus;
    String message;
    T data;

    public static <T> BaseResponse<T> success(T data){

        return BaseResponse.<T> builder().
                httpStatus(HttpStatus.OK).
                message("Success").
                data(data).
                build();

    }
}
