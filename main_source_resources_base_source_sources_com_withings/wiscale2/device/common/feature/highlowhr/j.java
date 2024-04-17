package com.withings.wiscale2.device.common.feature.highlowhr;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HighLowHRSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.highlowhr.HREventsNotificationSettingsViewModel", f = "HighLowHRSettingsActivity.kt", l = {359, 360}, m = "updateLastHrThresholdsActivation")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    a f52293a;

    /* renamed from: b  reason: collision with root package name */
    boolean f52294b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f52295c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f52296d;

    /* renamed from: e  reason: collision with root package name */
    int f52297e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, qm0.d<? super j> dVar) {
        super(dVar);
        this.f52296d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f52295c = obj;
        this.f52297e |= Integer.MIN_VALUE;
        return a.t0(this.f52296d, false, this);
    }
}
