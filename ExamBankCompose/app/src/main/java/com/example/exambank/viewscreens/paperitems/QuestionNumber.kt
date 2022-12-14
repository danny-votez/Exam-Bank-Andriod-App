package com.example.exambank.viewscreens.paperitems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun QuestionNumberSection() {
    Column {
        LazyColumn {
            item {
                QuestionNumberTemplate(
                    quizTitle = "Question 1: ",
                    quizMarks = "30 Marks (Compulsory)"
                )
                QuestionNumberTemplate(
                    quizTitle = "Question 2: ",
                    quizMarks = "20 Marks"
                )
                QuestionNumberTemplate(
                    quizTitle = "Question 3: ",
                    quizMarks = "20 Marks"
                )
            }
        }
    }
}

@Composable
fun QuestionNumberTemplate(
    quizTitle: String,
    quizMarks: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(25.dp)
            .background(color = Color.Gray)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 2.dp)
                .fillMaxWidth()

        ) {
            Text(
                modifier = Modifier
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = quizTitle,
                color = Color.White,
                fontSize = 14.sp
            )
            Text(
                modifier = Modifier
                    .padding(horizontal = 0.dp)
                    .align(Alignment.CenterVertically),
                text = quizMarks,
                color = Color.White,
                fontSize = 14.sp
            )
        }
    }
}