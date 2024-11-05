package com.example.springbootproject

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping


@RestController // automatically converts it to a json because it's a rest controller
@RequestMapping("/")
class MessageController {
    @GetMapping // marks it to HTTP GET calls
    // @RequestParam makes it bound as a web request param
//    fun index(@RequestParam("name") name: String) = "Hello, $name! Have a good day!"
    fun listMessages() = listOf(
                        Message("1", "Hello"),
                        Message("2", "Bonjour"),
                        Message("3", "Konnichi wa"))
}
