package com.example.projectwithmvvm.Model

import com.example.projectwithmvvm.Storage.DataClass

class MainWindowModel {
    val selectedProgrammingLanguage: String? = DataClass.getSelectedLanguage
    var pages = listOf<String>(
        "About", "Books", "Lessons", "Git"
    )
}