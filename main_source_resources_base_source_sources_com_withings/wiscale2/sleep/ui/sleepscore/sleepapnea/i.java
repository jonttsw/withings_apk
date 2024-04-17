package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;
/* compiled from: SleepDisorderActivity.kt */
/* loaded from: classes5.dex */
final class i extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepDisorderActivity f61344a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SleepDisorderActivity sleepDisorderActivity) {
        super(1);
        this.f61344a = sleepDisorderActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        Integer num2 = num;
        if (num2 != null) {
            SleepDisorderActivity.H3(this.f61344a, num2.intValue());
        }
        return nm0.y.f85009a;
    }
}
