package com.withings.wiscale2.activity.workout.ui.detail;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.l f49193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49194b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.google.android.material.bottomsheet.l lVar, AllWorkoutsActivity allWorkoutsActivity) {
        super(0);
        this.f49193a = lVar;
        this.f49194b = allWorkoutsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        o7 o7Var;
        this.f49193a.dismiss();
        o7Var = this.f49194b.f49023o;
        if (o7Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(o7Var), null, null, new r7(o7Var, -1L, null), 3, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
