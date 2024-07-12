package com.attafitamim.file.picker.utils.heic

import coil3.decode.BitmapFactoryDecoder
import coil3.decode.DecodeResult
import coil3.decode.Decoder
import coil3.decode.ImageSource
import coil3.request.Options

actual class HEICImageDecoder actual constructor(
    source: ImageSource,
    options: Options,
    compressionQuality: Double
) : Decoder {

    private val decoder = BitmapFactoryDecoder(source, options)

    override suspend fun decode(): DecodeResult = decoder.decode()
}