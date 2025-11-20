package com.example.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


data class Siswa(
    val nama : String = "",
    val gender : String = "",
    val alamat : String = ""
)

class SiswaViewModel : ViewModel() {

    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI : StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa (ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2]
            )
        }
    }
}