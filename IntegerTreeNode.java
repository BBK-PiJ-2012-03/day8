public class IntegerTreeNode implements Tree {
  int value;
  IntegerTreeNode left;
  IntegerTreeNode right;
  
  public IntegerTreeNode(int newNumber) {
  this.value = newNumber;
  this.right = null;
  this.left = null;
  }
  
  public void add(int newNumber) {
	if (newNumber > this.value) {
		if (right == null) {
		right = new IntegerTreeNode(newNumber);
		} else {
		right.add(newNumber);
	      }
	} else {
		if (left == null) {
		left = new IntegerTreeNode(newNumber);
		} else {
		left.add(newNumber);
		  }
	  }
  }

  public boolean contains(int n) {
	if (n == this.value) {
	return true;
	} 
		else if (n > this.value) {
					if (this.right != null) {
					return right.contains(n);
					} else {
						return false;
						}
		} else  {
					if (this.left !=null) {
					return left.contains(n);
					} else {
						return false;
						}
		  }
 
  }

  public int getMax() {
	  int max = value;
	  if (right == null) {
		return max;
	  }
	 else {
		return right.getMax();
	}
  }
  
  public int getMin() {
  int min = value;
  if (left == null) {
  return min;
  }
	else {
	return left.getMin();
	}
  }
}