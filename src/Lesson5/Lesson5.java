package Lesson5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson5 {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader("D:\\repo\\home4\\myFirstProject\\Lesson5\\resourse\\entry.txt");
//
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        while (bufferedReader.ready()){
//            String readline = bufferedReader.readLine();
//            System.out.println(readline);
//        }
//        fileReader.close();

                Animal catMyrka = new Cat();
        Animal catBarsik = new Cat();
        Animal dogMyhtar = new Dog();
        Animal  dogRex = new Dog();
        Animal[] animals = {catBarsik, catMyrka, dogMyhtar, dogRex};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        if (animal instanceof Cat){
            Cat myCat = (Cat) animal;
            myCat.sayMeow();
        } else if (animal instanceof Dog) {
            Dog myDod = (Dog) animal;
            myDod.sayGav();
        }
        }


    }
}
















//        Tehnicks Samsung = new Refrijirator();
//        Tehnicks Nokia = new Mobile();
//        Tehnicks MicroWave1 = new MicroWave();
//        Tehnicks[] tehnicks = {Samsung, Nokia, MicroWave1};
//          Nokia.Call();
//          Samsung.Frost();
//          MicroWave1.Cook();
//        for (Tehnicks tehnick : tehnicks ) {
//        if (tehnick instanceof Refrijirator){
//            Refrijirator MyFrost = (Refrijirator) tehnick;
//            MyFrost.Frost();
//        } else if (tehnick instanceof Mobile) {
//            Mobile MyNokia = (Mobile) tehnick;
//            MyNokia.Call();
//        } else if (tehnick instanceof MicroWave) {
//            MicroWave MyMicro = (MicroWave) tehnick;
//            MyMicro.Cook();
//
//        }
//        }


//    try {
//        FileReader fileReader = new FileReader("D:\\repo\\home4\\myFirstProject\\Lesson5\\resourse\\entry2.txt");
//    } catch (Exception exception){
//        System.out.println(exception.getMessage());
//        System.out.println("Файла нет");
//        System.out.println("Работаем так");
//    }