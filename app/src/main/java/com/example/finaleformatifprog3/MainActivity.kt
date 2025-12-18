package com.example.finaleformatifprog3


import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.width

import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.finaleformatifprog3.ui.theme.FinaleFormatifProg3Theme

//class MainActivity : ComponentActivity() {
//    @OptIn(ExperimentalMaterial3Api::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            FinaleFormatifProg3Theme {
//                Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
//
//                    TopAppBar(title = { Text(text = "Mise en Page", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()) })
//
//                }
//
//
//
//                )
//
//                { innerPadding -> NavHost(navController = navController)
//
//
//
//
//
//
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                   )
//
//
//
//                }
//            }
//        }
//    }
//}

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class) //important?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinaleFormatifProg3Theme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                text = "yo mama",

                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    )
                }) { innerPadding ->




                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                   )


//                    NavHost(
//                        navController = navController,
//                        startDestination = "list",
//                        modifier = Modifier.padding(innerPadding)
//                    ) {
//                        composable("list") {
//                            InterfaceListe(navController)
//                        }
//
//                        composable(
//                            route = "detail/{name}",
//                            arguments = listOf(navArgument("name") { type = NavType.StringType })
//                        ) { backStackEntry ->
//                            val encoded = backStackEntry.arguments?.getString("name")
//                            val name = encoded?.let { Uri.decode(it) } ?: ""
//                            DetailScreen(name = name, navController = navController)
//                        }
//                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // kept for compatibility; do not create a NavController here to avoid confusion
   yomama()
}



@Composable
fun Final(modifier: Modifier = Modifier) {
    Row(modifier = Modifier.fillMaxSize()) {
        Text(
            "yo",
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Red)
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(400.dp))
            Button(onClick = {  }, modifier = Modifier.fillMaxWidth()) {
                Text("Ahah !")
            }
            Button(onClick = {  }, modifier = Modifier.fillMaxWidth()) {
                Text("Ohoh !")
            }
        }
    }
}


@Composable
fun ExamenFinalw(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { }, modifier = Modifier.fillMaxWidth())
        { Text("Popopo !") }
        Spacer(modifier = Modifier.weight(1f))
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(200.dp)
                    .background(Color.Blue)
            ) { }
            Text(
                text = "Plop plop plop",
                modifier = Modifier
                    .weight(2f)
                    .padding(8.dp)
            )
        }
    }
}

@Composable

fun ImagesVersActivites(){

    Column(modifier =Modifier.fillMaxSize()) {



        Spacer(modifier = Modifier.height(100.dp))
    Button(onClick = {}, modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)) {
        Text("Examen")
    }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {



            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)) {  }
            Column(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Black)) {  }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {

            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Blue)) {  }
            Column(modifier = Modifier
                .fillMaxSize()
                .weight(1f)) {

                Spacer(modifier = Modifier.height(175.dp))

                Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                    Text("Bouton")
                }

            }


        }




    }

}

// kotlin
@Composable
fun InterfaceListe(navController: NavController, modifier: Modifier = Modifier) {
    val liste = listOf(
        "Alain", "Bob", "Charles", "David", "Eve", "Francis",
        "George", "Helene", "Ian", "Jackie", "Kevin", "Laura",
        "Monique", "Nicolas", "Olivia", "Paul", "Quentin", "Rachel",
        "Steve", "Tracy"
    )

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(liste) { index, name ->
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // left spacing (optional)
                    Spacer(modifier = Modifier.width(15.dp))

                    Button(
                        onClick = {
                            // debug: show a toast and log to ensure click fires

                            // navigate to detail screen, encode name to be safe using Uri (already imported)
                            val encoded = Uri.encode(name)
                            navController.navigate("detail/$encoded")
                        },
                         modifier = Modifier.size(40.dp),
                         contentPadding = PaddingValues(0.dp),
                         shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp)
                     ) {
                         Text(text = "X")
                     }

                     Spacer(modifier = Modifier.width(70.dp))

                     // Text takes remaining space; not too large a weight so divider aligns well
                     Text(
                         text = name,
                         modifier = Modifier.weight(1f),
                         fontSize = 20.sp,
                         color = Color.Black
                     )
                 }

                 // Divider placed outside the Row so it draws as a full-width horizontal line
                 HorizontalDivider(
                     modifier = Modifier
                         .fillMaxWidth()
                         .padding(start = 58.dp), // align divider start with the text (6 + 40 + 12)
                     color = Color.LightGray,
                     thickness = 1.dp
                 )
             }
         }
     }
}


@Composable
fun DetailScreen(name: String, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Je m'appelle $name",
            fontSize = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Retour")
        }
    }
}


@Composable
fun ExamenFinal(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {

        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { }, modifier = Modifier.fillMaxWidth())
        { Text("Popopo !") }


        Spacer(modifier = Modifier.height(500.dp))



        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(200.dp)
                    .background(Color.Blue)
            ) { }
            Text(
                text = "Plop plop plop",
                modifier = Modifier
                    .weight(2f)
                    .padding(8.dp)
            )
        }
    }
}


@Composable
fun AlignmentArrangementDemo() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray).fillMaxSize(),

        // VERTICAL ARRANGEMENT (top → bottom)
        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalArrangement = Arrangement.SpaceBetween
        // HORIZONTAL ALIGNMENT (left / center / right)
//        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Row(modifier = Modifier.fillMaxWidth()) {


            Text(
                text = "Top",
                modifier = Modifier.background(Color.Red).padding(20.dp)
            )
        }


        Text(
            text = "Middle",
            modifier = Modifier.background(Color.Green)  //.fillMaxHeight()
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Bottom",
                modifier = Modifier.padding(end = 40.dp).background(Color.Blue)
            )
        }
    }
}


//Column(
//    verticalArrangement = ...
//    horizontalAlignment = ...
//)

//Row(
//horizontalArrangement = ...
//verticalAlignment = ...
//)




@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .height(100.dp)
            .background(Color.Yellow)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(modifier = Modifier.fillMaxHeight().weight(1f),
            verticalArrangement = Arrangement.SpaceEvenly) {

            Text(text = "left", modifier = Modifier.background(Color.Red))
            Text(text = "left")
            Text(text = "left")
            Text(text = "left")
        }

        Column(modifier = Modifier.fillMaxWidth().weight(1f).padding(start = 120.dp).padding(bottom = 400.dp)) {

            Text(text = "left", modifier = Modifier.padding(bottom = 100.dp).background(Color.Blue), color = Color.Red)
            Text(text = "left")
            Text(text = "left")
            Text(text = "left")
            Text(text = "left")
            Text(text = "left")
        }

        Spacer(modifier = Modifier.padding(top = 300.dp))




//        Text(text = "left")
//        Text(text = "left")
    }
}



@Composable

fun yomama(modifier: Modifier = Modifier) {


    Column(modifier = Modifier.fillMaxSize()) {





            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {

                Box(modifier = Modifier.weight(4f).fillMaxHeight().background(Color.Blue))

                Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.Black))
            }










        Row(modifier = Modifier.fillMaxWidth().weight(2f).padding(top = 200.dp), horizontalArrangement = Arrangement.Center   ) {



            Button(onClick = {}, modifier = Modifier.fillMaxWidth().padding(15.dp)) {
                Text("Coucou")
            }}


    }



//    Column(modifier = modifier.fillMaxSize()) {
//
//        // 🔹 TOP COLORED ROW (1/3)
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//        ) {
//
//            Box(
//                modifier = Modifier
//                    .weight(4f)
//                    .fillMaxHeight()
//                    .background(Color.Blue)
//            )
//
//            Box(
//                modifier = Modifier
//                    .weight(1f)
//                    .fillMaxHeight()
//                    .background(Color.Black)
//            )
//        }
//
//        // 🔹 BOTTOM AREA (2/3)
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(2f),
//            contentAlignment = Alignment.Center
//        ) {
//
//            Button(
//                onClick = {},
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(15.dp)
//            ) {
//                Text("Coucou")
//            }
//        }
//    }



}



//        Text(
//            text = "Left",
//            modifier = Modifier
//                .padding(start = 8.dp)
//                .background(Color.Red)
//        )
//
//        Text(
//            text = "Center",
//            modifier = Modifier
//                .background(Color.Green)
//        )
//
//        Text(
//            text = "Right",
//            modifier = Modifier
//                .padding(end = 8.dp)
//                .background(Color.Blue)
//        )