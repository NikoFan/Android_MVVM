package com.example.projectwithmvvm.Storage

data object DataClass {
    private var selectedLanguageName: String? = null

    var getSelectedLanguage : String?
        set(value) {
            selectedLanguageName = value
        }
        get() = selectedLanguageName


}