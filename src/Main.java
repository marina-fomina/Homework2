public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача №3");
        var dog_1 = 8.0;
        dog_1 = dog_1 - 3.5;
        System.out.println(dog_1);
        var cat_1 = 3.6;
        cat_1 = cat_1 - 1.6;
        System.out.println(cat_1);
        var paper_1 = 763789;
        paper_1 = paper_1 - 7639;
        System.out.println(paper_1);

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача №6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var overallWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общий вес бойцов " + overallWeight + " кг");
        System.out.println("Разница в весе " + (secondFighterWeight - firstFighterWeight) + " кг");

        System.out.println("Задача №7");
        var differenceInWeight_1 = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница в весе первым способом " + differenceInWeight_1 + " кг");
        var differenceInWeight_2 = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница в весе вторым способом " + differenceInWeight_2 + " кг");

        System.out.println("Задача №8");
        var totalHours = 640;
        var hoursPerWorker = 8;
        var numberOfWorkers = totalHours / hoursPerWorker;
        System.out.println ("Всего работников в компании - " + numberOfWorkers + " человек.");
        var newNumberOfWorkers = numberOfWorkers + 94;
        var newTotalHours = newNumberOfWorkers * hoursPerWorker;
        System.out.println ("Если в компании работает " + newNumberOfWorkers + " человека, то всего " + newTotalHours + " часа работы может быть поделено между сотрудниками.");
    }
}