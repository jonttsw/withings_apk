package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.state.NeedCode2FA;
import com.withings.library.authentication.login.state.Sequence;
import com.withings.library.authentication.login.state.impl.NeedCode2FAImpl;
import com.withings.library.authentication.login.state.impl.NeedCode2FAMulti;
import com.withings.library.authentication.login.state.impl.NeedCode2FAWithRepo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedCode2FAFactoryImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactoryImpl;", "Lcom/withings/library/authentication/login/state/factory/NeedCode2FAFactory;", "()V", "buildNeedCode2FA", "Lcom/withings/library/authentication/login/state/NeedCode2FA;", "sequence", "Lcom/withings/library/authentication/login/state/Sequence;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "phoneNumber", "", "buildNeedCode2FAMulti", "needCode2FA", "validSession", "", "buildNeedCode2FAWithRepo", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeedCode2FAFactoryImpl implements NeedCode2FAFactory {
    @Override // com.withings.library.authentication.login.state.factory.NeedCode2FAFactory
    public NeedCode2FA buildNeedCode2FA(Sequence sequence, com.withings.library.authentication.login.Session session, String phoneNumber) {
        u.j(sequence, "sequence");
        u.j(session, "session");
        u.j(phoneNumber, "phoneNumber");
        return new NeedCode2FAImpl(sequence, session, phoneNumber);
    }

    @Override // com.withings.library.authentication.login.state.factory.NeedCode2FAFactory
    public NeedCode2FA buildNeedCode2FAMulti(NeedCode2FA needCode2FA, List<com.withings.library.authentication.login.Session> validSession) {
        u.j(needCode2FA, "needCode2FA");
        u.j(validSession, "validSession");
        return new NeedCode2FAMulti(needCode2FA, validSession);
    }

    @Override // com.withings.library.authentication.login.state.factory.NeedCode2FAFactory
    public NeedCode2FA buildNeedCode2FAWithRepo(NeedCode2FA needCode2FA) {
        u.j(needCode2FA, "needCode2FA");
        return new NeedCode2FAWithRepo(needCode2FA);
    }
}
