public class GSTest {
  public static void main(String[] args) {
    StoreCapacity store = new StoreCapacity();
    new Client("Client1", store);
    new Client("Client2", store);
    new Client("Client3", store);
    new Client("Client4", store);
    new Client("Client5", store);
    new Client("Client6", store);
    new Client("Client7", store);
    new Client("Client8", store);
    new Client("Client9", store);
    new Client("Client10", store);
  }
} 
class StoreCapacity {
  //Assume 4 store slots for simplicity
  public static final int MAX_CAPACITY = 4;
  private int totalClientsinStore = 0;

  public synchronized void attend(String client) {
    while (totalClientsinStore >= MAX_CAPACITY) {
      try {
        System.out.println(" The store capacity is full " +
        client + " has to wait ");
        wait();
      } catch (InterruptedException e) {
        //
      }
    }
    //precondition is true
    System.out.println(client + " has bought");
    totalClientsinStore = totalClientsinStore + 1;
  }
  public synchronized void leave(String client) {
    totalClientsinStore = totalClientsinStore - 1;
    System.out.println(client +
                       " has left, notify a waiting client");
    notify();
  }
}
class Client extends Thread {
  private StoreCapacity store;
  private String name;

  Client(String n, StoreCapacity s) {
    name = n;
    store = s;
    start();
  }
  public void run() {
    System.out.println(name + " is ready to buy");
    store.attend(name);
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      //
    }
    //leave after 1000ms
    store.leave(name);
  }
}
