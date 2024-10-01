abstract class Animal {
  // Поля
  protected String name;
  protected int age;
  protected double weight;

  // Статическая переменная для подсчета объектов
  private static int count = 0;

  // Конструктор по умолчанию
  public Animal() {
      count++;
  }

  // Конструктор с параметрами
  public Animal(String name, int age, double weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      count++;
  }

  // Геттеры и сеттеры
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  public double getWeight() {
      return weight;
  }

  public void setWeight(double weight) {
      this.weight = weight;
  }

  // Абстрактный метод
  public abstract void makeSound();

  // Метод для отображения информации о животном
  public void displayInfo() {
      System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + "kg");
  }

  // Статический метод для получения количества созданных объектов
  public static int getCount() {
      return count;
  }
}

// Класс Кошка
class Cat extends Animal {
  private String breed; // Порода кошки


  public Cat() {
      super();
  }


  public Cat(String name, int age, double weight, String breed) {
      super(name, age, weight);
      this.breed = breed;
  }


  public String getBreed() {
      return breed;
  }

  public void setBreed(String breed) {
      this.breed = breed;
  }

  // Переопределение абстрактного метода makeSound
  @Override
  public void makeSound() {
      System.out.println(name + " мяукает.");
  }


  public void displayInfo(boolean showBreed) {
      if (showBreed) {
          System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + "kg, Breed: " + breed);
      } else {
          displayInfo(); 
      }
  }
}


class Parrot extends Animal {
  private String color; 


  public Parrot() {
      super();
  }


  public Parrot(String name, int age, double weight, String color) {
      super(name, age, weight);
      this.color = color;
  }


  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  // Переопределение абстрактного метода makeSound
  @Override
  public void makeSound() {
      System.out.println(name + " чирикает.");
  }
}


class Fish extends Animal {
  private String habitat; // Среда обитания (например, пресноводная или морская)

  public Fish() {
      super();
  }


  public Fish(String name, int age, double weight, String habitat) {
      super(name, age, weight);
      this.habitat = habitat;
  }

  public String getHabitat() {
      return habitat;
  }

  public void setHabitat(String habitat) {
      this.habitat = habitat;
  }

  // Переопределение абстрактного метода makeSound
  @Override
  public void makeSound() {
      System.out.println(name + " не издает звуков.");
  }
}

public class Main {
  public static void main(String[] args) {

      Cat cat = new Cat("Мурка", 3, 4.5, "Сиамская");
      Parrot parrot = new Parrot("Кеша", 2, 0.5, "Зеленый");
      Fish fish = new Fish("Золотая рыбка", 1, 0.2, "Пресноводная");

      cat.makeSound();
      cat.displayInfo(true);

      parrot.makeSound();
      parrot.displayInfo();

      fish.makeSound();
      fish.displayInfo();

      System.out.println("Всего создано объектов животных: " + Animal.getCount());
  }
}
