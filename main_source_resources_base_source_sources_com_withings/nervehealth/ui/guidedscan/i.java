package com.withings.nervehealth.ui.guidedscan;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: NerveHealthGuidedScanActivity.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthGuidedScanActivity f42626a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity) {
        super(0);
        this.f42626a = nerveHealthGuidedScanActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity = this.f42626a;
        NerveHealthGuidedScanViewModel z32 = NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity);
        BuildersKt__Builders_commonKt.launch$default(h1.a(z32), Dispatchers.getIO(), null, new j0(z32, nerveHealthGuidedScanActivity, null), 2, null);
        return nm0.y.f85009a;
    }
}
