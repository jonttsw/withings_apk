package com.withings.account.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthmateSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/core/model/HealthmateProviderType;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HealthmateProviderType {

    /* renamed from: a  reason: collision with root package name */
    public static final HealthmateProviderType f30954a;

    /* renamed from: b  reason: collision with root package name */
    public static final HealthmateProviderType f30955b;

    /* renamed from: c  reason: collision with root package name */
    public static final HealthmateProviderType f30956c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ HealthmateProviderType[] f30957d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.account.core.model.HealthmateProviderType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.account.core.model.HealthmateProviderType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.account.core.model.HealthmateProviderType] */
    static {
        ?? r02 = new Enum("WITHINGS", 0);
        f30954a = r02;
        ?? r12 = new Enum("APPLE", 1);
        f30955b = r12;
        ?? r22 = new Enum("GOOGLE", 2);
        f30956c = r22;
        HealthmateProviderType[] healthmateProviderTypeArr = {r02, r12, r22};
        f30957d = healthmateProviderTypeArr;
        b.a(healthmateProviderTypeArr);
    }

    private HealthmateProviderType() {
        throw null;
    }

    public static HealthmateProviderType valueOf(String str) {
        return (HealthmateProviderType) Enum.valueOf(HealthmateProviderType.class, str);
    }

    public static HealthmateProviderType[] values() {
        return (HealthmateProviderType[]) f30957d.clone();
    }
}
