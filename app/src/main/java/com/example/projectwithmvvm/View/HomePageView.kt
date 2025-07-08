package com.example.projectwithmvvm.View

import android.media.Image
import android.os.Bundle
import androidx.compose.material3.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.example.projectwithmvvm.PatternsWidgets.Widgets
import com.example.projectwithmvvm.View.ui.theme.ProjectWithMVVMTheme
import com.example.projectwithmvvm.ViewModel.HomePageVM
import com.example.projectwithmvvm.R
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box


class HomePageView : ComponentActivity() {
    val homePageViewModel = HomePageVM()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectWithMVVMTheme {
                Constructor()

            }
        }
    }

    @Composable
    fun Constructor() {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            CreateHomePageDesign(
                viewModel = homePageViewModel
            )
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ProjectWithMVVMTheme {
            Constructor()
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun CreateHomePageDesign(
    viewModel: HomePageVM
) {
    var activeCountryIndex by remember() { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                viewModel.getBackgroundColor(
                    colorIndex = activeCountryIndex
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Widgets.SetTitleLanguageIcon(
                iconIndex = activeCountryIndex,
                viewModel = viewModel
            )
            Widgets.SetCountryTitleName(
                countryNameIndex = activeCountryIndex,
                homePageVM = viewModel
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            )
            {
                Button(
                    modifier = Modifier
                        .padding(stringResource(R.string.normal_button_padding).toInt().dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.transparent),
                        contentColor = Color.Black
                    ),
                    onClick = {
                        if (activeCountryIndex - 1 != -1)
                            activeCountryIndex--
                        else
                            activeCountryIndex = viewModel.getCountOfLanguages - 1
                    }
                ) {

                    Widgets.SetButtonContentText(
                        "Back"
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(stringResource(R.string.normal_button_padding).toInt().dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(R.color.black)
                    ),
                    onClick = {
                        if (activeCountryIndex + 1 != viewModel.getCountOfLanguages)
                            activeCountryIndex++
                        else
                            activeCountryIndex = 0
                    }
                ) {

                    Widgets.SetButtonContentText(
                        "Next"
                    )
                }
            }

            Button(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(stringResource(R.string.normal_button_padding).toInt().dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.black)
                ),
                onClick = {
                    if (activeCountryIndex + 1 != viewModel.getCountOfLanguages)
                        activeCountryIndex++
                    else
                        activeCountryIndex = 0
                }
            ) {

                Widgets.SetButtonContentText(
                    "Open"
                )
            }
        }
    }
}


