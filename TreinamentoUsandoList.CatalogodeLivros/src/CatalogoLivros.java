import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livros> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livros(titulo, autor, anoPublicacao));
    }
    public List<Livros> pesquisarPorAutor(String autor){
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livros l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
      List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
      if (!livroList.isEmpty()){
        for (Livros l : livroList){
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(l);
            }
        }
      }     
      return livrosPorIntervaloAnos; 
    } 
    public void exibirLivros(){
        System.out.println(livroList);
    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livros l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("João e o pé de feijão", "Jonathan Capritchi", 2004);
        catalogoLivros.adicionarLivro("Cassandrita de la Muerte", "Jhony Renon", 1997);
        catalogoLivros.adicionarLivro("As dificuldades do presente", "Brick Loyer", 2001);
        catalogoLivros.adicionarLivro("Atardecer da vida", "Brick Loyer", 2023);
        catalogoLivros.adicionarLivro("Guia de salto com vara", "Dennys Widson", 2005);
        catalogoLivros.adicionarLivro("Domando felinos com pão de alho", "Jonathan Capritchi", 2021);
        catalogoLivros.exibirLivros();
        
        //System.out.println(catalogoLivros.pesquisarPorAutor("Jonathan Capritchi")); 
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2004));
        //System.out.println(catalogoLivros.pesquisarPorTitulo("João e o pé de feijão"));
    }
}
