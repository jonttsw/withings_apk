package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.Registered2FASetup;
import com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupImpl;
import com.withings.library.authentication.setup2fa.state.impl.Registered2FASetupWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: Registered2FASetupFactoryImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactoryImpl;", "Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "()V", "build", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "phoneNumber", "", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildWithRepo", "registered2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Registered2FASetupFactoryImpl implements Registered2FASetupFactory {
    @Override // com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory
    public Registered2FASetup build(String phoneNumber, com.withings.library.authentication.login.Session session) {
        u.j(phoneNumber, "phoneNumber");
        u.j(session, "session");
        return new Registered2FASetupImpl(phoneNumber, session);
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory
    public Registered2FASetup buildWithRepo(String phoneNumber, com.withings.library.authentication.login.Session session) {
        u.j(phoneNumber, "phoneNumber");
        u.j(session, "session");
        return buildWithRepo(build(phoneNumber, session));
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.Registered2FASetupFactory
    public Registered2FASetup buildWithRepo(Registered2FASetup registered2FASetup) {
        u.j(registered2FASetup, "registered2FASetup");
        return new Registered2FASetupWithRepo(registered2FASetup);
    }
}
