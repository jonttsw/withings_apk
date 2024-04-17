package com.withings.common.compose.component;

import com.withings.wiscale2.C1987R;
/* compiled from: SecondaryTrendCard.kt */
/* loaded from: classes3.dex */
final class v3 extends kotlin.jvm.internal.w implements ym0.q<p4, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f34833a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f34834b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(String str, boolean z5) {
        super(3);
        this.f34833a = str;
        this.f34834b = z5;
    }

    @Override // ym0.q
    public final nm0.y invoke(p4 p4Var, androidx.compose.runtime.a aVar, Integer num) {
        p4 add = p4Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(add, "$this$add");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            n4.c(ay.b.u(C1987R.string.dataviz_filter_trendTitle, aVar2), null, this.f34833a, this.f34834b, null, aVar2, 0, 18);
        }
        return nm0.y.f85009a;
    }
}
