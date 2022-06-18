# Lesson 5,6 homework

## Задача 1

Создайте класс **Matrix**. Класс должен иметь следующие переменные (**поля**):

- двумерный массив вещественных чисел;
- количество строк и столбцов в матрице.

Класс должен иметь следующие **методы**:

- сложение с другой матрицей;
- умножение матрицы на число;
- вывод матрицы на экран пользователя;
- умножение матриц (_**по желанию**_).

## Задача 2

Реализуйте класс **Student** и класс **Aspirant**.

Класс **Student** будет является **базовым классом** для класса **Aspirant**.

Класс **Student** содержит следующие **поля**:

- **firstName**;
- **lastName**;
- **group**;
- **averageMark**;

Создайте метод **getScholarship()** для класса **Student**, который возвращает сумму стипендии.

Если средняя оценка студента равна **5**, то сумма стипендии равна **150** бел. руб., иначе **100**.

**Переопределите** этот метод в классе **Aspirant**. Если средняя оценка аспиранта равна **5**, то сумма **300** бел.
руб., иначе **200**.

Создайте массив типа **Student**, содержащий объекты класса **Student** и **Aspirant**. Вызовите метод **getScholarship()** для каждого элемента данного массива.

## Задача 3

Необходимо релизовать следующие классы:

Класс **Product**, имеющий поля:

- **name**;
- **price**;
- **rate**;

Класс **Category**, имеющий поля:

- **name**;
- **products**;

Класс **Basket**, имеющий поля:

- **products**;

Класс **User**, имеющий поля:

- **login**;
- **password**;
- **basket**;

Для всех классов нужно реализовать методы по **получению значений** полей и методы по **установке значений** этим полям.

Создайте несколько объектов каждого класса.

Выведите на экран пользователя свойства некоторых обектов.

Измените свойства некоторых объектов.

**Примечания:**

> Написанные классы должны иметь названия в соответствии с условием (названия файлов *__.java__ должны совпадать соответственно)<br><br>
> Каждый класс должен находится в отдельном файле *__.java__<br><br>
> Поля классов должны иметь модификатор доступа **private** <br><br>
> _Тестирование_ написанных классов должно происходить в методе **main** класса **Main**<br><br>
> Исходный код данных классов должен быть опубликован в своём удалённом репозитории в ветке __lesson5_6__ на [__GitHub.com__](https://github.com)

