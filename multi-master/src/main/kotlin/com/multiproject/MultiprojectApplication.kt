package com.multiproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiprojectApplication

fun main(args: Array<String>) {
	runApplication<MultiprojectApplication>(*args)
}
