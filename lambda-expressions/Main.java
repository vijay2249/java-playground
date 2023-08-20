import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Main{
	record Person(String firstName, String lastName){
		@Override
		public String toString(){
			return firstName+ " " + lastName;
		}
	}

	public static void main(String[] args){
		List<Person> people = new ArrayList<>(Arrays.asList(
						new Main.Person("Lucy", "Browm");
						new Main.Person("Dr.", "Strange");
						new Person("Charlie", "Brown");
		));
		var comparatorLastName = new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2){
				return o1.lastName.compareTo(o2.lastName);
			}
		};
		people.sort(comparatorLastName);
		people.sort((o1,o2) -> o1.lastName.compareTo(o2.lastName));
    System.out.println(people);

    interface EnhancedComparator<T> extends Comparator<T>{
      int secondLevel(T o1, T o2);
    }

    var comparatorMixed = new EnhancedComparator<Person>(){
      @Override
      public int compare(Person o1, Person o2){
        int result = o1.lastName.compareTo(o2.lastName);
        return (result == 0? secondLevel(o1, o2) : result);
      }

      @Override
      public int secondLevel(Person o1, Person o2){
        return o1.firstName.compareTo(o2.firstName);
      }
    }

		var coords = Arrays.asList(
			new double[]{12.3, 33.2},
			new double[]{44.2,-22.6}
		);

		BiConsumer<Double, Double> p1 = (a,b) -> System.out.println(a + ", "+ b);
		coords.forEach(s -> processPoint(s[0], s[1], p1));

	}

	public static <T> T calculator(Operations<T> function, T value1, T value2){
		T result = function.operate(value1, value2);
		sysOut(result);

	}

	public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
		consumer.accept(t1,t2);
	}
}