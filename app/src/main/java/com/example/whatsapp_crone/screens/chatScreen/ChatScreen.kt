package com.example.whatsapp_crone.screens.chatScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.CameraEnhance
import androidx.compose.material.icons.filled.Filter
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_crone.R
import com.example.whatsapp_crone.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen(
    modifier: Modifier = Modifier,
    onBack: () -> Unit
) {

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "")
                    }
                },
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Image(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(shape = CircleShape),
                            painter = painterResource(R.drawable.ic_launcher_background),
                            contentDescription = ""
                        )
                        Text(text = "David", style = MaterialTheme.typography.titleMedium)
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Videocam, contentDescription = "")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Phone, contentDescription = "")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.MoreVert, contentDescription = "")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.background
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedTextField(
                        modifier = Modifier
                            .weight(1f)
                            .height(50.dp),
                        shape = CircleShape,
                        value = "",
                        leadingIcon = {
                            IconButton(
                                onClick = {},
                            ) {
                                Icon(Icons.Filled.Filter, contentDescription = "")
                            }
                        },
                        trailingIcon = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                IconButton(
                                    onClick = {},
                                ) {
                                    Icon(Icons.Filled.AttachFile, contentDescription = "")
                                }
                                IconButton(
                                    onClick = {},
                                ) {
                                    Icon(Icons.Filled.CameraEnhance, contentDescription = "")
                                }
                            }
                        },
                        onValueChange = {}
                    )
                    IconButton(
                        onClick = {},
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Green
                        )
                    ) {
                        Icon(Icons.Filled.Mic, contentDescription = "")
                    }
                }
            }
        }

    ) {
        LazyColumn(
            modifier = Modifier
                .padding(it),
            contentPadding = PaddingValues(vertical = 4.dp, horizontal = 12.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(count = 30) {
                ChatMessageCard(message = "Ola, tudo bem")
            }
        }
    }
}

@Composable
fun ChatMessageCard(
    modifier: Modifier = Modifier,
    message: String
) {

    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)

    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = message, style = MaterialTheme.typography.bodyMedium)
            Text(
                text = "11:40",
                modifier = Modifier.align(Alignment.End),
                style = MaterialTheme.typography.labelSmall,
                fontSize = 9.sp
            )
        }
    }
}

@Preview
@Composable
private fun ChatScreenPreview() {
    ChatScreen(onBack = {})
}