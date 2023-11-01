public class Triangulo {
    class Triangulo extends FiguraGeometrica {
        private double base;
        private double altura;

        public Triangulo(String nombre, String color, double base, double altura) {
            super(nombre, color);
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double obtenerArea() {
            return 0.5 * base * altura;
        }

        @Override
        public double obtenerPerimetro() {
            // No se puede calcular el perímetro de un triángulo sin más información
            return -1;
        }
    }
}
