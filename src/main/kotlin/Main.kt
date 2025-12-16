
import service.TaskService

fun main() {
    val taskService = service.TaskService()
    println("Welcome to the Task Tracker!")

    while (true) {
        println(
            """
            1. Add Task
            2. View All Tasks
            3. Complete Task
            4. Exit
            """
        )
        print("Choose an Option: ")
        when (readLine()?.trim()) {
            "1" -> {
                print("Enter Task name: ")
                val title = readLine()?.trim() ?: ""
                if(!title.isNullOrEmpty()) {
                    val task = taskService.addTask(title)
                    println("Task Added: $task")
                } else {
                    println("Task title cannot be empty.")
                }
            }
            "2" -> {

            }
            "3" -> {

            }
            "4" -> {

            }
        }

    }

}