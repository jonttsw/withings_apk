package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class n1 extends x5 {

    /* renamed from: b  reason: collision with root package name */
    private final String f49469b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49470c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49471d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49472e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f49473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(int i11, int i12, int i13, String title, String description, boolean z5) {
        super(i11);
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(description, "description");
        this.f49469b = title;
        this.f49470c = description;
        this.f49471d = i12;
        this.f49472e = i13;
        this.f49473f = z5;
    }

    public final String b() {
        return this.f49470c;
    }

    public final int c() {
        return this.f49472e;
    }

    public final int d() {
        return this.f49471d;
    }

    public final String e() {
        return this.f49469b;
    }

    public final boolean f() {
        return this.f49473f;
    }
}
