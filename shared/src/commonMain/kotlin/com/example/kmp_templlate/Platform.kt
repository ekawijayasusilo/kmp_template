package com.example.kmp_templlate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform