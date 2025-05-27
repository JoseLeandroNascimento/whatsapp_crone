package com.example.whatsapp_crone.screens.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsapp_crone.R
import com.example.whatsapp_crone.ui.theme.Green
import com.example.whatsapp_crone.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

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
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.ShoppingCart,
                            contentDescription = ""
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            Icons.Filled.MoreVert,
                            contentDescription = ""
                        )
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
                    Icons.Filled.CheckCircle,
                    contentDescription = ""
                )
            }
        },
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(
                    onClick = {},
                    selected = true,
                    label = {
                        Text(text = "Conversas")
                    },
                    icon = {
                        Icon(
                            Icons.Filled.CheckCircle,
                            contentDescription = ""
                        )
                    })
                NavigationBarItem(
                    onClick = {},
                    selected = false,
                    label = {
                        Text(text = "Atualizações")
                    },
                    icon = {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {},
                    selected = false,
                    label = {
                        Text(text = "Comunidades")
                    },
                    icon = {
                        Icon(
                            Icons.Filled.Person,
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {},
                    selected = false,
                    label = {
                        Text(text = "Ligações")
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
                MessageContact()
            }
        }
    }

}

@Composable
fun MessageContact(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = White
        ),
        shape = RoundedCornerShape(0.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(60.dp),
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
                Text(text = "David", style = MaterialTheme.typography.titleSmall)
                Text(text = "Ola, bom dia!", style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenpreview() {
    HomeScreen()
}