package Day0617.ProfileRepo;

public class ProfileService {

    public void saveProfile(ProfileRepository repository) {// 이 부분만 바꿔 끼우면 됨
        repository.save();
    }
}