package com.example.projectwithmvvm.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectwithmvvm.Model.MainWindowModel

class MainWindowVM : ViewModel() {
    private val displayLanguage: String? = MainWindowModel().selectedProgrammingLanguage
    private val pagesArray = MainWindowModel().pages

    val getActiveLanguage : String?
        get() = displayLanguage


    fun getActivePageTitle(pageIndex: Int) : String{
        return pagesArray[pageIndex]
    }



}