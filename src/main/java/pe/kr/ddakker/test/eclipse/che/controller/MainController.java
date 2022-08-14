package pe.kr.ddakker.test.eclipse.che.controller;

import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
  }