package com.example.demoremotedebugging.manager

import org.springframework.stereotype.Service

@Service
class NumberManager {
    fun add(numberX: Int, numberY: Int): Int {
        return numberX - numberY
    }

}