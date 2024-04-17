package com.withings.ecg.details;

import com.withings.ecg.details.EcgListActivity;
/* compiled from: EcgListActivity.kt */
/* loaded from: classes3.dex */
final class q1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgListActivity f38295a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(EcgListActivity ecgListActivity) {
        super(0);
        this.f38295a = ecgListActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        x70.b.n(new IllegalStateException("EcgListActivity : UserId is null"));
        EcgListActivity.a aVar = EcgListActivity.f38008n;
        this.f38295a.finish();
        return nm0.y.f85009a;
    }
}
