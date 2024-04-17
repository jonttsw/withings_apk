package com.withings.manualLogging.ui.feature.addNote;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f41472a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f41473b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k1 k1Var, k1.r0<Boolean> r0Var) {
        super(0);
        this.f41472a = k1Var;
        this.f41473b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k1 k1Var = this.f41472a;
        k1Var.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(k1Var), Dispatchers.getIO(), null, new f1(k1Var, null), 2, null);
        this.f41473b.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
