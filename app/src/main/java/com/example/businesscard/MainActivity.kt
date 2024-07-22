package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
//import androidx.compose.material.Icon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(){
                    Textkap(name = "Syed Ahmed Haroon", role = "Junior Android Developer",phoneNu = stringResource(id = R.string.phNO), emaily = stringResource(id = R.string.email), socials = stringResource(id = R.string.socials),modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Textkap(name : String,role : String, phoneNu : String ,emaily : String, socials : String, modifier: Modifier ){
    val image = painterResource(id = R.drawable.android_logo)

    Column(modifier = Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = image, contentDescription = "green colored android logo", modifier = Modifier
            .size(80.dp)
            .padding(12.dp))
        Text(text = name, fontSize = 24.sp, color = Color(0xFF3ddc84))
        Text(text = role, fontSize = 12.sp)
        Text(text = phoneNu, fontSize = 9.sp, modifier= Modifier.padding(0.dp,250.dp,0.dp,0.dp))
        Text(text = emaily, fontSize = 9.sp, modifier= Modifier.padding(2.dp,2.dp,2.dp,2.dp))
        Text(text = socials, fontSize = 9.sp, modifier= Modifier.padding(2.dp))
    }


}

@Preview(showBackground = true)
@Composable
fun BCPreview() {
    BusinessCardTheme {
        Textkap(name = "Syed Ahmed Haroon", role = "Junior Android Developer",phoneNu = stringResource(id = R.string.phNO), emaily = stringResource(id = R.string.email), socials = stringResource(id = R.string.socials),modifier = Modifier)

    }
}