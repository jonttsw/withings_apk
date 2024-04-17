package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import s0.i0;
/* compiled from: EcgReviewActivity.kt */
/* loaded from: classes5.dex */
final class m extends w implements ym0.l<i0, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ rq.e f52036a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rq.e eVar) {
        super(1);
        this.f52036a = eVar;
    }

    @Override // ym0.l
    public final y invoke(i0 i0Var) {
        i0 LazyColumn = i0Var;
        u.j(LazyColumn, "$this$LazyColumn");
        rq.e eVar = this.f52036a;
        i0.g(LazyColumn, null, new s1.a(true, 1045056300, new j(eVar)), 3);
        i0.g(LazyColumn, null, new s1.a(true, 1837643285, new l(eVar)), 3);
        return y.f85009a;
    }
}
