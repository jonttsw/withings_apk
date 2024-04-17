package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02CartridgeActivationViewModel.kt */
/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f55176a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b0 b0Var) {
        super(0);
        this.f55176a = b0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        b0 b0Var = this.f55176a;
        BuildersKt__Builders_commonKt.launch$default(h1.a(b0Var), Dispatchers.getIO(), null, new e0(b0Var, null), 2, null);
        return nm0.y.f85009a;
    }
}
