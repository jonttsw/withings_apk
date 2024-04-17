package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02CartridgeActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel", f = "Wpa02CartridgeActivationViewModel.kt", l = {113}, m = "getConsumableByMac")
/* loaded from: classes5.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f55163a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b0 f55164b;

    /* renamed from: c  reason: collision with root package name */
    int f55165c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, qm0.d<? super c0> dVar) {
        super(dVar);
        this.f55164b = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f55163a = obj;
        this.f55165c |= Integer.MIN_VALUE;
        return b0.j0(null, this.f55164b, this);
    }
}
