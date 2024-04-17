package com.withings.wiscale2.device.common.feature.ecg;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
final class u4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o4 f51765a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(o4 o4Var) {
        super(0);
        this.f51765a = o4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        o4 o4Var = this.f51765a;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(o4Var), Dispatchers.getIO(), null, new t4(o4Var, null), 2, null);
        return nm0.y.f85009a;
    }
}
