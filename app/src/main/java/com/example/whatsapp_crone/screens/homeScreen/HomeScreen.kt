package com.example.whatsapp_crone.screens.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.DataUsage
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_crone.R
import com.example.whatsapp_crone.screens.Screen
import com.example.whatsapp_crone.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onChangeNavigator: ((Screen) -> Unit)? = null
) {

    var showMenu by remember { mutableStateOf(false) }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "WhatsApp",
                        style = MaterialTheme.typography.titleMedium,
                        fontSize = 20.sp
                    )
                },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            Icons.Filled.CameraAlt,
                            contentDescription = ""
                        )
                    }
                    Box(
                        modifier = Modifier.wrapContentSize(align = Alignment.TopStart)
                    ) {
                        IconButton(
                            onClick = {
                                showMenu = !showMenu
                            }
                        ) {
                            Icon(
                                Icons.Filled.MoreVert,
                                contentDescription = ""
                            )
                        }
                        DropdownMenu(
                            expanded = showMenu,
                            containerColor = MaterialTheme.colorScheme.background,
                            onDismissRequest = {
                                showMenu = false
                            }) {
                            DropdownMenuItem(text = { Text(text = "Novo grupo") }, onClick = {})
                            DropdownMenuItem(
                                text = { Text(text = "Nova Comunidade") },
                                onClick = {})
                            DropdownMenuItem(
                                text = { Text(text = "Nova Trasmissão") },
                                onClick = {})
                            DropdownMenuItem(
                                text = { Text(text = "Dispositivos conectados") },
                                onClick = {})
                            DropdownMenuItem(text = { Text(text = "Favoritos") }, onClick = {})
                            DropdownMenuItem(
                                text = { Text(text = "Encontrar empresas") },
                                onClick = {})
                            DropdownMenuItem(text = { Text(text = "Pagamentos") }, onClick = {})
                            DropdownMenuItem(
                                text = { Text(text = "Marcar tudo como lido") },
                                onClick = {})
                            DropdownMenuItem(text = { Text(text = "Configurações") }, onClick = {})

                        }
                    }
                },
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = Green,
            ) {
                Icon(
                    Icons.Default.AddComment,
                    contentDescription = ""
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.background
            ) {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Green.copy(alpha = 0.2f)
                    ),
                    label = {
                        Text(text = "Conversas", style = MaterialTheme.typography.labelSmall)
                    },
                    icon = {
                        Icon(
                            Icons.AutoMirrored.Filled.Message,
                            contentDescription = ""
                        )
                    })
                NavigationBarItem(
                    onClick = {},
                    selected = false,
                    label = {
                        Text(text = "Atualizações", style = MaterialTheme.typography.labelSmall)
                    },
                    icon = {
                        Icon(
                            Icons.Filled.DataUsage,
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {},
                    selected = false,
                    label = {
                        Text(text = "Comunidades", style = MaterialTheme.typography.labelSmall)
                    },
                    icon = {
                        Icon(
                            Icons.Filled.People,
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {},
                    selected = false,
                    label = {
                        Text(text = "Ligações", style = MaterialTheme.typography.labelSmall)
                    },
                    icon = {
                        Icon(
                            Icons.Filled.Phone,
                            contentDescription = ""
                        )
                    }
                )
            }
        }

    ) { padding ->
        LazyColumn(
            modifier = Modifier.padding(padding),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = PaddingValues(
                vertical = 8.dp,
                horizontal = 4.dp
            )
        ) {
            items(count = 20) {
                MessageContact(onClick = {
                    onChangeNavigator?.invoke(Screen.CHAT)
                })
            }
        }
    }

}

@Composable
fun MessageContact(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Card(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        ),
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {

                Image(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = ""
                )
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(
                            horizontal = 8.dp
                        ),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "David",
                        style = MaterialTheme.typography.titleSmall,
                        fontSize = 16.sp
                    )
                    Text(text = "Ola, bom dia!", style = MaterialTheme.typography.bodySmall)
                }
            }

            Text(text = "06:20", style = MaterialTheme.typography.bodySmall)

        }
    }
}

@Preview
@Composable
private fun HomeScreenpreview() {
    HomeScreen()
}