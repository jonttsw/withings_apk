package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class l5 implements ym0.p<Integer, gi.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgSettingsActivity f51495a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l5(EcgSettingsActivity ecgSettingsActivity) {
        this.f51495a = ecgSettingsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, gi.b bVar) {
        int intValue = num.intValue();
        gi.b info = bVar;
        kotlin.jvm.internal.u.j(info, "info");
        EcgSettingsActivity.z3(this.f51495a, intValue);
        return nm0.y.f85009a;
    }
}
