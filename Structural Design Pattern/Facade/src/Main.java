import services.*;

void main() {
    UserService userService=new UserService();
    EmailService emailService=new EmailService();
    AnalyticsService analyticsService=new AnalyticsService();
    UserOnboardingFacade userOnboardingFacade=new UserOnboardingFacade(userService,emailService,analyticsService);
    SignupRequest request=new SignupRequest("Rohit","rohit@gmail.com");

    SignupResponse response = userOnboardingFacade.onboard(request);
    System.out.println(response.user());
}
