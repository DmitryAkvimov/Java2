# GB_repository_Java
Education
Education Java 1 / Урок 1. Java. Введение

Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. Несмотря на формулировки заданий, рекомендуется описывать методы, возвращающие результаты свой работы, и вывод этих результатов желательно осуществлять ТОЛЬКО в методе public static void main(String[] args);
Java 1 / Урок 2. Основные конструкции

1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;

4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

5 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);

6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.

7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.

8 **** Не пользоваться вспомогательным массивом при решении задачи 7.

Java 1 / Урок 3. Практика Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку; Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.

Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций; *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
Java 1 / Урок 4. Крестики-нолики в процедурном стиле Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст; Конструктор класса должен заполнять эти поля при создании объекта; Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля; Вывести при помощи методов из пункта 3 ФИО и должность. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. ** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
Java 1 / Урок 5. Введение в ООП Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков). У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ; плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.). При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!') Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

Java 1 / Урок 6. Продвинутое ООП Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет); Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле. ** Написать метод, проверяющий, есть ли указанное слово в папке
Java 1 / Урок 7. Практика ООП и работа со строками

Полностью разобраться с кодом (попробовать полностью самостоятельно переписать одно из окон)
Составить список вопросов (возможно, по всему курсу) и приложить в виде комментария к домашней работе
Расчертить панель Map на поле для игры, согласно fieldSize
Java 1 / Урок 8. Написание приложения с графическим интерфейсом Доработать проект, который разрабатывали на уроке. Приветствуется творческий подход.

Java 2 Java Core. Продвинутый уровень / Урок 1. Объектно-ориентированное программирование Java

Разобраться с имеющимся кодом;
Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ), метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.
Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод, который будет просить команду пройти всю полосу; В итоге должно быть что-то вроде:
public static void main(String[] args) { Course c = new Course(...); // Создаем полосу препятствий Team team = new Team(...); // Создаем команду c.doIt(team); // Просим команду пройти полосу team.showResults(); // Показываем результаты }

Java 2 Java Core. Продвинутый уровень / Урок 2. Исключения

Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
Java 2 Java Core. Продвинутый уровень / Урок 3. Коллекции

Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны. Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get().
Java 2 Java Core. Продвинутый уровень / Урок 4. Продвинутые вопросы создания графического интерфейса

Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего поля в центральное.
Java 2 Java Core. Продвинутый уровень / Урок 5. Многопоточность

Необходимо написать два метода, которые делают следующее:
Создают одномерный длинный массив, например: static final int size = 10000000; static final int h = size / 2; float[] arr = new float[size];
Заполняют этот массив единицами;
Засекают время выполнения: long a = System.currentTimeMillis();
Проходят по всему массиву и для каждой ячейки считают новое значение по формуле: arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
Проверяется время окончания метода System.currentTimeMillis();
В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a); Отличие первого метода от второго: Первый просто бежит по массиву и вычисляет значения. Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
Пример деления одного массива на два: System.arraycopy(arr, 0, a1, 0, h); System.arraycopy(arr, h, a2, 0, h);

Пример обратной склейки: System.arraycopy(a1, 0, arr, 0, h); System.arraycopy(a2, 0, arr, h, h);

Примечание: System.arraycopy() копирует данные из одного массива в другой: System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем) По замерам времени: Для первого метода надо считать время только на цикл расчета: for (int i = 0; i < size; i++) { arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2)); } Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

Java 2 Java Core. Продвинутый уровень / Урок 6. Работа с сетью

Написать консольный вариант клиент\серверного приложения, в котором пользователь может писать сообщения, как на клиентской стороне, так и на серверной. Т.е. если на клиентской стороне написать «Привет», нажать Enter, то сообщение должно передаться на сервер и там отпечататься в консоли. Если сделать то же самое на серверной стороне, то сообщение передается клиенту и печатается у него в консоли. Есть одна особенность, которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд. Такую ситуацию необходимо корректно обработать. Разобраться с кодом с занятия: он является фундаментом проекта-чата *ВАЖНО! * Сервер общается только с одним клиентом, т.е. не нужно запускать цикл, который будет ожидать второго/третьего/n-го клиентов.