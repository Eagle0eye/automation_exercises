package testing.mapper;

import testing.dto.RegisterForm;
import util.JsonLoader;

public class RegisterMapper {
    public static RegisterForm ToRegisterForm(String path) {
        return JsonLoader.loadConfig(path, RegisterForm.class);
    }
}
