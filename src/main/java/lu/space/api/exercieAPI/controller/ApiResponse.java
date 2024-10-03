package lu.space.api.exercieAPI.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * Response returned by Api
 */
@Data
public class ApiResponse {

    private String responseCode;

    private String payload;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;

}