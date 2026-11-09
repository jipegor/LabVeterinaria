public class Perro extends Animal implements Vacunable, Asegurable {
        private String raza;

        public Perro(String nombre, int edad, String dueno, String raza) {
            super(nombre, edad, dueno);
            this.raza = raza;
        }

        @Override
        public double calcularCostoConsulta() {
            return 45000 + 3000 * edad;
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
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-" + nombre.toUpperCase();
    }
    }
