package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.p<Integer, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35515a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(CycleTrackingActivity cycleTrackingActivity) {
        super(2);
        this.f35515a = cycleTrackingActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, String str) {
        int intValue = num.intValue();
        String description = str;
        kotlin.jvm.internal.u.j(description, "description");
        CycleTrackingActivity cycleTrackingActivity = this.f35515a;
        String string = cycleTrackingActivity.getString(intValue);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        cycleTrackingActivity.H3(string, description, true);
        return nm0.y.f85009a;
    }
}
