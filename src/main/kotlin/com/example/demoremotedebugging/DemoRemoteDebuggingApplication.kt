package com.example.demoremotedebugging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoRemoteDebuggingApplication

fun main(args: Array<String>) {
	runApplication<DemoRemoteDebuggingApplication>(*args)
}
