package dao;

import entities.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO extends BancoDAO{

    public void inserir(Autor autor){
        String sql = """
                INSERT INTO autor(nome, nacionalidade)
                VALUES(?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, autor.getNome());
            stat.setString(2, autor.getNacionalidade());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Autor autor) {
        String sql = """
                UPDATE autor SET nome = ?, nacionalidade = ? WHERE id_autor = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, autor.getNome());
            stat.setString(2, autor.getNacionalidade());
            stat.setInt(3, autor.getId());
            stat.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void excluir(Autor autor) {
        String sql = """
                DELETE FROM autor WHERE id_autor = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, autor.getId());
            stat.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    public List<Autor> listar(){
        List<Autor> lista = new ArrayList<>();
        String sql = """
            SELECT id_autor, nome, nacionalidade FROM autor ORDER BY id_autor ASC
            """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Autor autor = new Autor();
                autor.setId(res.getInt("id_autor"));
                autor.setNome(res.getString("nome"));
                autor.setNacionalidade(res.getString("nacionalidade"));
                lista.add(autor);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
}
