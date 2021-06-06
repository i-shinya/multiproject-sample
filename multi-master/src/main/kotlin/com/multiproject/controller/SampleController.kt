package com.multiproject.controller

import com.multiproject.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sample")
class SampleController(
    private val sampleService: SampleService
) {

    @GetMapping("/sample")
    fun sample(): String {
        return sampleService.sample()
    }
}
