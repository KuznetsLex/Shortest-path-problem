# Shortest Path Finder
## (Ru)
Добро пожаловать в программу Shortest Path Finder!
Это консольное приложение позволяет строить кратчайшие пути в графе, используя алгоритмы Дейкстры, Форда-Беллмана и Флойда-Уоршелла.

### Установка
Загрузите Shortest_path_problem.jar файл. Внимание: рядом с .jar файлом будет создаватся файл Input.txt для ввода графа, поэтому имеет смысл поместить .jar в отдельную папку.

### Использование
1. Откройте консоль (для Windows - cmd, для MacOS - Terminal)
2. Внутри консоли откройте папку с проектом (cd <путь-до-папки>)
3. Введите в консоли команду
```bash
java -jar Shortest_path_problem.jar
```
4. Навигация по приложению реализована в формате выбора пунктов меню. Находясь в главном меню, вы можете решить задачу (введите 1 и нажмите Enter), октрыть файл для ввода в режиме чтения (2), выйти из программы (0).
5. Выбрав пункт решения задачи (1), выберите необходимый способ ввода графа. Он может быть введен вручную (1) или сгенерирован (2). **Обратите внимание:** граф в файл нужно вводить в представлении матрицы смежности (если дуги нет - на пересечении "inf", если дуга есть - вес этой дуги; на диагонали "inf"), значения разделяются единственным пробелом или единственным переносом строки.
6. Введите стартовую и финальную вершину пути.
7. Выберите алгоритм, с помощью которого задача будет решена.

### Возможные проблемы и их решения
1. Если введен новый граф, а в блокноте отображается старый - попробуйте перезапустить блокнот, либо воспользуйтесь редакторами с функцией auto-refresh
   
## (En)
Welcome to Shortest Path Finder!
This console app allows you to find shortest path in graph. It uses Dijkstra, Bellman-Ford and Floyd-Warshell algorithms.

### Installation
Download it .jar file. Attention: an Input.txt file will be created next to a .jar file, therefore it makes sense to place .jar to a separate folder.

### Usage
1. Open console (for Windows - cmd, for MacOS - Terminal)
2. Change console directory to the project one (cd <path-to-the-project-folder>)
3. Run
```bash
java -jar Shortest_path_problem.jar
```
4. Navigation through the application is implemented in the format of selecting menu items. From the main menu, you can solve the problem (enter 1 and press Enter), open the file for input in reading mode (2), exit the program (0).
5. After selecting the problem solution item (1), select the required graph input method. It can be entered manually (1) or generated (2). **Please note:** the graph in the file must be entered in the representation of the adjacency matrix (if there is no arc, at the intersection is "inf", if there is an arc, the weight of this arc; on the diagonal "inf"'s), the values are separated by a single space or a single line break.
6. Enter the starting and final vertex of the path.
7. Select the algorithm by which the problem will be solved.

### Possible problems and their solutions
1. If a new graph is entered, but the old one is still displayed in notepad, try to restart notepad, or use the editors with the auto-refresh support
