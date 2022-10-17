// Rule 03.
// Numeric Types and operations (NUM)
// Compliant Solution

public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
