import cts.spital.model.Pacient;
import cts.spital.model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder("Isabela")
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .build();

        Pacient pacient2 = new PacientBuilder("Popa")
                .setPatRabatabil(true)
                .build();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}