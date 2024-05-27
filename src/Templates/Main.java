package Templates;

import Sections.Education;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main extends Application {



    @SneakyThrows
    public void start(Stage stage)  {
        Parent root = FXMLLoader.load(getClass().getResource("../FXMLs/main.fxml"));
        stage.setTitle("Purchase Order Creator");
        stage.setScene(new Scene(root, 700, 480));
        stage.show();
    }

    public static void main(String[] args) {
//        launch(args);
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernare.cfg.xml").build();
        Metadata data = new MetadataSources(registry).getMetadataBuilder().build();

        SessionFactory sessionFactory = data.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        Education ed = new Education();
        ed.setA("asdasd");

        session.save(ed);
        transaction.commit();

        sessionFactory.close();
        session.close();


    }
}