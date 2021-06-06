package com.multiproject.service

import org.springframework.stereotype.Service

@Service
class SampleService {
    fun sample(): String {
        return "sub hello world."
    }
}