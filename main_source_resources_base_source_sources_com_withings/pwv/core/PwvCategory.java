package com.withings.pwv.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PwvCategory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/pwv/core/PwvCategory;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PwvCategory {

    /* renamed from: a  reason: collision with root package name */
    public static final PwvCategory f43840a;

    /* renamed from: b  reason: collision with root package name */
    public static final PwvCategory f43841b;

    /* renamed from: c  reason: collision with root package name */
    public static final PwvCategory f43842c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ PwvCategory[] f43843d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.pwv.core.PwvCategory, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.pwv.core.PwvCategory, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.pwv.core.PwvCategory, java.lang.Enum] */
    static {
        ?? r02 = new Enum("BAD", 0);
        f43840a = r02;
        ?? r12 = new Enum("NORMAL", 1);
        f43841b = r12;
        ?? r22 = new Enum("OPTIMAL", 2);
        f43842c = r22;
        PwvCategory[] pwvCategoryArr = {r02, r12, r22};
        f43843d = pwvCategoryArr;
        b.a(pwvCategoryArr);
    }

    private PwvCategory() {
        throw null;
    }

    public static PwvCategory valueOf(String str) {
        return (PwvCategory) Enum.valueOf(PwvCategory.class, str);
    }

    public static PwvCategory[] values() {
        return (PwvCategory[]) f43843d.clone();
    }
}
