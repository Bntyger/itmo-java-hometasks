package hw1;
public class Task1 {
    public static void main(String[] args) {
        // Даны длина, ширина и высота прямоугольного параллелепипеда. Найти и вывести в консоль его площадь.
        int Length = 100, Height = 2, Width = 2;
        int Area = Length * Height * Width;
        System.out.println(Area);

        // Дано целое число. Найти и вывести в консоль данное число в кубе.
        int Count = 3;
        int Cube = (Count*Count*Count);
        System.out.println(Cube);

        // Даны две переменные типа double: время (в часах) и расстояние (в километрах).
        // Найти и вывести в консоль скорость, выраженную в метрах в секунду.
        double time_Hours = 3.5;
        double xSeconds = 60;
        double distance_Kilometres = 2.2;
        double xMetres = 1000;
        double Speed = (double) (distance_Kilometres*xMetres)/(time_Hours*xSeconds);
        System.out.println(Speed);

    }
}
