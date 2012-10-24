public class IntegerTreeNode implements Tree {
  private int value;
  private IntegerTreeNode left;
  private IntegerTreeNode right;
  
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

   public String toString() {
   String result = "[" + value + " L[";
	//if (this.left == null) {
	//result = result + "]"
	//} else {
	  
  
  
  
  
  
  return (result);
  }
  
  
  
  public int depth() {
  int counterLeft = 0;
  int counterRight = 0;
  IntegerTreeNode temp = this;
  IntegerTreeNode temp2 = this;
	while (temp.left != null) {
	counterLeft++;
	temp = temp.left;
	}
	while (temp2.right != null) {
	counterRight++;
	temp2 = temp2.right;
	}
	if (counterLeft > counterRight) {
	return counterLeft;
	} else {
	  return counterRight;
	  }
  
  
  
  
  
  }
  
  
  
  
}


