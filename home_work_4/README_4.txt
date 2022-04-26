DataContainer класс создан для проверки методов класса DataContainer с дженериком

DataChel класс создан для проверки метода сортировки класса DataContainer с дженериком
и создания сравнений интерфейса comparator;

пакет comporators содержит классы:
 DataChelAgeComporator - реализация сравнения по параметру Age;
 DataChelNameComporator - реализация сравнения по параметру Name;


В DataContainer реализованы методы:

(п.4) int add(T item) который добавляет данные во внутреннее поле data
и возвращает номер позиции в которую были вставлены данные;

(п.5) метод T get(int index). Данный метод получает из DataContainer'а, из поля data,
предварительно сохранённый объект который мы передали на предыдущем шаге через метод add;

(п.6) метод T[] getItems(). Данный метод возвращает поле data;

(п.7) метод boolean delete(int index), который удаляет элемент из нашего поля data по индексу;

(п.8) метод boolean delete(T item) который удаляет элемент из нашего поля data;

(п.9) метод void sort(Comparator<T> comparator) -  занимается сортировкой данных,
записанных в поле data, используя реализацию сравнения из переданного объекта comparator;

(п.10) @Override метод toString() выводит содержимое data без ячеек в которых хранится null.

(п.11) метод   <T extends Comparable<T>> void sort (DataContainer <T> container) принимает объект
 DataContainer с дженериком extends Comparable и сортирует элементы в переданном объекте

(п.12)  метод <T> void sort (DataContainer <T> container, Comparator<T>comparator) принимает объект
DataContainer и реализацию интерфейса Comparator, сортирует элементы в переданном объекте

(п.13) метод  <T extends Iterable<T>> void perebor () перебирает все элементы массива-объекта DataContainer

Класс DataContainerMain - мэйн класс для запуска программы и реализации поставленных задач