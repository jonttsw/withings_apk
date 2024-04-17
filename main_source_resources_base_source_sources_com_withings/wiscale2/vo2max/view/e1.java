package com.withings.wiscale2.vo2max.view;

import android.os.Bundle;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2maxActivity.kt */
/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.w implements ym0.p<Integer, Bundle, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxActivity f62736a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Vo2maxActivity vo2maxActivity) {
        super(2);
        this.f62736a = vo2maxActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, Bundle bundle) {
        c2 c2Var;
        num.intValue();
        c2Var = this.f62736a.f62656i;
        if (c2Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(c2Var), null, null, new d2(c2Var, null), 3, null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
