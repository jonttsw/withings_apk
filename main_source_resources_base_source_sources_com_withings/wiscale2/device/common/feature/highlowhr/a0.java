package com.withings.wiscale2.device.common.feature.highlowhr;

import kotlin.jvm.internal.n0;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class a0 implements ym0.p<Integer, gi.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0 f52252a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(n0 n0Var) {
        this.f52252a = n0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, gi.b bVar) {
        int intValue = num.intValue();
        gi.b radioInfo = bVar;
        kotlin.jvm.internal.u.j(radioInfo, "radioInfo");
        this.f52252a.f76254a = ((HighHRThresholds) HighHRThresholds.a().get(intValue)).b();
        return nm0.y.f85009a;
    }
}
