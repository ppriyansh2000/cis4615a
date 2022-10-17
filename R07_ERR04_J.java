// Rule 07.
// Exception Behavior (ERR)
// Non Compliant Solution

class TryFinally {
    private static boolean doLogic() {
      try {
        throw new IllegalStateException();
      } finally {
        System.out.println("logic done");
        return true;
      }
    }
  }