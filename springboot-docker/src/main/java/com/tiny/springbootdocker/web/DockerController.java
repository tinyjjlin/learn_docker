package com.tiny.springbootdocker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tiny lin
 * @date 2019/1/4
 */
@RestController
public class DockerController {

    @GetMapping("/index")
    public String hello(){
        return "hello dockter";
    }
}
