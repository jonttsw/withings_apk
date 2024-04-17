package com.withings.wiscale2.activity.workout.live.ui;
/* compiled from: LiveWorkoutDistanceFragment.kt */
/* loaded from: classes4.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<Double, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f48946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var) {
        super(1);
        this.f48946a = d0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Double d11) {
        Double d12 = d11;
        if (d12 != null) {
            d0.v1(this.f48946a, d12.doubleValue());
        }
        return nm0.y.f85009a;
    }
}
