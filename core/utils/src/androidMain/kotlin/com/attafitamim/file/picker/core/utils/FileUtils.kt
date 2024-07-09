package com.attafitamim.file.picker.core.utils

import java.io.File

fun tryCreateDirectoryIfNotExists(fullPath: String): Boolean = File(fullPath).run {
    exists() || mkdir()
}