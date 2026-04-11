package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class HelloController {

    private String message = "Hello Joel";

    // GET → returns current message
    @GetMapping
    public String getMessage() {
        return message;
    }

    // POST → set new message
    @PostMapping
    public String postMessage(@RequestBody String newMessage) {
        message = newMessage;
        return "Message saved";
    }

    // PUT → update message
    @PutMapping
    public String putMessage(@RequestBody String newMessage) {
        message = newMessage;
        return "Message updated";
    }

    // DELETE → clear message
    @DeleteMapping
    public String deleteMessage() {
        message = "";
        return "Message deleted";
    }
}
