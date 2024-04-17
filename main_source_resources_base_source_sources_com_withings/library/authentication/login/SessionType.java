package com.withings.library.authentication.login;

import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Session.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/login/SessionType;", "", "(Ljava/lang/String;I)V", "MAIN", "WITHINGS", "PARTNER", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SessionType[] $VALUES;
    public static final SessionType MAIN = new SessionType("MAIN", 0);
    public static final SessionType WITHINGS = new SessionType("WITHINGS", 1);
    public static final SessionType PARTNER = new SessionType("PARTNER", 2);

    private static final /* synthetic */ SessionType[] $values() {
        return new SessionType[]{MAIN, WITHINGS, PARTNER};
    }

    static {
        SessionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SessionType(String str, int i11) {
    }

    public static a<SessionType> getEntries() {
        return $ENTRIES;
    }

    public static SessionType valueOf(String str) {
        return (SessionType) Enum.valueOf(SessionType.class, str);
    }

    public static SessionType[] values() {
        return (SessionType[]) $VALUES.clone();
    }
}
