package williams.mathew.gradle.demo.dao;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import williams.mathew.gradle.demo.client.CassandraClient;
import williams.mathew.gradle.demo.data.model.Status;

public class SudokuDao {
    private Session session;
    public SudokuDao() {
        session = CassandraClient.connect("localhost", "sudoku");
    }

    public void save(Status status) {
        session.execute(
                String.format("INSERT INTO status (code, message) VALUES (%s,'%s')",
                        status.getStatusCode(), status.getStatusMessage()));

    }
}
