package com.withings.library.authentication.sensitiveaction.factory;

import com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateImpl;
import com.withings.library.authentication.sensitiveaction.impl.VerifiedSensitiveActionStateWithRepo;
import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Session;
/* compiled from: VerifiedSensitiveActionStateFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactoryImpl;", "Lcom/withings/library/authentication/sensitiveaction/factory/VerifiedSensitiveActionStateFactory;", "()V", "build", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "buildWithRepo", "verifiedSensitiveActionState", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VerifiedSensitiveActionStateFactoryImpl implements VerifiedSensitiveActionStateFactory {
    @Override // com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory
    public VerifiedSensitiveActionState build(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return new VerifiedSensitiveActionStateImpl(session);
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory
    public VerifiedSensitiveActionState buildWithRepo(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        return buildWithRepo(build(session));
    }

    @Override // com.withings.library.authentication.sensitiveaction.factory.VerifiedSensitiveActionStateFactory
    public VerifiedSensitiveActionState buildWithRepo(VerifiedSensitiveActionState verifiedSensitiveActionState) {
        u.j(verifiedSensitiveActionState, "verifiedSensitiveActionState");
        return new VerifiedSensitiveActionStateWithRepo(verifiedSensitiveActionState);
    }
}
