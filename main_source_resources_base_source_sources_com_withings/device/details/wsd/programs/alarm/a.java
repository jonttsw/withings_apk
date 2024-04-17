package com.withings.device.details.wsd.programs.alarm;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdMultipleAlarmActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.wsd.programs.alarm.WsdMultipleAlarmActivity", f = "WsdMultipleAlarmActivity.kt", l = {ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY}, m = "getAlarms")
/* loaded from: classes3.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f37154a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WsdMultipleAlarmActivity f37155b;

    /* renamed from: c  reason: collision with root package name */
    int f37156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WsdMultipleAlarmActivity wsdMultipleAlarmActivity, qm0.d<? super a> dVar) {
        super(dVar);
        this.f37155b = wsdMultipleAlarmActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37154a = obj;
        this.f37156c |= Integer.MIN_VALUE;
        return WsdMultipleAlarmActivity.Y3(this.f37155b, this);
    }
}
