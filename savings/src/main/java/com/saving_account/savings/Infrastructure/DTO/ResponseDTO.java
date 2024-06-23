package com.saving_account.savings.Infrastructure.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO<T> {

    private boolean success;
    private HttpStatus status;
    private String message;
    private T content;

    public static <T> ResponseDTO<T> success(T data){
        return ResponseDTO.<T>builder()
                .status(HttpStatus.OK)
                .message("SUCCESS")
                .success(true)
                .content(data)
                .build();
    }

    public static <T> ResponseDTO<T> error(T error){
        return ResponseDTO.<T>builder()
                .message("ERROR")
                .success(false)
                .content(error)
                .build();
    }

}
