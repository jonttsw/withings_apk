package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.NeedCode2FASetup;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupImpl;
import com.withings.library.authentication.setup2fa.state.impl.NeedCode2FASetupWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedCode2FASetupFactoryImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactoryImpl;", "Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "()V", "build", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "phoneNumber", "", "previousNeedPhoneNumber2FASetup", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "buildWithRepo", "needCode2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedCode2FASetupFactoryImpl implements NeedCode2FASetupFactory {
    @Override // com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory
    public NeedCode2FASetup build(com.withings.library.authentication.login.Session session, String phoneNumber, NeedPhoneNumber2FASetup previousNeedPhoneNumber2FASetup) {
        u.j(session, "session");
        u.j(phoneNumber, "phoneNumber");
        u.j(previousNeedPhoneNumber2FASetup, "previousNeedPhoneNumber2FASetup");
        return new NeedCode2FASetupImpl(session, previousNeedPhoneNumber2FASetup, phoneNumber);
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory
    public NeedCode2FASetup buildWithRepo(com.withings.library.authentication.login.Session session, String phoneNumber, NeedPhoneNumber2FASetup previousNeedPhoneNumber2FASetup) {
        u.j(session, "session");
        u.j(phoneNumber, "phoneNumber");
        u.j(previousNeedPhoneNumber2FASetup, "previousNeedPhoneNumber2FASetup");
        return buildWithRepo(build(session, phoneNumber, previousNeedPhoneNumber2FASetup));
    }

    @Override // com.withings.library.authentication.setup2fa.state.factory.NeedCode2FASetupFactory
    public NeedCode2FASetup buildWithRepo(NeedCode2FASetup needCode2FASetup) {
        u.j(needCode2FASetup, "needCode2FASetup");
        return new NeedCode2FASetupWithRepo(needCode2FASetup);
    }
}
