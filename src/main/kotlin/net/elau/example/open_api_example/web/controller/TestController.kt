package net.elau.example.open_api_example.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/echo")
class TestController {

    @GetMapping
    fun helloWorld() = "Hello world!"
}
