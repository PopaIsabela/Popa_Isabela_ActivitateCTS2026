package cts.spital.model;

public class FactoryMedical implements AbstractFactory {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}