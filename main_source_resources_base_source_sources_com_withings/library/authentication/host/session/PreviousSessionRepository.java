package com.withings.library.authentication.host.session;

import com.withings.library.authentication.login.Session;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PreviousSessionRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/host/session/PreviousSessionRepository;", "", "", "Lcom/withings/library/authentication/login/Session;", "getPreviousSession", "()Ljava/util/List;", "sessions", "Lnm0/y;", "saveSessions", "(Ljava/util/List;)V", "clearSession", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PreviousSessionRepository {
    void clearSession();

    List<Session> getPreviousSession();

    void saveSessions(List<Session> list);
}
