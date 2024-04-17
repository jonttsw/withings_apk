package com.withings.tutorials.android.modes.pregnancy.survey;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DueDateMethod.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/android/modes/pregnancy/survey/DueDateMethod;", "", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DueDateMethod {

    /* renamed from: a  reason: collision with root package name */
    public static final DueDateMethod f44546a;

    /* renamed from: b  reason: collision with root package name */
    public static final DueDateMethod f44547b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ DueDateMethod[] f44548c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod] */
    static {
        ?? r02 = new Enum("LastPeriod", 0);
        f44546a = r02;
        ?? r12 = new Enum("ConceptionDate", 1);
        f44547b = r12;
        DueDateMethod[] dueDateMethodArr = {r02, r12};
        f44548c = dueDateMethodArr;
        b.a(dueDateMethodArr);
    }

    private DueDateMethod() {
        throw null;
    }

    public static DueDateMethod valueOf(String str) {
        return (DueDateMethod) Enum.valueOf(DueDateMethod.class, str);
    }

    public static DueDateMethod[] values() {
        return (DueDateMethod[]) f44548c.clone();
    }
}
