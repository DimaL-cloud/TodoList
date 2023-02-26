# Todo list :bulb:


Тестове завдання для відбору в IASA Student Council**

## Стек :computer: 
Java, Spring Boot, Spring Data JPA, PostgreSQL

## Вимоги:
1. Java - 17
2. Maven - 3.x.x
3. PostgreSQL - 15

## Інструкція встановлення:
1. Склонувати програму:
````
git clone 
````
2. * Налаштувати сервер PostgreSQL. 
   * Змінити налаштування application.properties (дефолтні username та password: postgres)


3. Створити та запустити програму за допомогою maven:
````
cd TodoList
mvn package
cd target
java -jar TodoList-0.0.1.jar
````

## Реалізований функціонал :bulb::

* Додавання таски
* Отримання таски
* Редагування таски
* Отримання тасок (від нових до старих, від старих до нових)
  * всіх
  * виконаних
  * невиконаних
* Видалення таски 
* Видалення всіх тасок

## Перевірка :straight_ruler:
Тестування проводилось через Postman

### Додавання таски 

![Додавання таски](TestingImages/addingTask.png)

### Отримання таски

![Отримання таски](TestingImages/gettingTask.png)

### Редагування таски

![Редагування таски](TestingImages/editingTask.png)

### Отримання тасок (за замовчуванням від нових до старих)

![Отримання тасок](TestingImages/gettingAllTasks.png)

### Отримання тасок (від старих до нових) 

![img_4.png](TestingImages/gettingAllTasksAscending.png)

### Отримання виконаних тасок (за замовчуванням від нових до старих)

![img_10.png](TestingImages/gettingDoneTasks.png)

### Отримання виконаних тасок (від старих до нових)

![img_11.png](TestingImages/gettingDoneTasksAscending.png)

### Отримання невиконаних тасок (за замовчуванням від нових до старих)

![img_12.png](TestingImages/gettingTodoTasks.png)

### Отримання невиконаних тасок (від старих до нових)

![img_13.png](TestingImages/gettingTodoTasksAscending.png)

### Видалення таски

![img_6.png](TestingImages/deletingTask1.png)

![img_8.png](TestingImages/deletingTask2.png)

### Видалення всіх тасок

![img_16.png](TestingImages/deletingAllTasks1.png)

![img_17.png](TestingImages/deletingAllTasks2.png)
