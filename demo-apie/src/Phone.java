public class Phone extends Machine { // Student "has" Camera
  private final String model;
  private Camera camera;
  private Photo[] photos;
  private int idx;

  public Phone(String model) {
    this.model = model;
    // this.camera = new Camera();
    this.photos = new Photo[5];
    this.idx = 0;
  }

  public Camera getCamera() {
    return this.camera;
  }

  public boolean takePhoto() {
    if (this.idx >= photos.length) {
      return false;
    }
    this.photos[this.idx] = this.camera.takePhoto();
    this.idx++;
    return true;
  }

  public static void main(String[] args) {
    // Phone
    Phone iphone4 = new Phone("IPONE4");
    Phone iphone5 = new Phone("IPONE5");

    System.out.println(iphone4.getStatus()); // OFF
    iphone4.turnOn();
    System.out.println(iphone4.getStatus()); // ON
    
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
    System.out.println(iphone4.takePhoto());
  }

}
