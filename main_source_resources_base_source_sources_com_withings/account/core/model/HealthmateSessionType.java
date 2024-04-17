package com.withings.account.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthmateSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/core/model/HealthmateSessionType;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HealthmateSessionType {

    /* renamed from: a  reason: collision with root package name */
    public static final HealthmateSessionType f30958a;

    /* renamed from: b  reason: collision with root package name */
    public static final HealthmateSessionType f30959b;

    /* renamed from: c  reason: collision with root package name */
    public static final HealthmateSessionType f30960c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ HealthmateSessionType[] f30961d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.account.core.model.HealthmateSessionType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.account.core.model.HealthmateSessionType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.account.core.model.HealthmateSessionType] */
    static {
        ?? r02 = new Enum("MAIN", 0);
        f30958a = r02;
        ?? r12 = new Enum("WITHINGS", 1);
        f30959b = r12;
        ?? r22 = new Enum("PARTNER", 2);
        f30960c = r22;
        HealthmateSessionType[] healthmateSessionTypeArr = {r02, r12, r22};
        f30961d = healthmateSessionTypeArr;
        b.a(healthmateSessionTypeArr);
    }

    private HealthmateSessionType() {
        throw null;
    }

    public static HealthmateSessionType valueOf(String str) {
        return (HealthmateSessionType) Enum.valueOf(HealthmateSessionType.class, str);
    }

    public static HealthmateSessionType[] values() {
        return (HealthmateSessionType[]) f30961d.clone();
    }
}
