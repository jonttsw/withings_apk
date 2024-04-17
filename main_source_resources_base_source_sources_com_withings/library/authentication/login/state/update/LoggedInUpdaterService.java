package com.withings.library.authentication.login.state.update;

import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smack.packet.Session;
import qm0.d;
/* compiled from: LoggedInUpdaterService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/state/update/LoggedInUpdaterService;", "", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "Lnm0/y;", "updateLoggedInWithSession", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface LoggedInUpdaterService {
    Object updateLoggedInWithSession(com.withings.library.authentication.login.Session session, d<? super y> dVar);
}
