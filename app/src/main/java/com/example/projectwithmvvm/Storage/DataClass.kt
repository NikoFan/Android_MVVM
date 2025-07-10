package com.example.projectwithmvvm.Storage

data object DataClass {
    private var selectedLanguageName: String? = null
    private val languagesNavigator = mapOf(
        0 to "python",
        1 to "csharp",
        2 to "cpp"
    )

    var getSelectedLanguage : String?
        set(value) {
            selectedLanguageName = value
        }
        get() = selectedLanguageName

    val getLanguageMap : Map<Int, String>
        get() = languagesNavigator


}