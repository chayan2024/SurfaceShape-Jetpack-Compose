package com.withjetpack.surfaceshape_jetpack_compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun SurfaceShape (){

    Row (modifier = Modifier.fillMaxSize()){

        val modifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .padding(12.dp)


        // Rectangle Shape
        Surface(
            shape = RectangleShape,
            modifier = modifier,
            color = (Color(0xFFFDD835))
        ) {

        }

        // Rounder Corner Shape
        Surface(
            shape = RoundedCornerShape(5.dp),
            modifier = modifier,
            color = (Color(0xFFF4511E))
        ) {}

        // Circle Shape
        Surface(
            shape = CircleShape,
            modifier = modifier,
            color = (Color(0xFF26C6DA))
        ) {}

        //
        Surface(
            shape = CutCornerShape(10.dp),
            modifier = modifier,
            color = (Color(0xFF7E57C2))
        ) {}
    }
}
