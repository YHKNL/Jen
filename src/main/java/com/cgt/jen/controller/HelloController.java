package com.cgt.jen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther yhk
 * @Date 2019/6/5 21:43
 * @Description
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String helloWorld(){
        return "大家好，我是vae,在这清爽的夏天给大家带来一首有和不可";

}

}
