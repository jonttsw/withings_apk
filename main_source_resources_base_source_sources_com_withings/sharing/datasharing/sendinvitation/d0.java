package com.withings.sharing.datasharing.sendinvitation;

import androidx.compose.foundation.layout.x0;
import x1.b;
import x1.d;
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f44156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ym0.a<nm0.y> aVar, boolean z5) {
        super(3);
        this.f44155a = aVar;
        this.f44156b = z5;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        ym0.a<nm0.y> aVar2;
        r0.h Card = hVar;
        androidx.compose.runtime.a aVar3 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(Card, "$this$Card");
        if ((intValue & 81) == 16 && aVar3.h()) {
            aVar3.C();
        } else {
            androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
            d.b i11 = b.a.i();
            if (this.f44156b) {
                aVar2 = this.f44155a;
            } else {
                aVar2 = null;
            }
            com.withings.common.compose.component.o.g(h11, z40.c.f109977a, null, "** Send by Email", null, false, false, true, i11, null, aVar2, aVar3, 113249328, 0, 628);
        }
        return nm0.y.f85009a;
    }
}
