package cts.spital.model;

public class FactoryNonMedical implements AbstractFactory {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Secretar(nume);
    }
}