package Studying;

public class Main {

    public static void main(String[] args) {
        double salary = 70000;
        double nalog = 0.87;
        double net = salary*nalog;
        if (salary>0)
            System.out.println("Выдача зарплаты на руки " + net + " руб.");
        else System.out.println("Ошибка подсчета зарплаты");
    }
}


