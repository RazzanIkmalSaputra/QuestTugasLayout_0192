package com.example.questtugaslayout_0192


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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                stringResource(R.string.Prodi),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                stringResource(R.string.Univ),
                fontSize = 14.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(25.dp))

            WidgetCard(
                nama = R.string.Nama1,
                alamat = R.string.Alamat1,
                warnaBg = R.color.card_0_bg,
                warnaAlamat = R.color.text_yellow,
                isCursive = true
            )

            WidgetCard(
                nama = R.string.Nama2,
                noTelp = R.string.Telp2,
                alamat = R.string.Alamat2,
                warnaBg = R.color.card_1_bg,
                warnaNoTelp = R.color.text_cyan,
                warnaAlamat = R.color.text_orange
            )

            WidgetCard(
                nama = R.string.Nama3,
                noTelp = R.string.Telp3,
                alamat = R.string.Alamat3,
                warnaBg = R.color.card_2_bg,
                warnaNoTelp = R.color.text_cyan,
                warnaAlamat = R.color.white
            )

            WidgetCard(
                nama = R.string.Nama4,
                noTelp = R.string.Telp4,
                alamat = R.string.Alamat4,
                warnaBg = R.color.card_3_bg,
                warnaNoTelp = R.color.text_cyan,
                warnaAlamat = R.color.white
            )
        }

        Text(
            stringResource(R.string.Copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 30.dp),
            fontSize = 12.sp,
            color = Color.Black
        )
    }
}

@Composable
fun WidgetCard(
    nama: Int,
    noTelp: Int? = null,
    alamat: Int,
    warnaBg: Int,
    warnaNoTelp: Int? = null,
    warnaAlamat: Int,
    isCursive: Boolean = false
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(horizontal = 16.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaBg)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val gambar = painterResource(R.drawable.umy)

            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    stringResource(nama),
                    fontSize = 18.sp,
                    fontFamily = if (isCursive) FontFamily.Cursive else FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                if (noTelp != null && warnaNoTelp != null) {
                    Text(
                        stringResource(noTelp),
                        fontSize = 12.sp,
                        color = colorResource(warnaNoTelp),
                        modifier = Modifier.padding(top = 2.dp)
                    )
                }

                Text(
                    stringResource(alamat),
                    fontSize = 12.sp,
                    color = colorResource(warnaAlamat),
                    modifier = Modifier.padding(top = 2.dp)
                )
            }

            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .padding(5.dp)
            )
        }
    }
}