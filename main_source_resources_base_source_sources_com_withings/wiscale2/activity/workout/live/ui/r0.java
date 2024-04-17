package com.withings.wiscale2.activity.workout.live.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveWorkoutViewModel.kt */
/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f48923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(z0 z0Var) {
        super(1);
        this.f48923a = z0Var;
    }

    @Override // ym0.l
    public final Integer invoke(Integer num) {
        kj0.c Z0;
        Z0 = this.f48923a.Z0();
        return Integer.valueOf(Z0.a(num).b());
    }
}
