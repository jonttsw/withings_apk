package com.withings.wiscale2.settings;

import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.wiscale2.C1987R;
/* compiled from: PrivacyAndLegals.kt */
/* loaded from: classes5.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f60010a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Boolean f60011b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f60012c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(boolean z5, Boolean bool, ym0.l<? super Boolean, nm0.y> lVar) {
        super(3);
        this.f60010a = z5;
        this.f60011b = bool;
        this.f60012c = lVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h Card = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(Card, "$this$Card");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.l(androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B()), kotlin.jvm.internal.u.e(this.f60011b, Boolean.TRUE), this.f60012c, null, ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_ToggleTitle, aVar2), ay.b.u(C1987R.string._Settings_PrivacyLegal_Advertising_ToggleDescription, aVar2), false, false, !this.f60010a, CellVerticalMargin.f33312d, aVar2, 805306368, 200);
        }
        return nm0.y.f85009a;
    }
}
