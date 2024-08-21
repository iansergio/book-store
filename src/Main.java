import dao.AutorDAO;
import dao.LivroDAO;
import entities.Autor;
import entities.Livro;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        Autor autor = new Autor();
        AutorDAO daoAutor = new AutorDAO();
        LivroDAO daoLivro = new LivroDAO();

        // Inserir autor
//        autor.setNome("");
//        autor.setNacionalidade("");
//        daoAutor.inserir(autor);

        // Atualizar autor
//        autor.setNome("");
//        autor.setNacionalidade("");
//        autor.setId();
//        daoAutor.atualizar(autor);

//        // Excluir autor
//        autor.setId();
//        daoAutor.excluir(autor);

        // Listar autores
        for(Autor a : daoAutor.listar()){
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
        for(Livro l : daoLivro.listar()){
            System.out.println(l);
        }

        // ==================
        System.out.println();

        // Listar livros pelo Id
        for(Livro l : daoLivro.listarPorId(2)){
            System.out.println(l);
        }

    }
}
