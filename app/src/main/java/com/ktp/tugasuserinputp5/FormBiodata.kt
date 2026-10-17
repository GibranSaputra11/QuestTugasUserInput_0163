package com.ktp.tugasuserinputp5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun KontenUtama(modifier: Modifier) {
    var textNamaDepan by remember { mutableStateOf (value = "") }
    var textNamaBelakang by remember { mutableStateOf (value = "") }
    var textEmail by remember { mutableStateOf (value = "") }
    var textTanggalLahir by remember { mutableStateOf (value = "") }
    var textPengalaman by remember { mutableStateOf (value = "") }
    var textSkill by remember { mutableStateOf (value = "") }
}