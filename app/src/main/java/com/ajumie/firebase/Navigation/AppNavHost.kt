package com.ajumie.firebase.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ajumie.firebase.ui.theme.Screens.Home.HomeScreen
import com.ajumie.firebase.ui.theme.Screens.Login.LoginScreen
//import com.ajumie.firebase.ui.theme.Screens.Products.AddProductsScreen
//import com.ajumie.firebase.ui.theme.Screens.Products.UpdateProductsScreen
//import com.ajumie.firebase.ui.theme.Screens.Products.ViewProductsScreen
//import com.ajumie.firebase.ui.theme.Screens.Products.ViewUploadsScreen
import com.ajumie.firebase.ui.theme.Screens.Register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier , navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
    }

}