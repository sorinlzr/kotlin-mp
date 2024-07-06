package com.example.kotlin_mp_first

import kotlinx.datetime.LocalDateTime

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlinx.datetime.toJavaLocalDateTime

actual fun formatDateTime(dateTime: LocalDateTime): String {
    val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
    return formatter.format(Date.from(dateTime.toJavaLocalDateTime().toInstant(java.time.ZoneOffset.UTC)))
}