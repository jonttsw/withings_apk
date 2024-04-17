package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.Unregistered2FASetup;
import com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupImpl;
import com.withings.library.authentication.setup2fa.state.impl.Unregistered2FASetupWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: Unregistered2FASetupFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactoryImpl;", "Lcom/withings/library/authentication/setup2fa/state/factory/Unregistered2FASetupFactory;", "()V", "build", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildWithRepo", "unregistered2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Unregistered2FASetupFactoryImpl implements Unregistered2FASetupFactory {
    @Override // com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory
    public Unregistered2FASetup build(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return new Unregistered2FASetupImpl(session);
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory
    public Unregistered2FASetup buildWithRepo(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return buildWithRepo(build(session));
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.Unregistered2FASetupFactory
    public Unregistered2FASetup buildWithRepo(Unregistered2FASetup unregistered2FASetup) {
        u.j(unregistered2FASetup, "unregistered2FASetup");
        return new Unregistered2FASetupWithRepo(unregistered2FASetup);
    }
}
