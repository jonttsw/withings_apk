package com.withings.device.details;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.DeviceDetailFragment", f = "DeviceDetailFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGPUBLICKEY}, m = "onDissociateFromMyAccount")
/* loaded from: classes3.dex */
public final class z extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    h f37360a;

    /* renamed from: b  reason: collision with root package name */
    h f37361b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37362c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f37363d;

    /* renamed from: e  reason: collision with root package name */
    int f37364e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(h hVar, qm0.d<? super z> dVar) {
        super(dVar);
        this.f37363d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37362c = obj;
        this.f37364e |= Integer.MIN_VALUE;
        return h.y1(this.f37363d, null, this);
    }
}
