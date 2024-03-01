import java.util.ArrayList;

public class Main {
  
    public static void main(String[] args) {
        /**Imports the java.util package.
Uses the generic type ArrayList<E>, where the generic type E specifies the type of the elements. 
Both calls and uses the return value (if non-void) of each of the following ArrayList methods:
int size() 
boolean add(E obj)
void add(int index, E obj) 
E get(int index)
E set(int index, E obj)
E remove(int index)
Uses iteration to traverse an ArrayList
Deletes an element of an ArrayList during traversal without skipping an element.
Throws no ArrayIndexOutOfBoundsExceptions.
Throws no ConcurrentModificationExceptions.
Uses selection sort.
Uses insertion sort.
Safeguards personal privacy.
Benefits personal security.
 */ 
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        // add more
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        //add dups to delete later
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Size of list: " + list.size());
        list.add(2, 5);
        System.out.println("Size of list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        list.set(2, 6);
        System.out.println("Element at index 2: " + list.get(2));
        list.remove(2);
        System.out.println("Size of list: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 2) {
                list.remove(i);
                i--;
            }
        }

        /**Uses a 2D array of mutable object references.
Uses an initializer list to create a 2D array.
Uses both row-major order and column-major order to traverse a 2D array.
Uses nested iteration to traverse a 2D array.
Uses enhanced for loops to traverse a 2D array.
 */
        Stuff[][] stuff = {
            // no constructor
            {new Stuff(), new Stuff(), new Stuff()},
            {new Stuff(), new Stuff(), new Stuff()},
            {new Stuff(), new Stuff(), new Stuff()}
        };
        for (int i = 0; i < stuff.length; i++) {
            for (int j = 0; j < stuff[i].length; j++) {
                stuff[i][j].setIdk(i * stuff[i].length + j);
            }
        }
        for (int j = 0; j < stuff[0].length; j++) {
            for (int i = 0; i < stuff.length; i++) {
                System.out.println("Element at index " + i + ", " + j + ": " + stuff[i][j]);
            }
        }
        for (Stuff[] row : stuff) {
            for (Stuff element : row) {
                System.out.println("Element: " + element);
            }
        }



    }

    @Override
    public String toString() {
        return "Main";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Main;
    }
    
}
