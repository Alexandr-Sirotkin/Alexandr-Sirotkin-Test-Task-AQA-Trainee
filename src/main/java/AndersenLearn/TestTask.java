package AndersenLearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTask {

  private BufferedReader reader;

  public String enterData() throws IOException {
    if (reader == null) {
      reader = new BufferedReader(new InputStreamReader(System.in));
    }
    return reader.readLine();
  }

  public void closeReader() {
    try {
      if (reader != null){
        reader.close();
      }
    } catch (IOException e) {
      System.out.println("Произошла ошибка во время операции ввода-вывода.");
    }
  }

  public String convertFirstLetterToUppercase(String name) {
    char[] letters = name.toCharArray();
    letters[0] = Character.toUpperCase(letters[0]);
    String nameString = "";
    for (int i = 0; i < letters.length; i++) {
      nameString += letters[i];
    }
    return nameString;
  }

  public int[] enterArray() throws IOException {
    int length = Integer.parseInt(enterData());
    int[] array = new int[length];
    System.out.println("Введите элементы массива:");
    for (int i = 0; i < length; i++) {
      array[i] = Integer.parseInt(enterData());
    }
    return array;
  }

  public void displayMessage() {
    System.out
        .println("1. Составить алгоритм: если введенное число больше 7, то вывести \"Привет\".");
    System.out.println("Введите число:");
    try {
      double number = Double.parseDouble(enterData());
      if (number > 7) {
        System.out.println("Привет.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Вы ввели не число.");
    } catch (IOException e) {
      System.out.println("Произошла ошибка во время операции ввода-вывода.");
    }
    System.out.println();
  }

  public void compareNames() {
    System.out.println(
        "2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести \"Привет, Вячеслав\", если нет, то вывести \"Нет такого имени\".");
    System.out.println("Введите имя:");
    try {
      String name = enterData().toLowerCase();
      if (name.equals("вячеслав")) {
        System.out.println("Привет, " + convertFirstLetterToUppercase(name) + ".");
      } else {
        System.out.println("Нет такого имени.");
      }
    } catch (IOException e) {
      System.out.println("Произошла ошибка во время операции ввода-вывода.");
    }
    System.out.println();
  }

  public void printArrayElementsMultiplesOfThree() {
    System.out.println(
        "3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3.");
    System.out.println("Введите длину массива:");
    try {
      int[] array = enterArray();
      System.out.println("Элементы массива кратные 3:");
      boolean noElementsDivisibleByThree = true;
      for (int i = 0; i < array.length; i++) {
        if (array[i] % 3 == 0) {
          System.out.println(array[i]);
          noElementsDivisibleByThree = false;
        }
      }
      if (noElementsDivisibleByThree) {
        System.out.println("Таких элементов нет.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Длина массива и его элементы должны быть целыми числами.");
    } catch (NegativeArraySizeException e) {
      System.out.println("Длина массива не может быть отрицательной.");
    } catch (IOException e) {
      System.out.println("Произошла ошибка во время операции ввода-вывода.");
    }
    System.out.println();
  }

  public void runAllTasks() {
    this.displayMessage();
    this.compareNames();
    this.printArrayElementsMultiplesOfThree();
    this.closeReader();
  }
}
