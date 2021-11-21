import java.io.IOException;

public class NewUser extends RuntimeException {
    public NewUser(){
    }
    public NewUser(String message) {
        super(message);
    }
}
