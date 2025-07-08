package com.example.projectwithmvvm.PatternsWidgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectwithmvvm.ViewModel.HomePageVM
import com.example.projectwithmvvm.R

object Widgets {

    @Composable
    fun SetCountryTitleName(
        countryNameIndex: Int,
        homePageVM: HomePageVM
    ) {
        Text(
            text = homePageVM.getLanguage(
                index = countryNameIndex
            ),
            fontSize = stringResource(
                R.string.title_text_font_size
            ).toInt().sp,
            fontWeight = FontWeight.Bold
        )
    }

    @Composable
    fun SetButtonContentText(
        contentText: String
    ) {
        Text(
            text = contentText,
            fontSize = stringResource(
                R.string.normal_button_text_font_size
            ).toInt().sp

        )
    }

    @Composable
    fun SetTitleLanguageIcon(
        iconIndex: Int,
        viewModel: HomePageVM
    ) {
        Image(
            painter = painterResource(id = viewModel.getLanguageIcon(iconIndex)),
            modifier = Modifier
                .size(256.dp)
                .padding(
                    20.dp
                )
                .fillMaxWidth(),
            contentDescription = "logo"
        )
    }

}