package com.withings.library.authentication.login.session.multi;

import com.withings.library.authentication.login.Session;
import com.withings.library.authentication.login.state.AuthenticationState;
import java.util.List;
import kotlin.Metadata;
import qm0.d;
/* compiled from: MultiSessionRetriever.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/login/session/multi/MultiSessionRetriever;", "", "", "Lcom/withings/library/authentication/login/Session;", "sessions", "Lcom/withings/library/authentication/login/state/AuthenticationState;", "retrieve", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MultiSessionRetriever {
    Object retrieve(List<Session> list, d<? super AuthenticationState> dVar);
}
