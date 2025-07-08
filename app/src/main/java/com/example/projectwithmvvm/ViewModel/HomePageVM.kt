package com.example.projectwithmvvm.ViewModel

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.projectwithmvvm.Model.HomePageModel

class HomePageVM : ViewModel() {
    private val _languages = HomePageModel().languageNamesArray
    private val _logos = HomePageModel().languageIconArray

    // Метод для возврата количества стран
    public val getCountOfLanguages: Int
        get() = HomePageModel().languageCountNumber

    public fun getLanguage(
        index: Int
    ): String {
        return _languages[index]
    }

    public fun getLanguageIcon(
        index: Int
    ): Int {
        return _logos[index]
    }

    public fun getBackgroundColor(
        colorIndex: Int
    ) : Color{
        return HomePageModel().languageColorsArray[colorIndex]
    }


}