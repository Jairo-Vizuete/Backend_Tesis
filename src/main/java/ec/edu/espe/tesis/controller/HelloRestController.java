package ec.edu.espe.tesis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloRestController {

    @GetMapping("user")
    public String helloUser() {
        return "Hello madafaca";
    }

    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/message")
    public ResponseEntity<?> getMessagge(){
        Map<String,String> messagge = new HashMap<>();
        messagge.put("contenido","Hello World");
        return ResponseEntity.ok(messagge);
    }
}
