package service

import model.Task

class TaskService {
    private val tasks = mutableListOf<Task>()
    private var nextId = 1

    fun addTask(title: String): Task {
        tasks.add(Task(id = nextId++, title = title))
    }
    fun getAllTasks(): List<Task> {
        return tasks
    }
    fun completeTask(id: Int): Boolean {
        val index = tasks.indexOfFirst { it.id == id }
        if (index != -1) return false

        val task = tasks[index]
        tasks[index] = task.copy(isCompleted = true)
        return true
    }
}