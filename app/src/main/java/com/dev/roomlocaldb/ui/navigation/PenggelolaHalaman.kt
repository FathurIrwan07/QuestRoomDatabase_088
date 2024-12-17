package com.dev.roomlocaldb.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.compose.rememberNavController
import com.dev.roomlocaldb.ui.view.mahasiswa.DestinasiInsert
import com.dev.roomlocaldb.ui.view.mahasiswa.InsertMhsView
import com.dev.roomlocaldb.ui.view.mahasiswa.DetailMhsView
import com.dev.roomlocaldb.ui.view.mahasiswa.HomeMhsView
import com.dev.roomlocaldb.ui.view.mahasiswa.UpdateMhsView


@Composable
fun PenggelolaHalaman(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route) {

        composable(
            route = DestinasiHome.route
        ) {
            HomeMhsView(
                onDetailClick = {nim ->
                    navController.navigate("${DestinasiDetail.route}/$nim")
                    println(
                        "PengelolaHalaman: nim = $nim"
                    )
                },
                onAddMhs = {
                    navController.navigate(DestinasiInsert.route)
                },
                modifier = modifier
            )
        }

        composable(
            route = DestinasiInsert.route
        ) {
            InsertMhsView(
                onBack = {
                    navController.popBackStack()
                },
                onNavigate = {
                    navController.popBackStack()
                },
                modifier = modifier,
            )
        }


    }
}