package com.example.projectwithmvvm.PatternsWidgets

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectwithmvvm.Model.MainWindowModel
import com.example.projectwithmvvm.ViewModel.HomePageVM
import com.example.projectwithmvvm.R
import com.example.projectwithmvvm.ViewModel.MainWindowVM

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
    fun SetNormalText(
        contentText: String
    ) {
        Column(
            modifier = Modifier
                .height(128.dp),
            verticalArrangement = Arrangement.Center

        ) {
            val languages = mapOf<String, String>(
                "python" to "Python 3",
                "csharp" to "C# .Net",
                "cpp" to "C++"
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(10.dp),
                text = languages[contentText].toString(),
                fontSize = stringResource(
                    R.string.normal_text_font_size
                ).toInt().sp,
                softWrap = true

            )
        }

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

    @Composable
    fun SetSmallImage() {
        Image(
            painter = painterResource(id = MainWindowVM().getImage),
            modifier = Modifier
                .size(128.dp)
                .padding(
                    20.dp
                )
                .fillMaxWidth(),
            contentDescription = "logo"
        )
    }

}