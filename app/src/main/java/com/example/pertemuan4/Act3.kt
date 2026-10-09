
package com.example.pertemuan4

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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivityLessPerson(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            // Judul program studi
            Text(
                text = stringResource(R.string.prodi),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )

            // Nama universitas
            Text(
                text = stringResource(R.string.Universitas),
                fontSize = 22.sp
            )

            Spacer(
                modifier = Modifier.height(25.dp)
            )

            // Card biodata mahasiswa
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray
                )
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    // Logo UMY
                    Image(
                        painter = painterResource(
                            id = R.drawable.logo_umy
                        ),
                        contentDescription = stringResource(
                            R.string.Universitas
                        ),
                        modifier = Modifier
                            .size(80.dp)
                            .padding(5.dp)
                    )

                    Spacer(
                        modifier = Modifier.width(15.dp)
                    )

                    // Informasi mahasiswa
                    Column {

                        Text(
                            text = stringResource(R.string.Nama),
                            fontSize = 22.sp,
                            fontFamily = FontFamily.Cursive,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Spacer(
                            modifier = Modifier.height(8.dp)
                        )

                        Text(
                            text = stringResource(R.string.Alamat),
                            fontSize = 18.sp,
                            color = Color.Yellow
                        )

                        Spacer(
                            modifier = Modifier.height(8.dp)
                        )

                        Text(
                            text = stringResource(R.string.prodi),
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }

        // Copyright di bagian bawah layar
        Text(
            text = stringResource(R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp),
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
}