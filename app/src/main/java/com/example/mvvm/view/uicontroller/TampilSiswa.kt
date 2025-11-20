package com.example.mvvm.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusUISiswa
    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit
)