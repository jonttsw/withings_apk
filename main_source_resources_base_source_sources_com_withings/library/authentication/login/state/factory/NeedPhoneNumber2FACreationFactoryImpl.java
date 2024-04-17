package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationImpl;
import com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti;
import com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationWithRepo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedPhoneNumber2FACreationFactoryImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactoryImpl;", "Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "()V", "buildNeedPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildNeedPhoneNumber2FACreationMulti", "needPhoneNumber2FACreation", "validSessions", "", "buildNeedPhoneNumber2FACreationWithRepo", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FACreationFactoryImpl implements NeedPhoneNumber2FACreationFactory {
    @Override // com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory
    public NeedPhoneNumber2FACreation buildNeedPhoneNumber2FACreation(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return new NeedPhoneNumber2FACreationImpl(session);
    }

    @Override // com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory
    public NeedPhoneNumber2FACreation buildNeedPhoneNumber2FACreationMulti(NeedPhoneNumber2FACreation needPhoneNumber2FACreation, List<com.withings.library.authentication.login.Session> validSessions) {
        u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
        u.j(validSessions, "validSessions");
        return new NeedPhoneNumber2FACreationMulti(needPhoneNumber2FACreation, validSessions);
    }

    @Override // com.withings.library.authentication.login.state.factory.NeedPhoneNumber2FACreationFactory
    public NeedPhoneNumber2FACreation buildNeedPhoneNumber2FACreationWithRepo(NeedPhoneNumber2FACreation needPhoneNumber2FACreation) {
        u.j(needPhoneNumber2FACreation, "needPhoneNumber2FACreation");
        return new NeedPhoneNumber2FACreationWithRepo(needPhoneNumber2FACreation);
    }
}
