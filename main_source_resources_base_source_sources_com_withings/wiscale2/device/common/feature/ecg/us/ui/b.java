package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity f52001a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EcgReviewActivity ecgReviewActivity) {
        super(0);
        this.f52001a = ecgReviewActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f52001a.finish();
        return y.f85009a;
    }
}
