package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.example.Entities.printAllEntities;

public class Main {

    static int age;
    static final int minAge = 10;
    static final int maxAge = 100;
    static final int drivingMinAge = 20;
    static double youngPeopleModifier = 50; // MUST BE BETWEEN 0 - 100 / 0 = (unchanged) - 100 = (younger people)
    static double amountOfDriversModifier = 50; // MUST BE BETWEEN 0 - 100 / 0 = (unchanged) - 1 = (more drivers)
    protected static List<Person> peopleList = new ArrayList<>();


    public static void main(String[] args) {

        if (youngPeopleModifier < 0 || youngPeopleModifier > 100) {
            System.out.println("\nERROR: [youngPeopleModifier] Value MUST be between 0 - 100 \nsee Main.java - Line 13 \n");
            System.exit(1);
        }
        if (amountOfDriversModifier < 0 || amountOfDriversModifier > 100) {
            System.out.println("\nERROR: [amountOfDriversModifier] Value MUST be between 0 - 100 \nsee Main.java - Line 14 \n");
            System.exit(2);
        }

        Sky sky = new Sky();
        Road road = new Road();
        Water water = new Water();
        Lake lake = new Lake();


        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());


        water.addTraffic(new Duck());
        water.addTraffic(new Fish());
        water.addTraffic(new Boat());
        water.addTraffic(new AquaticVehicle());
        water.addTraffic(new CruiseShip());


        road.addTraffic(new Car());
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Lorry());

        road.addTraffic(new Batmobile());
        sky.addTraffic(new Batmobile());
        water.addTraffic(new Batmobile());

        road.addTraffic(new Superman());
        sky.addTraffic(new Superman());
        water.addTraffic(new Superman());

        road.addTraffic(new Human());
        sky.addTraffic(new Human());
        water.addTraffic(new Human());


        lake.addTraffic(new Duck());
        lake.addTraffic(new Fish());
        lake.addTraffic(new Human());




        String[] nameArray = {"Clark", "Bruce", "Dianna", "Tonny", "Steve", "Peter", "Natasha", "Bruce"};


        for (String name : nameArray) {
            age = ageGenerator();
            peopleList.add(new Person(name, age, genderChecker(name), hasLicenceChecker(age), randomSpeed()));
        }


        System.out.println("PEOPLE INFO:");
        for (Person person : peopleList) {
            person.makeSound();
            person.drive();
            person.swim();
            System.out.println("-------------");
            for (int i = 0; i < 5; i++) {
                person.move();
                person.tick();
            }
//
        }


        List<Environment<?>> environments = List.of(sky, water, road, lake);
        List<Environment<?>> entities = List.of(sky, water, road, lake);

        for (Environment<?> environment : environments) {
            System.out.println("\nEVERYTHING IN THE: " + environment.getClass().getSimpleName().toUpperCase());
            environment.checkTraffic();
            System.out.println("\nVEHICLES IN THE:" + environment.getClass().getSimpleName().toUpperCase());
            environment.checkVehicles(environment);
            System.out.print("\n\n");
        }

        printAllEntities();




    }

    private static int randomSpeed() {
        return (int) (Math.random() * ((25 - 10 + 1) - 10));
    }


    private static Boolean hasLicenceChecker(int age) {
        int randomInt = (int)(Math.random() * 100);;
        int randomAgeWillLearnToDrive = (int)(randomInt + drivingMinAge - (amountOfDriversModifier/4) - (youngPeopleModifier/4)  - age);
        // Does not have licence if not over min age
        if (age < drivingMinAge) return false;
        // Has licence if half maxim possible age of a person e.g. 50years old.
        else if (age > maxAge / 2) return true;
        // else semi random probability of having a licence
        else return age > randomAgeWillLearnToDrive;
    }

    // Function to check if name is male or female and return "male" or "female"
    private static String genderChecker(String name) {
        if (Objects.equals(name, "Dianna") || Objects.equals(name, "Natasha")) return "female";
        else return "male";
    }

    // Function to generate random age between min and max.
    private static int ageGenerator(){
        int result = (int)(Math.random() * (maxAge - minAge - youngPeopleModifier + 1)) + minAge;
        return Math.max(result, minAge);
    }


}
