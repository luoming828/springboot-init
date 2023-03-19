package com.nsolm.springbootinit.controller;

import com.nsolm.springbootinit.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author Ming 2023/03/19 22:19
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping()
    public Result<String> hello(){
        return Result.success("hello world");
    }
}
