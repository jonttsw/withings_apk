package com.withings.device.details;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeviceDetailFragment", f = "DeviceDetailFragment.kt", l = {302}, m = "dissociateOtherAccounts")
/* loaded from: classes3.dex */
public final class k extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    h f36856a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f36857b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f36858c;

    /* renamed from: d  reason: collision with root package name */
    int f36859d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, qm0.d<? super k> dVar) {
        super(dVar);
        this.f36858c = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f36857b = obj;
        this.f36859d |= Integer.MIN_VALUE;
        return h.w1(this.f36858c, null, this);
    }
}
