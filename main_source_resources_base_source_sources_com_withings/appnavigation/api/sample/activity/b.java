package com.withings.appnavigation.api.sample.activity;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: SampleNavigationActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SampleNavigationActivity f31289a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SampleNavigationActivity sampleNavigationActivity) {
        super(2);
        this.f31289a = sampleNavigationActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            SampleNavigationActivity sampleNavigationActivity = this.f31289a;
            SampleNavigationActivity.z3(sampleNavigationActivity, SampleNavigationActivity.A3(sampleNavigationActivity), aVar2, 64);
        }
        return y.f85009a;
    }
}
