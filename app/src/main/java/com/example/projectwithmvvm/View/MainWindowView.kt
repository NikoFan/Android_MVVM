package com.example.projectwithmvvm.View

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.projectwithmvvm.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectwithmvvm.PatternsWidgets.Widgets
import com.example.projectwithmvvm.Storage.DataClass
import com.example.projectwithmvvm.View.ui.theme.ProjectWithMVVMTheme
import com.example.projectwithmvvm.ViewModel.MainWindowVM

class MainWindowView : ComponentActivity() {
    val mainWindowViewModel = MainWindowVM();

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
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
//            CreateHomePageDesign(
//                viewModel = mainWindowViewModel
//            )
            SetupPageInterface(
                viewModel = mainWindowViewModel
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

@Composable
fun SetupPageInterface(
    viewModel: MainWindowVM
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Top


    ) {
        Widgets.SetSmallImage()
        Widgets.SetNormalText(
            DataClass.getSelectedLanguage.toString()
        )


    }

    var activePage by remember { mutableStateOf("") }
    Text(
        text = activePage
    )

    Row (
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ) {



        Btn(
            btnContent = "About"
        ) {activePage = "about information" }
        Btn(
            btnContent = "Books"
        ) {activePage = "Read" }
        Btn(
            btnContent = "Lessons"
        ) {activePage = "Study" }
        Btn(
            btnContent = "Git"
        ) {activePage = "my Git" }


    }
}

@Composable
fun Btn(
    btnContent: String,
    onClick: () -> Unit
) {
    Button(
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color.Black
        ),
        onClick = onClick
    ) {
        Widgets.SetButtonContentText(
            btnContent
        )
    }
}