import dao.AutorDAO;
import dao.LivroDAO;
import entities.Autor;
import entities.Livro;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        Autor autor = new Autor();
        AutorDAO daoAutor = new AutorDAO();
        LivroDAO daoLivro = new LivroDAO();

        // Inserir autor
//        autor.setNome("");
//        autor.setNacionalidade("");
//        daoAutor.inserirAutor(autor);

        // Atualizar autor
//        autor.setNome("");
//        autor.setNacionalidade("");
//        autor.setId();
//        daoAutor.atualizarAutor(autor);

//        // Excluir autor
//        autor.setId();
//        daoAutor.excluirAutor(autor);

        // Listar autores
        for(Autor a : daoAutor.listarAutores()){
            System.out.println(a);
        }

        // ==================
        System.out.println();

        // Inserir livro
//        livro.setTitulo("");
//        livro.setAno();
//        livro.setAutorId();
//        daoLivro.inserirLivro(livro);

        // Atualizar livro
//        livro.setTitulo("");
//        livro.setAno();
//        livro.setAutorId();
//        livro.setId();
//        daoLivro.alterarLivro(livro);

        // Excluir livro
//        livro.setId();
//        daoLivro.excluirLivro(livro);

        // Listar livros
        for(Livro l : daoLivro.listarLivros()){
            System.out.println(l);
        }

    }
}
