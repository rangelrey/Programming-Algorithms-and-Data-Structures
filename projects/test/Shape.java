public class Shape implements Comparable<Shape> {
  private String colour;

  public Shape (String colour) {
    this.colour = colour;
  }
  public int getLengthColour() {
      int count = 0;
      
      for (char ch: colour.toCharArray()) {
          count ++;
        }
        return count;
}
    
  public String getColour () {
    return colour;
  }
  
  public int compareTo(Shape o){
    if (this.getLengthColour() > o) {
        return 1;
    }
}
}


