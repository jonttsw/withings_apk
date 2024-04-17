package com.withings.manualLogging.ui.feature.addNote;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f41504a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f41505b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41506c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k1.r0<Boolean> r0Var, k1.r0<String> r0Var2, k1 k1Var) {
        super(0);
        this.f41504a = r0Var;
        this.f41505b = r0Var2;
        this.f41506c = k1Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = AddManualLogActivity.f40697k;
        String value = this.f41505b.getValue();
        if (value != null) {
            k1 k1Var = this.f41506c;
            k1Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(k1Var), Dispatchers.getIO(), null, new l1(k1Var, value, null), 2, null);
        }
        this.f41504a.setValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
