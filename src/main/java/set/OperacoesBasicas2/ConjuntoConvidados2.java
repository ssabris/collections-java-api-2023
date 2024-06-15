package main.java.set.OperacoesBasicas2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados2 {
    //atributo
    private Set<Convidado2> convidado2Set;
    public ConjuntoConvidados2() {
        this.convidado2Set = new HashSet<>();
    }

    public void adicionarConvidado2(String nome, int codigoConvite) {
        convidado2Set.add(new Convidado2(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado2 convidadoParaRemover = null;
        for (Convidado2 c : convidado2Set) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidado2Set.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidado2Set.size();
    }

    public void exibirConvidados(){
        System.out.println(convidado2Set);
    }

    public static void main(String[] args) {
        ConjuntoConvidados2 conjuntoConvidados2 = new ConjuntoConvidados2();
        System.out.println("Existem " + conjuntoConvidados2.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados2.adicionarConvidado2("Convidado 1", 1234);
        conjuntoConvidados2.adicionarConvidado2("Convidado 2", 1235);
        conjuntoConvidados2.adicionarConvidado2("Convidado 3", 1235);
        conjuntoConvidados2.adicionarConvidado2("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados2.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados2.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados2.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados2.exibirConvidados();


    }
}
