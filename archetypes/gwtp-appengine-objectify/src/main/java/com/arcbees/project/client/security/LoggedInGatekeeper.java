package com.arcbees.project.client.security;

import com.arcbees.project.shared.dto.CurrentUserDto;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

@Singleton
public class LoggedInGatekeeper implements Gatekeeper {
    private final CurrentUserDto currentUser;

    @Inject
    public LoggedInGatekeeper(final CurrentUserDto currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public boolean canReveal() {
        return currentUser.isLoggedIn();
    }
}
