package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.l<i6.a, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgReviewActivity f52000a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EcgReviewActivity ecgReviewActivity) {
        super(1);
        this.f52000a = ecgReviewActivity;
    }

    @Override // ym0.l
    public final p invoke(i6.a aVar) {
        i6.a viewModel = aVar;
        u.j(viewModel, "$this$viewModel");
        EcgReviewActivity ecgReviewActivity = this.f52000a;
        q qVar = ecgReviewActivity.f51986e;
        if (qVar != null) {
            return qVar.a(EcgReviewActivity.A3(ecgReviewActivity), EcgReviewActivity.z3(ecgReviewActivity));
        }
        u.s("viewModelFactory");
        throw null;
    }
}
