package io.mo.glassmic.audio.tts

/**
 * 预置的 Fish Audio 音色（reference_id）。悬浮窗 TTS 面板里可以直接切换，
 * 设置页「音色」里也可以填任意其它 Fish 声音 ID；留空时用第一个。
 */
object FishVoices {
    val PRESETS: List<Pair<String, String>> = listOf(
        "Voice 1" to "c5cb8f55414945b7bdfdc57a0e2de8f6",
        "Voice 2" to "3b3698528082474791f9dd22f024fd3c"
    )

    val DEFAULT: String get() = PRESETS.first().second

    /** 配置里存的音色（可能为空）→ 实际使用的 reference_id。 */
    fun resolve(configured: String): String = configured.trim().ifBlank { DEFAULT }
}
