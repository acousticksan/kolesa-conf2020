package ru.acousticksan.kolesaconf.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
        primary = blueColor,
        primaryVariant = purple700,
        secondary = teal200
)

@Composable
fun KolesaConf2020Theme(content: @Composable() () -> Unit) {
   MaterialTheme(
            colors = DarkColorPalette,
            typography = typography,
            shapes = shapes,
            content = content
    )
}