package com.withings.device.details;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeviceDetailFragment", f = "DeviceDetailFragment.kt", l = {ConstantsWs.WS_STATUS_NOPWDUPDATECODE}, m = "onDissociateSingleUser")
/* loaded from: classes3.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    h f36656a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f36657b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f36658c;

    /* renamed from: d  reason: collision with root package name */
    int f36659d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h hVar, qm0.d<? super a0> dVar) {
        super(dVar);
        this.f36658c = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36657b = obj;
        this.f36659d |= Integer.MIN_VALUE;
        return h.z1(this.f36658c, this);
    }
}
