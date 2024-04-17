package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class q6 implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ym0.l f49569a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6(ym0.l lVar) {
        this.f49569a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
            return false;
        }
        return kotlin.jvm.internal.u.e(this.f49569a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f49569a;
    }

    public final int hashCode() {
        return this.f49569a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f49569a.invoke(obj);
    }
}
