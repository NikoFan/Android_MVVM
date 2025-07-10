package com.example.projectwithmvvm.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectwithmvvm.Model.MainWindowModel
import com.example.projectwithmvvm.R
class MainWindowVM : ViewModel() {
    private val displayLanguage: String? = MainWindowModel().selectedProgrammingLanguage
    private val pagesArray = MainWindowModel().pages
    private val imagesMap = MainWindowModel().images

    val getActiveLanguage : String?
        get() = displayLanguage

    val getImage : Int
        get() = imagesMap[displayLanguage].toString().toInt()


    fun getActivePageTitle(pageIndex: Int) : String{
        return pagesArray[pageIndex]
    }





}