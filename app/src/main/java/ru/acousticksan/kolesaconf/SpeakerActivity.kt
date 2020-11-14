package ru.acousticksan.kolesaconf

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.emptyContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import ru.acousticksan.kolesaconf.data.DataProvider
import ru.acousticksan.kolesaconf.data.DirectionType
import ru.acousticksan.kolesaconf.data.Speaker
import ru.acousticksan.kolesaconf.ui.KolesaConf2020Theme
import ru.acousticksan.kolesaconf.ui.blueColor

class SpeakerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val speakerId = intent.getIntExtra("id", 2)
        setContent {
            KolesaConf2020Theme {
                SpeakerScreenComponent(speakerId)
            }
        }
    }

    @Composable
    fun SpeakerScreenComponent(speakerId: Int) {
        val speaker = remember { DataProvider.speakerList.find { it.id == speakerId } }
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Kolesa Conf 2020") },
                    navigationIcon = {
                        IconButton(onClick = {
                            finish()
                        }) {
                            Icon(asset = Icons.Outlined.ArrowBack)
                        }
                    }
                )
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        val share = Intent.createChooser(Intent().apply {
                            action = Intent.ACTION_SEND
                            putExtra(Intent.EXTRA_TEXT, "https://kolesa-conf.kz/")
                            type = "text/plain"
                            // (Optional) Here we're setting the title of the content
                            putExtra(
                                Intent.EXTRA_TITLE,
                                "Онлайн-конференция, объединяющая всё IT-сообщество Казахстана и лучших экспертов СНГ"
                            )
                        }, null)
                        startActivity(share)


                    },
                    icon = {
                        Icon(Icons.Outlined.Share)
                    }
                )
            },
            bodyContent = {
                ScrollableColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            asset = imageResource(speaker!!.avatar),
                            modifier = Modifier
                                .padding(8.dp)
                                .preferredSize(180.dp)
                                .clip(CircleShape)
                                .background(blueColor)
                        )

                        Text(
                            text = speaker.name,
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        if (!speaker.fromKolesa) {
                            Surface(
                                shape = RoundedCornerShape(4.dp),
                                color = Color.White,
                                modifier = Modifier.padding(vertical = 6.dp)
                            ) {
                                Text(
                                    text = "Приглашённый спикер".toUpperCase(),
                                    textAlign = TextAlign.Center,
                                    color = Color.Black,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(4.dp)
                                )
                            }
                        }
                        Text(
                            text = speaker.info,
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            asset = vectorResource(id = R.drawable.ic_baseline_access_time_24),
                            tint = Color.White,
                            modifier = Modifier.preferredSize(32.dp)
                        )
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            color = Color.White,
                            text = speaker!!.time,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Text(
                        modifier = Modifier.padding(bottom = 12.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.White,
                        text = speaker!!.theme
                    )
                    Text(
                        modifier = Modifier.padding(bottom = 8.dp),
                        color = Color.White,
                        text = speaker.description
                    )

                }
            }
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun SpeakerScreenPreview() {
        KolesaConf2020Theme {
            SpeakerScreenComponent(speakerId = 2)
        }
    }
}

