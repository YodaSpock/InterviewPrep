import java.util.ArrayList;


public class HardProblems {
    
    public static int findCommonYear(ArrayList<Person> people){
        int biggestYear = 1900;
        int biggestCount = 0;
        for (int i = 1900; i < 2000; i++) {
            int currentCount = 0;

            for (int j = 0; j < people.size() ; j++) {
                if(people.get(j).birthYear <= i && i <= people.get(j).deathYear){
                    currentCount++;
                }
            }
            if(currentCount > biggestCount){
                biggestCount = currentCount;
                biggestYear = i;
            }
        }
        
        return biggestYear;
    }

    public static void main(String[] args) {
        Person Tom = new Person(1908, 1987);
        Person Jake = new Person(1925, 2005);
        Person Rachel = new Person(1997, 3000);
        Person Wonka = new Person(1985, 1995);
        Person Willy = new Person(1902, 1949);
        Person Aaron = new Person(1999, 2097);
        Person Isaac = new Person(1998, 2056);
        Person Adolf = new Person(1902, 1945);

        ArrayList<Person> people = new ArrayList<>();
        people.add(Tom);
        people.add(Jake);
        people.add(Rachel);
        people.add(Wonka);
        people.add(Willy);
        people.add(Aaron);
        people.add(Isaac);
        people.add(Adolf);


//        for (int i = 0; i < people.size(); i++) {
//            System.out.println(people.get(i).getBirthYear());
//            System.out.println(people.get(i).getDeathYear());
//            System.out.println(" ");
//
//        }

        System.out.println(findCommonYear(people));
    }
}
