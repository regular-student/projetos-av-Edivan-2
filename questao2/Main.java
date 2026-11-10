package questao2;

public class Main {
    public static void main(String[] args) {
        int tempo = 90;

        CalculoTarifa rotativo = new TarifaRotativo();
        CalculoTarifa mensalista = new TarifaMensalista();
        CalculoTarifa conveniado = new TarifaConveniado();

        // RQ 2.9 Calcula o valor para o mesmo tempo nos 3 perfis
        System.out.println("- Calculo para o mesmo tempo (90 min) nos 3 perfis");
        Tiquete t1 = new Tiquete("AAA-1111", tempo, rotativo);
        System.out.println("Rotativo: R$ " + t1.calcularValor());

        Tiquete t2 = new Tiquete("AAA-1234", tempo, mensalista);
        System.out.println("Mensalista: R$ " + t2.calcularValor());

        Tiquete t3 = new Tiquete("AAA-1234", tempo, conveniado);
        System.out.println("Conveniado: R$ " + t3.calcularValor());

        // RQ 2.9 e RQ 2.6 Demonstracao da troca dinamica no mesmo tiquete
        System.out.println("\n- Troca dinamica de perfil no mesmo tiquete-");
        Tiquete tiquete = new Tiquete("BBB-1111", 90, rotativo);
        System.out.println("Valor inicial (Rotativo): R$ " + tiquete.calcularValor());

        tiquete.setTarifa(conveniado);
        System.out.println("Apos trocar para Conveniado: R$ " + tiquete.calcularValor());

        tiquete.setTarifa(mensalista);
        System.out.println("Apos trocar para Mensalista: R$ " + tiquete.calcularValor());
    }
}
