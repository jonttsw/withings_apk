package com.withings.library.authentication.utils.sessions;

import com.withings.library.authentication.login.Session;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import pm0.a;
/* compiled from: SessionFilter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/utils/sessions/SessionFilter;", "", "()V", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionFilter {
    public static final Companion Companion = new Companion(null);

    /* compiled from: SessionFilter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/utils/sessions/SessionFilter$Companion;", "", "()V", "filter", "", "Lcom/withings/library/authentication/login/Session;", "oldSessions", "", "newSessions", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final List<Session> filter(List<Session> oldSessions, List<Session> newSessions) {
            Object obj;
            u.j(oldSessions, "oldSessions");
            u.j(newSessions, "newSessions");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(oldSessions);
            for (Session session : newSessions) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (u.e(((Session) obj).getAuthToken(), session.getAuthToken())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Session session2 = (Session) obj;
                if (session2 == null) {
                    arrayList.add(session);
                } else if (session2.getExpirationTimestamp() > session.getExpirationTimestamp()) {
                    arrayList.remove(session2);
                    arrayList.add(session);
                }
            }
            if (arrayList.size() > 1) {
                x.B0(arrayList, new Comparator() { // from class: com.withings.library.authentication.utils.sessions.SessionFilter$Companion$filter$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        return a.b(((Session) t11).getSessionType(), ((Session) t12).getSessionType());
                    }
                });
            }
            return arrayList;
        }

        private Companion() {
        }
    }
}
