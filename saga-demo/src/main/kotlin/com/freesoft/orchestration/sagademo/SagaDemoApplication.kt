package com.freesoft.orchestration.sagademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SagaDemoApplication

fun main(args: Array<String>) {
	runApplication<SagaDemoApplication>(*args)
}
