// Rule 10.
// Thread APIs (THI)
// Non Compliant Solution

public final class Foo implements Runnable {
    @Override public void run() {
      // ...
    }
   
    public static void main(String[] args) {
      Foo foo = new Foo();
      new Thread(foo).run();
    }
  }