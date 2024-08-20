package dao;

import entities.Autor;
import entities.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO extends BancoDAO{

    public void inserirLivro(Livro livro) {
        String sql = """
                INSERT INTO livro(titulo, ano_publicacao, id_autor)
                VALUES(?, ?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, livro.getTitulo());
            stat.setInt(2, livro.getAno());
            stat.setInt(3, livro.getAutorId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarLivro(Livro livro) {
        String sql = """
                UPDATE livro 
                SET titulo = ?, ano_publicacao = ?, id_autor = ? WHERE id_livro = ? 
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, livro.getTitulo());
            stat.setInt(2, livro.getAno());
            stat.setInt(3, livro.getAutorId());
            stat.setInt(4, livro.getId());
            stat.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void excluirLivro(Livro livro) {
        String sql = """
                DELETE FROM livro WHERE id_livro = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, livro.getId());
            stat.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Livro> listarLivros(){
        List<Livro> lista = new ArrayList<>();
        String sql = """
            SELECT id_livro, titulo, ano_publicacao, id_autor FROM livro;
            """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Livro livro = new Livro();
                livro.setId(res.getInt("id_livro"));
                livro.setTitulo(res.getString("titulo"));
                livro.setAno(res.getInt("ano_publicacao"));
                livro.setAutorId(res.getInt("id_autor"));
                lista.add(livro);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
}
