package cts.spital.main;

import cts.spital.model.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== A1 BUILDER =====");

        Pacient p1 = new PacientBuilder("Isabela")
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .build();

        Pacient p2 = new PacientBuilder("Popa")
                .setPatRabatabil(true)
                .build();

        System.out.println(p1);
        System.out.println(p2);


        System.out.println("\n===== A3 ABSTRACT FACTORY =====");

        AbstractFactory fabricaMed = new FactoryMedical();
        AbstractFactory fabricaNonMed = new FactoryNonMedical();

        PersonalSpital personal1 = fabricaMed.createPersonal("Ionescu Andrei");
        PersonalSpital personal2 = fabricaNonMed.createPersonal("Popescu Maria");

        personal1.afisare();
        personal2.afisare();


        System.out.println("\n===== A4 PROTOTYPE =====");

        Map<String, Float> ingrediente = new HashMap<>();
        ingrediente.put("Substanta1", 15.0f);
        ingrediente.put("Substanta2", 25.5f);

        Reteta reteta1 = new Reteta("Reteta raceala", ingrediente);
        Reteta reteta2 = reteta1.clone();

        System.out.println(reteta1);
        System.out.println(reteta2);


        System.out.println("\n===== A6 FACADE =====");

        PacientInternare pacientInternare =
                new PacientInternare("Popa Isabela", true);

        MedicInternare medicInternare =
                new MedicInternare(true);

        Salon salon =
                new Salon(2);

        FacadeInternare facadeInternare =
                new FacadeInternare();

        facadeInternare.verificaInternare(
                pacientInternare,
                medicInternare,
                salon
        );


        System.out.println("\n===== A7 DECORATOR =====");

        Rezultat rezultatPrintat =
                new RezultatPrintat("Popa Isabela");

        rezultatPrintat.afiseazaRezultat();

        System.out.println();

        Rezultat rezultatOnline =
                new RezultatOnline(rezultatPrintat);

        rezultatOnline.afiseazaRezultat();

        System.out.println("\n===== A8 COMPOSITE =====");

        StructuraSpital spital =
                new Departament("Spital Municipal");

        StructuraSpital cardiologie =
                new Departament("Cardiologie");

        StructuraSpital chirurgie =
                new Departament("Chirurgie");

        StructuraSpital sectie1 =
                new Sectie("Cardiologie Adulti");

        StructuraSpital sectie2 =
                new Sectie("Cardiologie Pediatrica");

        StructuraSpital sectie3 =
                new Sectie("Chirurgie Generala");

        cardiologie.adaugaStructura(sectie1);
        cardiologie.adaugaStructura(sectie2);

        chirurgie.adaugaStructura(sectie3);

        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(chirurgie);

        spital.afiseazaStructura(" ");

        System.out.println("\n===== A9 PROXY =====");

        Internare internareSpital = new InternareSpital();
        Internare proxyInternare = new ProxyInternare(internareSpital);

        PacientProxy pacientCuAsigurare =
                new PacientProxy("Popa Isabela", true);

        PacientProxy pacientFaraAsigurare =
                new PacientProxy("Ionescu Ana", false);

        proxyInternare.interneaza(pacientCuAsigurare);
        proxyInternare.interneaza(pacientFaraAsigurare);


        System.out.println("\n===== A10 FLYWEIGHT =====");

        PacientFactoryFlyweight factoryFlyweight =
                new PacientFactoryFlyweight();

        PacientFlyweight pacient1 =
                factoryFlyweight.getPacient(
                        "Popa Isabela",
                        "0712345678",
                        "Bucuresti"
                );

        PacientFlyweight pacient2 =
                factoryFlyweight.getPacient(
                        "Popa Isabela",
                        "0712345678",
                        "Bucuresti"
                );

        pacient1.afiseazaInternare(
                new InternareContext(101, 2, 5)
        );

        pacient2.afiseazaInternare(
                new InternareContext(205, 1, 3)
        );

        System.out.println("Numar obiecte pacient create: "
                + factoryFlyweight.getNumarPacienti());

        System.out.println("\n===== A11 STRATEGY =====");

        PacientPlata pacientPlata =
                new PacientPlata("Popa Isabela");

        pacientPlata.platesteInternare(350.0f);

        pacientPlata.setModPlata(new PlataCard());
        pacientPlata.platesteInternare(500.0f);

        System.out.println("\n===== A12 OBSERVER =====");

        Spital spitalObserver = new Spital();

        ObserverPacient pacientAbonat1 =
                new PacientAbonat("Popa Isabela");

        ObserverPacient pacientAbonat2 =
                new PacientAbonat("Ionescu Maria");

        ObserverPacient pacientAbonat3 =
                new PacientAbonat("Georgescu Andrei");

        spitalObserver.adaugaObserver(pacientAbonat1);
        spitalObserver.adaugaObserver(pacientAbonat2);
        spitalObserver.adaugaObserver(pacientAbonat3);

        spitalObserver.anuntaEpidemie("Gripa sezoniera");

        System.out.println("\n===== A13 STATE =====");

        PacientState pacientState =
                new PacientState("Popa Isabela");

        pacientState.setStare(new StareInternat());

        pacientState.setStare(new StareSubObservatie());

        pacientState.setStare(new StareExternat());


        System.out.println("\n===== A14 TEMPLATE METHOD =====");

        InternareTemplate internareTemplate =
                new InternarePacientTemplate();

        internareTemplate.interneazaPacient();

        System.out.println("\n===== A15 COMMAND =====");

        MedicComanda medicComanda =
                new MedicComanda("Dr. Ionescu");

        OperatorTriaj operatorTriaj =
                new OperatorTriaj();

        operatorTriaj.adaugaComanda(
                new ComandaInternare(medicComanda, "Popa Isabela")
        );

        operatorTriaj.adaugaComanda(
                new ComandaTratare(medicComanda, "Georgescu Andrei")
        );

        operatorTriaj.trimiteComenzi();
    }
}