package com.withings.comm.remote.manager;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionState {

    /* renamed from: a  reason: collision with root package name */
    public static final ConnectionState f33154a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConnectionState f33155b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConnectionState f33156c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ ConnectionState[] f33157d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.comm.remote.manager.ConnectionState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.comm.remote.manager.ConnectionState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.comm.remote.manager.ConnectionState] */
    static {
        ?? r02 = new Enum("NO_CONNECTION", 0);
        f33154a = r02;
        ?? r12 = new Enum("CONNECTING", 1);
        f33155b = r12;
        ?? r22 = new Enum("CONNECTED", 2);
        f33156c = r22;
        f33157d = new ConnectionState[]{r02, r12, r22};
    }

    private ConnectionState() {
        throw null;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) f33157d.clone();
    }
}
