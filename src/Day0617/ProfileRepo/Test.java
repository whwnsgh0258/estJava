package Day0617.ProfileRepo;

public class Test {
    public static void main(String[] args) {
        ProfileService profileService = new ProfileService();
        profileService.saveProfile(new ProfileDBRepository());

        ProfileService profileService2 = new ProfileService();
        profileService2.saveProfile(new ProfileMemoryRepository());
    }
}
