public class Ropa {
   String tipo;
   int precio;
   double strategyPrice;

   public Ropa(String tipo, int precio) {
      this.tipo = tipo;
      this.precio = precio;
   }

   public String getTipo() {
      return tipo;
   }
   
   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getStrategyPrice() {
        return strategyPrice;
    }

    public void setStrategyPrice(double strategyPrice) {
        this.strategyPrice = strategyPrice;
    }

    public void showInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio: " + "Bs." + precio);
        System.out.println("Precio de estacion: " + "Bs." + strategyPrice);
        System.out.println();
    }
    
}
