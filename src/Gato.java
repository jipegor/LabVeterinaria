        public class Gato extends Animal implements Vacunable, Asegurable {
        private boolean esterilizado;

        public Gato(String nombre, int edad, String dueno, boolean esterilizado) {
            super(nombre, edad, dueno);
            this.esterilizado = esterilizado;
        }

        @Override
        public double calcularCostoConsulta() {
            return 38000;
        }
            private int vacunas = 0;

            @Override
            public void registrarVacuna(String nombre) {
                vacunas++;
            }

            @Override
            public int getVacunasAplicadas() {
                return vacunas;
            }

            @Override
            public double calcularPrimaSeguro() {
                return esterilizado ? 120000 : 200000;
            }

            @Override
            public String obtenerNumeroPoliza() {
                return "POL-GATO-" + nombre.toUpperCase();
            }
    }
