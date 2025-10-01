package Aula8;

public class EquipamentoMain {
    public static void main(String[] args) {
        Equipamento eq1 = new Equipamento("Osciloscopio", "Medidor", "Tektronix", 2020, 15500.0);
        Equipamento eq2 = new Equipamento("Multimetro", "Medidor", "Fluke", 2021, 2600.0);

        eq1.setNome("Osciloscopio Digital");
        eq2.setNome("Multimetro True RMS");

        eq1.exibirInformacoes();
        eq2.exibirInformacoes();
    }
}
