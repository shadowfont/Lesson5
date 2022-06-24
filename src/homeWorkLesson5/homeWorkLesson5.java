package homeWorkLesson5;

import java.io.*;

public class homeWorkLesson5 {


    public static void main(String[] args) throws IOException {
//Базовый уровень
//Задача №1  (Как я люблю с костылями работает) А вот правильно почему то не хочет работать работает но не правильно!


        Car Lada = new Vaz();
        Car Celsior = new Toyota();
        Car[] cars = {Lada,Celsior};

        System.out.println("Жигули");
        Lada.lightsOn();
        Lada.startDrive();

        if(Lada instanceof Vaz){
            Vaz myLada = (Vaz) Lada;
            myLada.crash();
        } Lada.stopDrive();
        System.out.println("Тойота");
        Celsior.lightsOn();
        Celsior.startDrive();
        if (Celsior instanceof  Toyota){
            Toyota myCelsior = (Toyota) Celsior;
            myCelsior.musicOn();
        }Celsior.stopDrive();


//  Не понимаю почему работает очень странно хотя делал 1в1 как на уроке
//        for (Car carsArray : cars){
//            carsArray.startDrive();
//            carsArray.lightsOn();
//            carsArray.stopDrive();
//            if(carsArray instanceof Car){
//                ((Vaz) Lada).crash();
//            } else if (carsArray instanceof Car) {
//                ((Toyota) Celsior).musicOn();
//
//            }
//
//
//        }

//  Задача №2
        FileReader fileReader = new FileReader("D:\\repo\\home4\\myFirstProject\\Lesson5\\Resourse root\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
           String readd = bufferedReader.readLine();
            System.out.print(readd);
        }
        fileReader.close();
        System.out.println();

//  Задача №3
        FinancialRecord record = new FinancialRecord(5,3);
        record.setIncomes(500);
        record.setOutcomes(300);
        System.out.println(record.getInfo());



        FileWriter myFirstWriter = new FileWriter("D:\\repo\\home4\\myFirstProject\\Lesson5\\report\\report.txt");
        myFirstWriter.write(record.getInfo());
        myFirstWriter.close();




    }
}











//Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
//Задача №1
//Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
//останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
//Необходимо:
// 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
// 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
// Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)

//Задача №2
//Необходимо:
// 1. Создать папку resource, пометить ее как папку Resourсe root.
// 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
// 3. Прочитать файл, и вывести на экран все слова файла в одну строку
// Ожидаемый результат: "Моя бабушка читает газету жизнь"

//Задача №3
//Необходимо:
// 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
// 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
// 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
// 4. Записать в файл "report.txt" данные из объекта класса.
// Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300