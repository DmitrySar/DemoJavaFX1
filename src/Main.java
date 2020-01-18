import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		TextField text = new TextField();
		text.setFont(Font.font(50));
		Button button = new Button("click me");
		button.setFont(Font.font(32));
		VBox root = new VBox(text, button);
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World!");
		primaryStage.show();
	}
}