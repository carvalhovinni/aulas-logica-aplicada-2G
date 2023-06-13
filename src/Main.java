public class Main {
    public static void main(String[] args) {
         // Aula introdutória de Orientação à Objetos
             // criar objetos
        Pessoa adao = new Pessoa();
        // Declaração objeto
        Pessoa qualquer;
        // Instanciação do objeto
        qualquer = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee"; //definir comportamento do objeto
        qualquer.falar();
        adao.falar("baixo");
        // criar mais objetos
        // Declarar objetos
        Pessoa rainha;
        // Intanciar objetos
        rainha = new Pessoa();
        // definir formato do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // definir comportamento
        rainha.falar();
        rainha.falar("alto");
        System.out.println(rainha.falar("grave"));
    }
}