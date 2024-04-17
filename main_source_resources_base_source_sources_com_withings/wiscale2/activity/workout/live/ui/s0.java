package com.withings.wiscale2.activity.workout.live.ui;

import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel", f = "LiveWorkoutViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGCONSUMER}, m = "initWorkoutState")
/* loaded from: classes4.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    z0 f48925a;

    /* renamed from: b  reason: collision with root package name */
    z0 f48926b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f48927c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z0 f48928d;

    /* renamed from: e  reason: collision with root package name */
    int f48929e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(z0 z0Var, qm0.d<? super s0> dVar) {
        super(dVar);
        this.f48928d = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f48927c = obj;
        this.f48929e |= Integer.MIN_VALUE;
        return z0.y0(this.f48928d, this);
    }
}
