package com.attafitamim.file.picker.ui.preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.attafitamim.file.picker.utils.IMAGE_MAX_QUALITY
import com.attafitamim.file.picker.utils.rememberImageFromVideo

private const val DefaultFrame = 0.001

@Composable
fun VideoPreview(
    uri: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    isUrl: Boolean = false,
    quality: Double = IMAGE_MAX_QUALITY,
    videoFrameSecond: Double = DefaultFrame,
    contentDescription: String? = null
) {
    val bitmap = rememberImageFromVideo(
        uri,
        videoFrameSecond,
        isUrl,
        quality
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier)
    ) {
        bitmap?.let {
            Image(
                modifier = Modifier.fillMaxSize(),
                contentScale = contentScale,
                bitmap = bitmap,
                contentDescription = contentDescription,
            )
        }
    }
}