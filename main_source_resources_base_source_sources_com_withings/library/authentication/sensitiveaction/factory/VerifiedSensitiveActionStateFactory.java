package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.Metadata;
import org.jivesoftware.smack.packet.Session;
/* compiled from: VerifiedSensitiveActionStateFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "", "build", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildWithRepo", "verifiedSensitiveActionState", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface VerifiedSensitiveActionStateFactory {
    VerifiedSensitiveActionState build(com.withings.library.authentication.login.Session session);

    VerifiedSensitiveActionState buildWithRepo(com.withings.library.authentication.login.Session session);

    VerifiedSensitiveActionState buildWithRepo(VerifiedSensitiveActionState verifiedSensitiveActionState);
}
