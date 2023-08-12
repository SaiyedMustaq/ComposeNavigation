import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.ForgotPage
import com.example.composenavigation.LoginPage
import com.example.composenavigation.Screen
import com.example.composenavigation.SignUpPage

@Composable
fun NavigationHost(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.LoginScreen.routes){
        composable(route=Screen.LoginScreen.routes){
            LoginPage(navController = navController)
        }
        composable(route=Screen.SignUpScreen.routes){
            SignUpPage(navController = navController)
        }
        composable(route=Screen.ForgotScreen.routes){
            ForgotPage(navController = navController)
        }
    }
}