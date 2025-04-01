package com.louzeiroribeiro.breakingnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform