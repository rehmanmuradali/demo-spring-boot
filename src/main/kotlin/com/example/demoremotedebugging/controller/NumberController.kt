package com.example.demoremotedebugging.controller


import com.example.demoremotedebugging.manager.NumberManager
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class NumberController (
    val numberManager: NumberManager
) {
    @GetMapping("/add")
    fun add(
        @RequestParam("numberX") numberX: Int,
        @RequestParam("numberY") numberY: Int,
    ): Int {
        return numberManager.add(numberX, numberY)
    }


    @GetMapping("/")
    fun home(): String {
        return "Okay to use now!!"
    }
}