package com.example.projectwithmvvm.Model

import com.example.projectwithmvvm.Storage.DataClass
import com.example.projectwithmvvm.R

class MainWindowModel {
    val selectedProgrammingLanguage: String? = DataClass.getSelectedLanguage
    val pages = listOf<String>(
        "About", "Books", "Lessons", "Git"
    )

    val images = mapOf(
        "python" to R.drawable.python_logo,
        "csharp" to R.drawable.c_sharp_logo,
        "cpp" to R.drawable.cpp_logo
    )
}