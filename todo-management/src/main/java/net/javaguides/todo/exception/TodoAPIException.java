package net.javaguides.todo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@Getter

public class TodoAPIException extends  RuntimeException{

    private HttpStatus status;
    private String message;

}
