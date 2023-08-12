package com.example.composenavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(navController: NavController) {
    var userName by remember { mutableStateOf("") }
    var passwordName by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("My App")
            })
        },
        content = {
            padding ->
            Column(verticalArrangement = Arrangement.Top, modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(padding)) {
                Box(modifier = Modifier.size(0.dp,30.dp))
                Text("App Name", modifier = Modifier
                    .padding(vertical = 20.dp)
                    .fillMaxWidth()
                    , fontSize = 55.sp)
                Box(modifier = Modifier.size(0.dp,10.dp))
                TextField(value = userName, onValueChange = {
                                                            userName=it
                },
                    textStyle = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    ),modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 10.dp),
                placeholder = { Text(text = "Enter User Name")})

                TextField(value = passwordName, onValueChange = {
                                                      passwordName=it
                },
                    textStyle = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    ),modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 10.dp),
                    placeholder = { Text(text = "Enter User Password")})

                Box(modifier = Modifier.size(0.dp,100.dp))
                Button(onClick = {
                    navController.navigate(Screen.SignUpScreen.routes)
                }, modifier = Modifier
                    .size(200.dp, 60.dp)
                    .align(Alignment.CenterHorizontally),) {
                    Text(text = "SignUp")
                }
                Box(modifier = Modifier.size(0.dp,10.dp))
                Button(onClick = {
                    navController.navigate(Screen.ForgotScreen.routes)
                }, modifier = Modifier
                    .size(200.dp, 60.dp)
                    .align(Alignment.CenterHorizontally),) {
                    Text(text = "Forgot Password?")
                }
            }
        }
    )

}
@Preview(showBackground = true, name = "LoginPreview")
@Composable
fun LoginPreview() {
    val navController= rememberNavController()
    ComposeNavigationTheme {
        SignUpPage(navController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpPage(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("Sign Up")
            }, navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            })
        },
        content = {
                padding ->
        }
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPage(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("Forgot Password")
            }, navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            })
        },
        content = {
                padding ->
        }
    )
}