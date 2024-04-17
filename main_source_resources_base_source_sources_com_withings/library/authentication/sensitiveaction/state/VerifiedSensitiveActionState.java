package com.withings.library.authentication.sensitiveaction.state;

import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: VerifiedSensitiveActionState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/VerifiedSensitiveActionState;", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "Lnm0/y;", "finishSensitiveActionVerification", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/login/Session;", "getSession", "()Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface VerifiedSensitiveActionState extends SensitiveActionState {
    Object finishSensitiveActionVerification(d<? super y> dVar);

    com.withings.library.authentication.login.Session getSession();
}
