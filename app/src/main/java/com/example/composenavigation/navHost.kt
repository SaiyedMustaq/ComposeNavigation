import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.ForgotPage
import com.example.composenavigation.LoginPage
import com.example.composenavigation.NavigationScreen
import com.example.composenavigation.SignUpPage

@Composable
fun NavigationHost(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = NavigationScreen.LoginNavigationScreen.routes){
        composable(route=NavigationScreen.LoginNavigationScreen.routes){
            LoginPage(navController = navController)
        }
        composable(route=NavigationScreen.SignUpScreen.routes+"/{name}",
        arguments = listOf(
            navArgument("name"){
                type= NavType.StringType
                defaultValue=""
                nullable=true
            }
        )){entry->
            entry.arguments?.getString("name")?.let { SignUpPage(navController,name= it) }
        }
        composable(route=NavigationScreen.ForgotNavigationScreen.routes){
            ForgotPage(navController = navController)
        }
    }
}