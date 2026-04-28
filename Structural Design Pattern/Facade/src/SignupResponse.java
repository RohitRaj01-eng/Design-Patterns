import entities.User;

public record SignupResponse(User user, boolean isOnboarded) {
}
