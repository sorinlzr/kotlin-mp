package com.example.kotlin_mp_first

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
