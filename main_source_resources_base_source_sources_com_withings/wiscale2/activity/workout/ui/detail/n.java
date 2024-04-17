package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49459a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.l f49460b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.google.android.material.bottomsheet.l lVar, AllWorkoutsActivity allWorkoutsActivity) {
        super(2);
        this.f49459a = allWorkoutsActivity;
        this.f49460b = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, -1432222848, new m(this.f49460b, this.f49459a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
