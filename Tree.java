public interface Tree {

/**
* Adds one Integer in the Tree.
*/
void add(int newNumber);

/**
* Finds if a number is in my tree
*/
boolean contains(int n);

/**
* Finds the maximum number in my tree
*/
int getMax();

/**
* Finds the minimum number in my tree
*/
int getMin();
}