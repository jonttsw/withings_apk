package com.withings.library.authentication.setup2fa.state.factory;

import com.withings.library.authentication.setup2fa.state.Registered2FASetup;
import kotlin.Metadata;
import org.jivesoftware.smack.packet.Session;
/* compiled from: Registered2FASetupFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/factory/Registered2FASetupFactory;", "", "build", "Lcom/withings/library/authentication/setup2fa/state/Registered2FASetup;", "phoneNumber", "", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildWithRepo", "registered2FASetup", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Registered2FASetupFactory {
    Registered2FASetup build(String str, com.withings.library.authentication.login.Session session);

    Registered2FASetup buildWithRepo(Registered2FASetup registered2FASetup);

    Registered2FASetup buildWithRepo(String str, com.withings.library.authentication.login.Session session);
}
