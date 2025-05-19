package com.example.todoapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

fun getfakeToDo() : List <Todo>{
    return listOf<Todo>(
        Todo(1, "First todo" , Date.from(Instant.now())),
        Todo(2, "Second todo" , Date.from(Instant.now())),
        Todo(3, "Third todo" , Date.from(Instant.now())),
        Todo(4, "Forth todo" , Date.from(Instant.now()))
    );
}
