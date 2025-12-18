package service

import model.Task

class TaskService {
    private val tasks = mutableListOf<Task>()
    private var nextId = 1

    fun addTask(title: String): Task {
        val newTask = Task(id = nextId++, title = title)
        tasks.add(newTask)
        return newTask
    }
    fun getAllTasks(): List<Task> {
        return tasks
    }
    fun completeTask(id: Int): Boolean {
        if (id <= 0) return false
        val task = tasks.firstOrNull { it.id == id } ?: return false
        if (task.isCompleted) return false
        val updated = task.copy(isCompleted = true)
        tasks.replaceAll { if (it.id == id) updated else it }
        return true
    }
    fun printTasks(tasks: List<model.Task>) {
        if (tasks.isEmpty()) {
            println("No tasks available.")
            return
        }
        tasks.forEach { task ->
            println("ID: ${task.id}, Title: ${task.title}, Completed?: ${task.isCompleted}") 
        }

    }
}