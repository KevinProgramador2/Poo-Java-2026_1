import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDao {
    private Connection connection;

    public ContaDao() {
        connection = new ConnectionFactory().getConnection();
    }

    public void inserir(Conta conta) {
        String sql = "insert into Contas(titular, saldo) values(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, conta.getTitular());
            stmt.setDouble(2, conta.getSaldo());
            stmt.execute();
            stmt.close();
            // connection.close();
        } catch (Exception e) {
            System.out.println("Conta não Inserida!");
        }

    }

    public void saqueDeposito(double valorTransacao, Integer idConta) {
        String sql = "update Contas set saldo = saldo + ? where id_conta = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, valorTransacao);
            stmt.setInt(2, idConta);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            System.err.println("ERRO! - Transação não realizada - ");
        }
    }

    public void buscarConta(Integer idConta) {
        String sql = "Select * from Contas where id_conta = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idConta);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Conta conta = new Conta(rs.getInt("id_conta"), rs.getString("titular"), rs.getDouble("saldo"));
                System.out.println(conta);
            }
            stmt.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public List<Conta> listaContas() {
        List<Conta> contas = new ArrayList<>();
        String sql = "Select * from Contas";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Conta conta = new Conta(rs.getInt("id_conta"), rs.getString("titular"), rs.getDouble("saldo"));
                contas.add(conta);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contas;

    }

    public void removerConta(Integer idConta) {
        String sql = "delete from Contas where id_conta = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idConta);
            stmt.execute();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}