public class BirdOwner {
  // ! Array implementation
  // private Bird[] birds;
  // ! ArrayList implementation

  // ! LinkedList implementation
  private Bird head;

  public BirdOwner(Bird head){
    this.head = head;
  }

  public void add(Bird bird) {
    if (this.head == null){
      this.head = bird;
      return;
    }
    Bird temp = this.head;
    while(temp != null){
      if (temp.getNext() == null){
        break;
      }
      temp = temp.getNext();
    }
    temp.setNext(bird);
  }

  public Bird lastBird() {
    Bird temp = this.head;
    while (temp.getNext() != null){
      temp = temp.getNext();
    }
    return temp;
  }

  // equls(), toString(), hashCode()

  public static void main(String[] args) {
    BirdOwner bo = new BirdOwner(
      new Bird("vincent", new Bird("niko", new Bird("ricky", null))));
    Bird jacky = new Bird("jacky", null);

    bo.add(jacky);
    bo.add(new Bird("alex", null));



    // Find the last bird
  }
}
