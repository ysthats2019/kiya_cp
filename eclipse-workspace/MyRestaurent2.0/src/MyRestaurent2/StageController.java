package MyRestaurent2;
import javafx.stage.Stage;


public class StageController {
    

    public void setStage(Stage s) {
        s.show();
    }

    public void setStage(Stage on,Stage close) {
        close.close();
        setStage(on);
    }
    
}