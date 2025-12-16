package com.example.finaleformatifprog3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finaleformatifprog3.ui.theme.FinaleFormatifProg3Theme

// Petit modèle de donnée pour la liste
data class ListItem(val id: Int, val title: String, val subtitle: String = "")

@Composable
fun ListeScreen(items: List<ListItem>, onItemClick: (ListItem) -> Unit = {}) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .clickable { onItemClick(item) }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = item.title, style = MaterialTheme.typography.titleMedium)
                    if (item.subtitle.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = item.subtitle, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppContent() {
    FinaleFormatifProg3Theme {
        Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
            TopAppBar(title = { Text(text = "Mise en Page", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()) })
        }) { innerPadding ->
            val sample = List(8) { i -> ListItem(i + 1, "Item ${i + 1}", "Sous-titre ${i + 1}") }
            Column(modifier = Modifier.padding(innerPadding)) {
                ListeScreen(items = sample, onItemClick = { /* handle item click */ })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    AppContent()
}

// Point d'entrée Kotlin (inutile pour Android mais ajouté comme placeholder)
fun main() {
    // point d'entrée vide pour un projet minimal
}
