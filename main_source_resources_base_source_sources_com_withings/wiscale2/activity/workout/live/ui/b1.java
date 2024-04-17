package com.withings.wiscale2.activity.workout.live.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutViewModel", f = "LiveWorkoutViewModel.kt", l = {229}, m = "sendPauseCommand")
/* loaded from: classes4.dex */
public final class b1 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    z0 f48855a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f48856b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z0 f48857c;

    /* renamed from: d  reason: collision with root package name */
    int f48858d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(z0 z0Var, qm0.d<? super b1> dVar) {
        super(dVar);
        this.f48857c = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f48856b = obj;
        this.f48858d |= Integer.MIN_VALUE;
        return z0.M0(this.f48857c, this);
    }
}
