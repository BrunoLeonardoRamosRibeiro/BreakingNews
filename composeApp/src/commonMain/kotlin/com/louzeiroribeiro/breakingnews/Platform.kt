package com.louzeiroribeiro.breakingnews

expect class Platform(){
    val osName: String
    val osVersion: String
    val deviceModel: String
}