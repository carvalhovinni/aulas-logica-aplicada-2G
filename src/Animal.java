public class Animal {
    // Atributos
    String especies;
    String porte;
    String idade;
    String raca;
    String corPelo;
    String corOlhoDirieto;

    String nome;
    // Métodos

    public void comer(){
        System.out.println("animal comeu");

        Animal cao = new Animal();
        cao.nome = "pluto";
        cao.comer();


    }
}
