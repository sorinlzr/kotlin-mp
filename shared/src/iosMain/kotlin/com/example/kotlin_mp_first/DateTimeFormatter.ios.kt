package com.example.kotlin_mp_first

import kotlinx.datetime.LocalDateTime
import platform.Foundation.NSDate
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSDateFormatterMediumStyle
import platform.Foundation.NSLocale
import platform.Foundation.dateWithTimeIntervalSince1970

actual fun formatDateTime(dateTime: LocalDateTime): String {
    val date = NSDate.dateWithTimeIntervalSince1970(dateTime.toNSDate().timeIntervalSince1970)
    val formatter = NSDateFormatter().apply {
        dateStyle = NSDateFormatterMediumStyle
        timeStyle = NSDateFormatterMediumStyle
        locale = NSLocale.currentLocale
    }
    return formatter.stringFromDate(date)
}