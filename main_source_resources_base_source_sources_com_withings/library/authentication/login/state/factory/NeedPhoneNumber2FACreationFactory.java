package com.withings.library.authentication.login.state.factory;

import com.withings.library.authentication.login.state.NeedPhoneNumber2FACreation;
import java.util.List;
import kotlin.Metadata;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedPhoneNumber2FACreationFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/withings/library/authentication/login/state/factory/NeedPhoneNumber2FACreationFactory;", "", "buildNeedPhoneNumber2FACreation", "Lcom/withings/library/authentication/login/state/NeedPhoneNumber2FACreation;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildNeedPhoneNumber2FACreationMulti", "needPhoneNumber2FACreation", "validSessions", "", "buildNeedPhoneNumber2FACreationWithRepo", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NeedPhoneNumber2FACreationFactory {
    NeedPhoneNumber2FACreation buildNeedPhoneNumber2FACreation(com.withings.library.authentication.login.Session session);

    NeedPhoneNumber2FACreation buildNeedPhoneNumber2FACreationMulti(NeedPhoneNumber2FACreation needPhoneNumber2FACreation, List<com.withings.library.authentication.login.Session> list);

    NeedPhoneNumber2FACreation buildNeedPhoneNumber2FACreationWithRepo(NeedPhoneNumber2FACreation needPhoneNumber2FACreation);
}
