package Ejercicio_U6_B2_E2;

class Pair<T, V> {

  private T first;
  private V second;

  public T getFirst() {
    return first;
  }

  public V getSecond() {
    return second;
  }

  Pair(T first, V second) {
    this.first = first;
    this.second = second;
  }

  public void setFirst(T first) {
    this.first = first;
  }

  public void setSecond(V second) {
    this.second = second;
  }
}
