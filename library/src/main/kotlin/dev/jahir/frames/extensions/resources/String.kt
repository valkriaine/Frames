package dev.jahir.frames.extensions.resources

import java.util.Locale

fun String?.hasContent(): Boolean = orEmpty().isNotBlank() && orEmpty().isNotEmpty()

fun String?.lower(locale: Locale = Locale.ROOT): String = orEmpty().lowercase(locale)

fun String?.upper(locale: Locale = Locale.ROOT): String = orEmpty().uppercase(locale)
