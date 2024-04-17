package com.withings.wiscale2.activity.workout.live.ui;
/* compiled from: LiveWorkoutDistanceFragment.kt */
/* loaded from: classes4.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<Double, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f48849a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var) {
        super(1);
        this.f48849a = d0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Double d11) {
        Double d12 = d11;
        if (d12 != null) {
            d0.y1(this.f48849a, d12.doubleValue());
        }
        return nm0.y.f85009a;
    }
}
