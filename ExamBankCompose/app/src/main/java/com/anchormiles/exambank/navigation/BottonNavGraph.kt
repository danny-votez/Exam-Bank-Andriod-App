package com.anchormiles.exambank.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.anchormiles.exambank.presentation.dashboardviews.AcademicYearView
import com.anchormiles.exambank.presentation.dashboardviews.HomeDashboard
import com.anchormiles.exambank.presentation.paperviews.ExamPaperView
import com.anchormiles.exambank.presentation.paperviews.ExamPaperView2019
import com.example.exambank.viewscreens.AccountView

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = BottomBarScreen.Home.route
    ){
        composable(route = BottomBarScreen.Home.route){
            HomeDashboard(navController = navController)
        }
        composable(route = BottomBarScreen.Papers.route){
            AcademicYearView(navController = navController)
        }
        composable(route = BottomBarScreen.Account.route){
           AccountView(navController = navController)
        }
        composable(route = Routes.AcademicYearView.route){
            AcademicYearView(navController = navController)
        }
        composable(route = Routes.FullExamPaper.route){
            ExamPaperView()
        }
        composable(route = Routes.SeptDec2019.route){
            ExamPaperView2019()
        }
    }
}