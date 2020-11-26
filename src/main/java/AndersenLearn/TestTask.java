package AndersenLearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestTask {

  public void displayMessage() {
    System.out
        .println("1. Составить алгоритм: если введенное число больше 7, то вывести \"Привет\".");
    System.out.println("Введите число:");
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int number = Integer.parseInt(reader.readLine());
      if (number > 7) {
        System.out.println("Привет.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println();
  }

  public void compareNames() {
    System.out.println(
        "2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести \"Привет, Вячеслав\", если нет, то вывести \"Нет такого имени\".");
    System.out.println("Введите имя:");
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = reader.readLine();
      if (name.equals("Вячеслав")) {
        System.out.println("Привет, Вячеслав.");
      } else {
        System.out.println("Нет такого имени.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println();
  }

  public void printArrayElementsMultiplesOfThree() {
    System.out.println(
        "3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3.");
    System.out.println("Введите длину массива:");
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int length = Integer.parseInt(reader.readLine());
      int[] array = new int[length];
      System.out.println("Введите элементы массива:");
      for (int i = 0; i < length; i++) {
        array[i] = Integer.parseInt(reader.readLine());
      }
      System.out.println("Элементы массива кратные 3:");
      boolean noElementsDivisibleByThree = true;
      for (int i = 0; i < length; i++) {
        if (array[i] % 3 == 0) {
          System.out.println(array[i]);
          noElementsDivisibleByThree = false;
        }
      }
      if (noElementsDivisibleByThree) {
        System.out.println("Таких элементов нет.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println();
  }

  public void runAllTasks() {
    this.displayMessage();
    this.compareNames();
    this.printArrayElementsMultiplesOfThree();
  }
}
