package com.withings.device.details.wsm;

import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class f extends w implements q<r0.c, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37319a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(3);
        this.f37319a = iVar;
    }

    @Override // ym0.q
    public final y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.c LabelValueCell = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(LabelValueCell, "$this$LabelValueCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.e(ay.b.u(C1987R.string._SL_SERIAL_, aVar2), this.f37319a.A1().getMacAddress().toString(), aVar2, 0, 0);
        }
        return y.f85009a;
    }
}
