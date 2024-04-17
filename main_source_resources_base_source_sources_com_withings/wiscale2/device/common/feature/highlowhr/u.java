package com.withings.wiscale2.device.common.feature.highlowhr;

import java.util.List;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<List<? extends nm0.j<? extends gi.b, ? extends ym0.a<? extends nm0.y>>>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity f52312a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        super(1);
        this.f52312a = highLowHRSettingsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends nm0.j<? extends gi.b, ? extends ym0.a<? extends nm0.y>>> list) {
        a L3;
        List<? extends nm0.j<? extends gi.b, ? extends ym0.a<? extends nm0.y>>> list2 = list;
        kotlin.jvm.internal.u.g(list2);
        HighLowHRSettingsActivity highLowHRSettingsActivity = this.f52312a;
        HighLowHRSettingsActivity.I3(highLowHRSettingsActivity, list2);
        L3 = highLowHRSettingsActivity.L3();
        L3.K0().removeObservers(highLowHRSettingsActivity);
        return nm0.y.f85009a;
    }
}
