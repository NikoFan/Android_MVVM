package com.example.projectwithmvvm.Model

import androidx.compose.ui.graphics.Color
import com.example.projectwithmvvm.R
import androidx.compose.ui.res.*

class HomePageModel {

    val languageNamesArray = listOf<String>(
        "Python", "C#",
        "C++"
    )

    val languageIconArray = listOf<Int>(
        R.drawable.python_logo, R.drawable.c_sharp_logo,
        R.drawable.cpp_logo,
    )

    val languageColorsArray = listOf<Color>(
        Color(0xFF536BDC), Color(0xFF7A34CC),
        Color(0xFF69C8D9)
    )

    val languageCountNumber: Int = languageNamesArray.size
}