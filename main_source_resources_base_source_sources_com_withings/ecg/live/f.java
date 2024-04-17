package com.withings.ecg.live;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.live.EcgViewModel", f = "LiveEcgActivity.kt", l = {ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED}, m = "countLostPackets")
/* loaded from: classes3.dex */
public final class f extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    c f38662a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f38663b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f38664c;

    /* renamed from: d  reason: collision with root package name */
    int f38665d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, qm0.d<? super f> dVar) {
        super(dVar);
        this.f38664c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38663b = obj;
        this.f38665d |= Integer.MIN_VALUE;
        return c.j0(this.f38664c, this);
    }
}
