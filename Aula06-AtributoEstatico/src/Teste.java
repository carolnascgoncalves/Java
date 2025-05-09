public class Teste {
    public static void main(String[] args) {
        AtributoEstatico estatico = new AtributoEstatico();
        estatico.exibir();

        AtributoEstatico estatico2 = new AtributoEstatico();
        estatico2.exibir();

        AtributoEstatico estatico3 = new AtributoEstatico();
        estatico3.exibir();


        //atributo estatico pertence a classe
        //o objeto instanciado não aletera o atributo estatico

        //usado toda vez que quiser gerenciar a quantidade de atributos ou então valores fixos
    }
}