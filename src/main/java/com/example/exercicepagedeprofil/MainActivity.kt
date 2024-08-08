package com.example.exercicepagedeprofil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercicepagedeprofil.ui.theme.ExercicePageDeProfilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExercicePageDeProfilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {


    MySurface()
    MyColumn()
}


//pour aligner les element
@Composable
fun MyColumn (){
    Column(
          modifier = Modifier.
          fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp))
    {

                MyBox()
                Spacer(modifier = Modifier.height(70.dp))
                    MyText()
                    Spacer(modifier = Modifier.height(30.dp))
                    MyRow()


    }
}

//mettre l'image en arrière plan

@Composable
fun MyImage(){
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = stringResource(id = R.string.imageDesc),
            modifier = Modifier.
            fillMaxSize(),

        )


}

//image de profil

@Composable
fun MyImageProfil(){
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = stringResource(id = R.string.imageProfil),
        contentScale = ContentScale.Crop,


        modifier = Modifier
            .size(100.dp)
            .height(50.dp)
            .clip(CircleShape)





        )


}



//apprendre les textes

@Composable
fun MyText(){
    Text(
        text= stringResource(id = R.string.hello),
       color = Color.Black,


        fontSize = 20.sp,
        modifier= Modifier.
        height(350.dp).
        padding(50.dp)




    )
}


// contact

@Composable
fun MyRow(){
    Row( modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,)

    {
            MyVector()
            MyVector()
            MyVector()
    }
}


@Composable

fun MyBox() {

    Box( modifier = Modifier.fillMaxWidth(),
        propagateMinConstraints = false,
        contentAlignment = Alignment.BottomStart,) {
        Image(
            painter = painterResource(id = R.drawable.cover),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)

            )
            MyImageProfil()

    }
}


@Composable

fun MySurface (){
    Surface() {
        MyText()
    }

}

@Composable
fun MyVector(){
    Image( imageVector = Icons.Default.AccountBox,contentDescription = null)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExercicePageDeProfilTheme {
           Greeting()
    }
}