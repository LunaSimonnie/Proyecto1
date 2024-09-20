package com.example.proyect1

/*import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.proyect1.ui.theme.Proyect1Theme
import com.example.proyect1.ui.theme.Screens.HomeScreen
import com.example.proyect1.ui.theme.Screens.MenuScreen
import java.security.AccessController

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            multiScreenApp()

           /*Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CustomText()
                Picture()
                Content1()


                // Text(text ="Simple text")
                // ModifierExample()
                //ModifierExample2()
                //  ModifierExample3()
            }
            //Layouts
            Column {
                 Text(text = "First Row")
                 Text(text = "Second Row")
                 Text(text = "Third Row")

                 Row{
                     Text(text = "Text1")
                     Text(text = "Text2")
                     Text(text = "Text3")
                     Text(text = "Text2")
                 }
                 Box{
                     Text(text = "Larabel 1")
                     Text(text = "Larabel 2")

                 }
                 Greeting(name ="World")
             }*/
        }
    }
}

/*private fun column(function: () -> Unit) {

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


//@Preview(showBackground = true)
@Composable
fun ModifierExample() {
    Column(
        modifier = Modifier
            .padding(24.dp)
    ) {
        Text(text = "Hello world")

    }
}

//@Preview(showBackground = true)
@Composable
fun ModifierExample2() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .clickable(onClick = { clickAction() })
    ) {
        Text(text = "Hello world")

    }
}

//@Preview(showBackground = true)
@Composable
fun ModifierExample3() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .background(Color.Red)
            .border(width = 2.dp, color = Color.Green)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Hello Item 1")
        Text(text = "Hello Item 2")
        Text(text = "Hello Item 3")
        Text(text = "Hello Item 4")
        Text(text = "Hello Item 5")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomText() {
    Column {
        Text(
            stringResource(R.string.hello_word_text),
            color = colorResource(R.color.purple_500),
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold
        )
        val gradientColors = listOf(Cyan, Blue, Color.Red)
        Text(
            stringResource(R.string.hello_word_text),
            style = TextStyle(brush = Brush.linearGradient(colors = gradientColors))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Picture() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(R.drawable.Leon),
            contentDescription = "Logo Android",
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun Content1() {
    Card(
        modifier = Modifier
            .background(Cyan)
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Text(
            text = "This is a Title",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(id = R.drawable.Leon),
            contentDescription = "Logo Android",
            contentScale = ContentScale.Crop
        )
        Text(
            stringResource(R.string.Text_Card),
            textAlign = TextAlign.Justify,
            lineHeight = 18.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BoxExample1(){
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Image(painterResource(R.drawable.Leon),
            contentDescription = "Android Logo",
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp,150.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Filled.AccountCircle,
                contentDescription = "Icon"
            )
            Text(text = "Text")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExample2(){
    Box(
        modifier = Modifier
            .background(Color.Magenta)
            .padding(5.dp)
            .size(250.dp)
    ) {
        Text(text = "TopStart", Modifier.align(Alignment.TopStart))
        Text(text = "TopEnd", Modifier.align(Alignment.TopEnd))
        Text(text = "CenterStart", Modifier.align(Alignment.CenterStart))
        Text(text = "Center", Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))
        Text(text = "BottomStart", Modifier.align(Alignment.BottomStart))
        Text(text = "BottomEnd", Modifier.align(Alignment.BottomEnd))
    }
}

fun clickAction() {
    println("Column Clicked")
*
}*/

@Composable
fun multiScreenApp(){
    val navController=rememberNavController()
    Surface (color = Color.White){
        setupNavGraph(navController=navController)
    }
}

@Composable
fun setupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "menu") {
        composable("menu") {
            MenuScreen(navController)
        }
        composable("home") {
            HomeScreen(navController)
        }
    }
}*/
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prueba_calendario.ui.theme.Prueba_CalendarioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prueba_CalendarioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PeriodDays()
                }
            }
        }
    }
}

@Composable
fun PeriodDays() {
    // Listas de números y mensajes
    val days = listOf(4, 9, 6, 23)
    val messages = listOf(
        "Días hasta periodo fértil",
        "Días hasta la ovulación",
        "Día del ciclo",
        "Días hasta el periodo"
    )
    val meses = listOf(
        "enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    )

    // Agrupar tarjetas y meses en una columna
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Generar fila de tarjetas
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            days.zip(messages).forEach { (day, message) ->
                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .height(250.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White, // Color de fondo blanco
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "$day",
                            style = MaterialTheme.typography.headlineLarge.copy(
                                fontWeight = FontWeight.Bold,
                                fontSize = 50.sp // Tamaño del número a 50sp
                            ),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = message,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontSize = 14.sp
                            ),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.weight(1f)) // Espacio para que el botón quede abajo
                        Button(
                            onClick = { /* Acción del botón */ },
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFF3759A), // Rosa fuerte
                                contentColor = Color.White
                            )
                        ) {
                            Text("Editar periodo")
                        }
                    }
                }
            }
        }

        // Generar fila de meses que se desplaza horizontalmente
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            meses.forEach { mes ->
                Text(
                    text = mes,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}