//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
int age1 = 19;
if (age1 >= 18) {
    System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний");
} else {
    System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
}
//Задача 2
int temperature = 6;
if (temperature < 5) {
    System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
} else {
    System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
}
//Задача 3
int speed = 58;
if (speed > 60) {
    System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
} else {
    System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
}
//Задача 4
int ageForStudy = 14;
if (ageForStudy >= 2 && ageForStudy <= 6) {
    System.out.println("Если возраст человека равен " + ageForStudy + ", то ему нужно ходить в детский сад");
} if (ageForStudy >= 7 && ageForStudy <= 17) {
    System.out.println("Если возраст человека равен " + ageForStudy + ", то ему нужно ходить в школу");
} if (ageForStudy >= 18 && ageForStudy <= 24) {
    System.out.println("Если возраст человека равен " + ageForStudy + ", то ему нужно ходить в университет");
} if (ageForStudy > 24) {
    System.out.println("Если возраст человека равен " + ageForStudy + ", то ему нужно ходить на работу");
}
//Задача 5
int ageAllowed = 4;
if (ageAllowed < 5) {
    System.out.println("Если возраст ребенка равен " + ageAllowed + ", то ему нельзя кататься на аттракционе");
} if (ageAllowed >= 5 && ageAllowed <= 14) {
    System.out.println("Если возраст ребенка равен " + ageAllowed + ", то ему можно кататься в сопровождении взрослого");
} if (ageAllowed > 14) {
    System.out.println("Если возраст ребенка равен " + ageAllowed + ", то ему можно кататься без сопровождения взрослого");
}
//Задача 6
int seat = 101;
if (seat < 60) {
    System.out.println("В вагоне есть сидячие места");
} else if (seat >= 60 && seat < 102) {
    System.out.println("В вагоне есть стоячие места");
} else {
    System.out.println("В вагоне мест нет");
}
//Задача 7
int one = 30;
int two = 10;
int three = 25;
if (one > two && one > three) {
     System.out.println("Первое число самое большое");
} else if (two > one && two > three) {
     System.out.println("Второе число самое большое");
} else {
     System.out.println("Третье число самое большое");
}
    }
}