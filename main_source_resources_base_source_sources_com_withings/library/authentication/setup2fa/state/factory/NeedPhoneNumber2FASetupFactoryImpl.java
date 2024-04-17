package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupImpl;
import com.withings.library.authentication.setup2fa.state.impl.NeedPhoneNumber2FASetupWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedPhoneNumber2FASetupFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactoryImpl;", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedPhoneNumber2FASetupFactory;", "()V", "build", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildWithRepo", "needPhoneNumber2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FASetupFactoryImpl implements NeedPhoneNumber2FASetupFactory {
    @Override // com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory
    public NeedPhoneNumber2FASetup build(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return new NeedPhoneNumber2FASetupImpl(session);
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory
    public NeedPhoneNumber2FASetup buildWithRepo(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return buildWithRepo(build(session));
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.NeedPhoneNumber2FASetupFactory
    public NeedPhoneNumber2FASetup buildWithRepo(NeedPhoneNumber2FASetup needPhoneNumber2FASetup) {
        u.j(needPhoneNumber2FASetup, "needPhoneNumber2FASetup");
        return new NeedPhoneNumber2FASetupWithRepo(needPhoneNumber2FASetup);
    }
}
