package Templates;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.SneakyThrows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        launch(args);
        SessionFactory  seessionFactory = new Configuration().configure("hibernare.cfg.xml").buildSessionFactory();

        Session session = seessionFactory.openSession();
        Transaction transaction =  session.beginTransaction();

        transaction.commit();
        session.close();
        seessionFactory.close();



    }
}