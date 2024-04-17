package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.NeedCode2FASetup;
import com.withings.library.authentication.setup2fa.state.NeedPhoneNumber2FASetup;
import kotlin.Metadata;
import org.jivesoftware.smack.packet.Session;
/* compiled from: NeedCode2FASetupFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/NeedCode2FASetupFactory;", "", "build", "Lcom/withings/library/authentication/setup2fa/state/NeedCode2FASetup;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "phoneNumber", "", "previousNeedPhoneNumber2FASetup", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "buildWithRepo", "needCode2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NeedCode2FASetupFactory {
    NeedCode2FASetup build(com.withings.library.authentication.login.Session session, String str, NeedPhoneNumber2FASetup needPhoneNumber2FASetup);

    NeedCode2FASetup buildWithRepo(com.withings.library.authentication.login.Session session, String str, NeedPhoneNumber2FASetup needPhoneNumber2FASetup);

    NeedCode2FASetup buildWithRepo(NeedCode2FASetup needCode2FASetup);
}
