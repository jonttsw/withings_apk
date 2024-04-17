package com.withings.library.authentication.sensitiveaction.impl;

import com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: VerifiedSensitiveActionStateImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/impl/VerifiedSensitiveActionStateImpl;", "Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lnm0/y;", "finishSensitiveActionVerification", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", "<init>", "(Lcom/withings/library/authentication/login/Session;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VerifiedSensitiveActionStateImpl implements VerifiedSensitiveActionState {
    private final com.withings.library.authentication.login.Session session;

    public VerifiedSensitiveActionStateImpl(com.withings.library.authentication.login.Session session) {
        u.j(session, "session");
        this.session = session;
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState
    public Object finishSensitiveActionVerification(d<? super y> dVar) {
        return y.f85009a;
    }

    @Override // com.withings.library.authentication.sensitiveaction.state.VerifiedSensitiveActionState
    public com.withings.library.authentication.login.Session getSession() {
        return this.session;
    }
}
