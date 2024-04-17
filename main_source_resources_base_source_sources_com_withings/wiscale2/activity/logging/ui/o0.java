package com.withings.wiscale2.activity.logging.ui;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.track.data.Track;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel", f = "EditWorkoutViewModel.kt", l = {ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED}, m = "computeWorkout")
/* loaded from: classes4.dex */
public final class o0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Track f48425a;

    /* renamed from: b  reason: collision with root package name */
    Track f48426b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f48427c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m0 f48428d;

    /* renamed from: e  reason: collision with root package name */
    int f48429e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m0 m0Var, qm0.d<? super o0> dVar) {
        super(dVar);
        this.f48428d = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f48427c = obj;
        this.f48429e |= Integer.MIN_VALUE;
        return m0.f0(this.f48428d, this);
    }
}
