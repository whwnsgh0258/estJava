package Day0617.ProfileRepo;

public class ProfileDBRepository implements ProfileRepository {

    @Override
    public void save() {
        System.out.println("DB에 프로필 저장하는 기능");
    }
}
