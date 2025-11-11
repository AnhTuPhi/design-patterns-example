package vn.com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
@RestController
@RequestMapping("/ping")
public interface PingController {

    @GetMapping
    void ping();
}
