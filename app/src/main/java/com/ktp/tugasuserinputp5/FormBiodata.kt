package com.ktp.tugasuserinputp5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource

@Composable
fun KontenUtama(modifier: Modifier) {
    var textNamaDepan by remember { mutableStateOf (value = "") }
    var textNamaBelakang by remember { mutableStateOf (value = "") }
    var textEmail by remember { mutableStateOf (value = "") }
    var textTanggalLahir by remember { mutableStateOf (value = "") }
    var textPengalaman by remember { mutableStateOf (value = "") }
    var textSkill by remember { mutableStateOf (value = "") }

    var NamaDepan by remember { mutableStateOf (value = "") }
    var NamaBelakang by remember { mutableStateOf (value = "") }
    var Email by remember { mutableStateOf (value = "") }
    var TanggalLahir by remember { mutableStateOf (value = "") }
    var Pengalaman by remember { mutableStateOf (value = "") }
    var Skill by remember { mutableStateOf (value = "")}

    val listPengalaman = stringArrayResource(id = R.array.listPengalaman)
    val listSkill = stringArrayResource(id = R.array.listSkill)

    Box(
        modifier = modifier.fillMaxSize()
    ){

    }

}