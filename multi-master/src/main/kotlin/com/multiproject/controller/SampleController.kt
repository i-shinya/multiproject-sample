package com.multiproject.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController {

    @GetMapping("/sample")
    fun sample(): String {
        return "sample controller access."
    }
}
