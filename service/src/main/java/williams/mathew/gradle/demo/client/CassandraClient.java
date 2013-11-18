package williams.mathew.gradle.demo.client;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class CassandraClient {

    public static Session connect(String node, String keyspace) {
        Cluster cluster = Cluster.builder()
                .addContactPoint(node)
                        // .withSSL() // Uncomment if using client to node encryption
                .build();
        Metadata metadata = cluster.getMetadata();
        System.out.printf("Connected to cluster: %s\n",
                metadata.getClusterName());
        for ( Host host : metadata.getAllHosts() ) {
            System.out.printf("Datacenter: %s; Host: %s; Rack: %s\n",
                    host.getDatacenter(), host.getAddress(), host.getRack());
        }

        return cluster.connect(keyspace);
    }

//    public void close() {
//        cluster.shutdown();
//    }

//    public void createSchema(String keyspace, String table) {
//        session.execute(String.format("CREATE KEYSPACE %s WITH replication " +
//                "= {'class':'SimpleStrategy', 'replication_factor':3};", keyspace));
//
//        session.execute(
//                String.format("CREATE TABLE %s.%s (" +
//                        "id uuid," +
//                        "title text," +
//                        "album text, " +
//                        "artist text," +
//                        "song_id uuid," +
//                        "PRIMARY KEY (id, title, album, artist)" +
//                        ");", keyspace, table));
//
//    }

}
