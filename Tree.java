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

/**
*Returns a represantation of the tree in a String form
*/
String toString();


/**
*Finds the depth of my tree
*/
int depth();

}

