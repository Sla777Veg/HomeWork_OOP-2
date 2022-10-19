import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

           //Задание 1
        Human Max = new Human("Максим","Минск",35,"бренд-менеджер");

        System.out.println("Привет! Меня зовут "+Max.name+". Я из города "+Max.getTown()+". Я родился в "+Max.getYearOfBirth()+" году." +" Я работаю на должности "+Max.post+". Будем знакомы!");

        Human Any = new Human("Аня","Москва",29,"методист образовательных программ" );

        System.out.println("Привет! Меня зовут "+Any.name+". Я из города "+Any.getTown()+". Я родилась в "+Any.getYearOfBirth()+" году." +" Я работаю на должности "+Any.post+". Будем знакомы!");

        Human Katya = new Human("Катя","Калининград",28,"продакт-менеджер");

        System.out.println("Привет! Меня зовут "+Katya.name+". Я из города "+Katya.getTown()+". Я родилась в "+Katya.getYearOfBirth()+" году." +" Я работаю на должности "+Katya.post+". Будем знакомы!");

        Human Artem = new Human("Артем","Москва",27,"директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут "+Artem.name+". Я из города "+Artem.getTown()+". Я родился в "+Artem.getYearOfBirth()+" году." +" Я работаю на должности "+Artem.post+". Будем знакомы!");

        //Задание 2
        Flower CommonRose = new Flower("Роза обыкновенная", null, "Голландия",35.59, 0);
        System.out.println(CommonRose);

        Flower Chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        System.out.println(Chrysanthemum);

        Flower PeonyEngland = new Flower("Пион из Англии", null, "Англия", 69.9, 1);
        System.out.println(PeonyEngland);

        Flower Gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        System.out.println(Gypsophila);

        //Задание3
        Car Lada = new Car("Lada","Granta",1.7,"желтый",2015, "Россия", null, null);
        System.out.println(Lada);

        Car Audi = new Car("Audi","A8 50 L TDI quattro", 3.0,"черный",2020,"Германия", null, null);
        System.out.println(Audi);

        Car BMW = new Car("BMW","Z8,",3.0,"черный",2021, "Германия", null, null);
        System.out.println(BMW);

        Car Kia = new Car("Kia","Sportage", 2.4,"красный",2018,"Южная Корея", null, null);
        System.out.println(Kia);

        Car Hyundai  = new Car("Hyundai ","Avante", 1.6,"оранжевый",2016,"Южная Корея", null, null);
        System.out.println(Hyundai );

    }
}