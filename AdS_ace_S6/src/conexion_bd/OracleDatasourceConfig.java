/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion_bd;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author santi
 */
public class OracleDatasourceConfig {
    private static OracleDataSource dataSource;
    // Inicialización estática del DataSource
    static {
        try {
            dataSource = new OracleDataSource();
            String walletPath = "C:/wallet_diego/";
            Properties props = new Properties();
            props.setProperty("oracle.net.tns_admin", walletPath);
            dataSource.setUser("EFT_G6_S9");
            dataSource.setPassword("EfT1G6S9()ab");
            dataSource.setURL("jdbc:oracle:thin:malmk4ra0sxzjb32_medium");
            // Prueba de conexión
            try (Connection connection = dataSource.getConnection()) {
                System.out.println("Conexión exitosa con la base de datos.");
            } catch (SQLException e) {
                System.err.println("Error al probar la conexión: " + e.getMessage());
                throw e;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al configurar el DataSource: " + e.getMessage());
        }
    }
    // Método para obtener conexiones
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}