package Ejercicio_U6_B2B_E4;

interface Cola {
  //inserta un elemento al final de la cola
  void encolar(int dato);

  //saca el primer elemento de la cola
  //el primer elemento es el más antiguo
  int desencolar();

  public boolean esVacia();

  public int getSize();
}
