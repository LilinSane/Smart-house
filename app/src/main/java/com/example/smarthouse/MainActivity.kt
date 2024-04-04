package com.example.smarthouse

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.smarthouse.data.enums.Coffee
import com.example.smarthouse.data.rooms.Room
import com.example.smarthouse.data.things.AirConditioner
import com.example.smarthouse.data.things.AlarmClock
import com.example.smarthouse.data.things.CoffeeMachine
import com.example.smarthouse.data.things.Light
import com.example.smarthouse.ui.screens.BedroomScreen
import com.example.smarthouse.ui.screens.KitchenScreen
import com.example.smarthouse.ui.screens.LivingRoomScreen
import com.example.smarthouse.ui.screens.MainScreen
import java.time.LocalTime

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val livingRoom = Room(
                painterResource(id = R.drawable.living_room),
                "Зал",
                AirConditioner(
                    painterResource(id = R.drawable.conditioner),
                    name = "AUX",
                    false,
                    initialTemperature = 10.0f
                ),
                Light(painterResource(id = R.drawable.light), true),
                null,
                null
            )
            val bedroom = Room(
                painterResource(id = R.drawable.bedroom),
                "Спальня",
                AirConditioner(
                    painterResource(id = R.drawable.conditioner),
                    name = "AUX",
                    true,
                    initialTemperature = 10.0f
                ),
                Light(painterResource(id = R.drawable.light), true),
                AlarmClock(
                    painterResource(id = R.drawable.alarm_clock),
                    "Casio",
                    true,
                    LocalTime.of(7, 0)
                ),
                null
            )
            val kitchen = Room(
                painterResource(id = R.drawable.kitchen),
                "Кухня",
                AirConditioner(
                    painterResource(id = R.drawable.conditioner),
                    name = "AUX",
                    false,
                    initialTemperature = 10.0f
                ),
                Light(painterResource(id = R.drawable.light), true),
                null,
                CoffeeMachine(
                    painterResource(id = R.drawable.coffee_machine),
                    "Philips",
                    true,
                    Coffee.LATTE,
                    LocalTime.of(7, 0)
                )
            )
            val rooms = listOf<Room>(livingRoom, bedroom, kitchen)
            val navController = rememberNavController()
            val mainScreen = "main"
            val livingRoomRoute = "living_room"
            val bedroomRoute = "bedroom"
            val kitchenRoute = "kitchen"

            NavHost(
                navController = navController,
                startDestination = mainScreen
            ) {
                composable(mainScreen) {
                    MainScreen(rooms = rooms) { room ->
                        var route = ""
                        if (room.name == "Зал") {
                            route = livingRoomRoute
                        }
                        if (room.name == "Спальня") {
                            route = bedroomRoute
                        }
                        if (room.name == "Кухня") {
                            route = kitchenRoute
                        }

                        navController.navigate(route)
                    }
                }
                composable(livingRoomRoute) {
                    LivingRoomScreen(livingRoom = livingRoom)
                }
                composable(bedroomRoute) {
                    BedroomScreen(bedroom = bedroom)
                }
                composable(kitchenRoute) {
                    KitchenScreen(kitchen = kitchen)
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    val livingRoom = Room(
//        painterResource(id = R.drawable.living_room),
//        "Зал",
//        AirConditioner(
//            painterResource(id = R.drawable.conditioner),
//            name = "AUX",
//            false,
//            initialTemperature = 10.0f
//        ),
//        Light(painterResource(id = R.drawable.light), true)
//    )
//    val bedroom = Room(
//        painterResource(id = R.drawable.bedroom),
//        "Спальня",
//        AirConditioner(
//            painterResource(id = R.drawable.conditioner),
//            name = "AUX",
//            true,
//            initialTemperature = 10.0f
//        ),
//        Light(painterResource(id = R.drawable.light), true)
//    )
//    val kitchen = Room(
//        painterResource(id = R.drawable.kitchen),
//        "Кухня",
//        AirConditioner(
//            painterResource(id = R.drawable.conditioner),
//            name = "AUX",
//            false,
//            initialTemperature = 10.0f
//        ),
//        Light(painterResource(id = R.drawable.light), true)
//    )
//    val rooms = listOf<Room>(livingRoom, bedroom, kitchen)
//    val navController = rememberNavController()
//    val mainScreen = "main"
//    val livingRoomRoute = "living_room"
//    val bedroomRoute = "bedroom"
//    val kitchenRoute = "kitchen"
//
//    NavHost(
//        navController = navController,
//        startDestination = mainScreen
//    ) {
//        composable(mainScreen) {
//            MainScreen(rooms = rooms) { room ->
//                var route = ""
//                if (room.name == "Зал") {
//                    route = livingRoomRoute
//                }
//                if (room.name == "Спальня") {
//                    route = bedroomRoute
//                }
//                if (room.name == "Кухня") {
//                    route = kitchenRoute
//                }
//
//                navController.navigate(route)
//            }
//        }
//        composable(livingRoomRoute) {
//            LivingRoomScreen(livingRoom = livingRoom)
//        }
//        composable(bedroomRoute) {
//            BedroomScreen(bedroom = bedroom)
//        }
//        composable(kitchenRoute) {
//
//        }
//    }
//}