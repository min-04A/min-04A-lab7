import java.util.*;

public class DotChaser {
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList thinglist = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) 
      {
        thinglist.add(new TypeA());
        thinglist.add(new TypeB());
        thinglist.add(new TypeC());
      }

      // Print all
      thinglist.printAll();

      // Move each thing.
      thinglist.moveAll();
      count++;
    }
  }
}
