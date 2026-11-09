public class Main {
    public static void main(String[] args) {
        // 1 · Fichas con referencia polimórfica
        Animal[] animales = {
                new Perro("Tommy", 4, "Carlos", "Labrador"),
                new Gato("Zira", 3, "Ana", true),
                new Ave("Pico", 2, "Marta", 350),
                new Conejo("Nube", 1, "Sofía")
        };
        for (Animal a : animales) {
            a.imprimirFicha();
            System.out.println();
        }

        // 2 · Vacunar el perro y el gato
        Perro tommy = new Perro("Tommy", 4, "Carlos", "Labrador");
        tommy.registrarVacuna("Rabia");
        tommy.registrarVacuna("Moquillo");
        System.out.println("Vacunas de Tommy: " + tommy.getVacunasAplicadas());

        Gato zira = new Gato("zira", 3, "Ana", true);
        zira.registrarVacuna("Triple felina");
        System.out.println("Vacunas de Zira: " + zira.getVacunasAplicadas());

        // 3 · Calcular las pólizas
        Asegurable[] asegurables = {
                tommy,
                zira,
                new Clinica("VetCare", "Calle 1 # 2-3")
        };
        for (Asegurable s : asegurables) {
            System.out.println(s.obtenerNumeroPoliza() + " - prima: $" + s.calcularPrimaSeguro());
        }
    }
}