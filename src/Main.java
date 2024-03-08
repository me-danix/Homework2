public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var totalWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var differentWeight = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Разница между массами бойцов " + differentWeight + " кг");

        // Задача 7
        var remainder = twoBoxerWeight % oneBoxerWeight;
        System.out.println(remainder);

        // Задача 8
        var totalTime = 640;
        var oneWorkerTime = 8;
        var totalWorkers = totalTime / oneWorkerTime;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек");
        totalWorkers = totalWorkers + 94;
        var newTotalTime = totalWorkers * 8;
        System.out.println("Если в компании работает " + totalWorkers + " человека, то всего " + newTotalTime + " часов");
    }
}