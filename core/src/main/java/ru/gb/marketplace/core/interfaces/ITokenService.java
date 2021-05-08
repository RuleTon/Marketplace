package ru.gb.marketplace.core.interfaces;

import ru.gb.marketplace.core.model.UserInfo;

public interface ITokenService {

    String generateToken(UserInfo user);

    UserInfo parseToken(String token);
}
