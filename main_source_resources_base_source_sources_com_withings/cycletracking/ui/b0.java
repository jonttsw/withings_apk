package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35506a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(CycleTrackingActivity cycleTrackingActivity) {
        super(1);
        this.f35506a = cycleTrackingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        int intValue = num.intValue();
        CycleTrackingActivity cycleTrackingActivity = this.f35506a;
        String string = cycleTrackingActivity.getString(intValue);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        cycleTrackingActivity.H3(string, "", true);
        return nm0.y.f85009a;
    }
}
