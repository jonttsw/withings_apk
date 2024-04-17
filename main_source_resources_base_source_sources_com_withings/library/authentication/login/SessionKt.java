package com.withings.library.authentication.login;

import com.withings.library.authentication.utils.TimeKt;
import ep0.a;
import ep0.c;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.time.DurationUnit;
/* compiled from: Session.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\"\u001d\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001d\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/withings/library/authentication/login/Session;", "", "isStillValid", "(Lcom/withings/library/authentication/login/Session;)Z", "", "getMainSession", "(Ljava/util/List;)Lcom/withings/library/authentication/login/Session;", "getTrustSession", "Lep0/a;", "REFRESH_LATENCY_SECURITY", "J", "getREFRESH_LATENCY_SECURITY", "()J", "SESSION_TIME_TO_LIVE", "getSESSION_TIME_TO_LIVE", "Authentication_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SessionKt {
    private static final long REFRESH_LATENCY_SECURITY;
    private static final long SESSION_TIME_TO_LIVE;

    static {
        a.C0892a c0892a = a.f65838b;
        REFRESH_LATENCY_SECURITY = c.j(40, DurationUnit.f78024d);
        SESSION_TIME_TO_LIVE = c.j(15, DurationUnit.f78025e);
    }

    public static final Session getMainSession(List<Session> list) {
        u.j(list, "<this>");
        for (Session session : list) {
            if (session.getSessionType() == SessionType.MAIN) {
                return session;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final long getREFRESH_LATENCY_SECURITY() {
        return REFRESH_LATENCY_SECURITY;
    }

    public static final long getSESSION_TIME_TO_LIVE() {
        return SESSION_TIME_TO_LIVE;
    }

    public static final Session getTrustSession(List<Session> list) {
        Object obj;
        u.j(list, "<this>");
        List<Session> list2 = list;
        for (Session session : list2) {
            if (session.getSessionType() == SessionType.MAIN) {
                if (!session.isSecured()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((Session) obj).isSecured()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Session session2 = (Session) obj;
                    if (session2 != null) {
                        return session2;
                    }
                    return session;
                }
                return session;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean isStillValid(Session session) {
        u.j(session, "<this>");
        if (session.getExpirationTimestamp() - a.i(REFRESH_LATENCY_SECURITY) > TimeKt.getSystemTimeInMillis()) {
            return true;
        }
        return false;
    }
}
