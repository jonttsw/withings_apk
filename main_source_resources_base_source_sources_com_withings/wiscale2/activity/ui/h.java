package com.withings.wiscale2.activity.ui;

import androidx.compose.foundation.layout.x0;
import com.withings.wiscale2.activity.ui.n;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
final class h extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48638a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(VasistasInfoActivity vasistasInfoActivity) {
        super(3);
        this.f48638a = vasistasInfoActivity;
    }

    @Override // ym0.q
    public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.w paddingValues = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(paddingValues, "paddingValues");
        if ((intValue & 14) == 0) {
            if (aVar2.K(paddingValues)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            n.a aVar3 = (n.a) t1.d.a(VasistasInfoActivity.e4(this.f48638a).k0(), aVar2).getValue();
            if (aVar3 != null) {
                VasistasInfoActivity.Q3(this.f48638a, ah.k.p(x0.e(androidx.compose.ui.e.f8927a, paddingValues)), aVar3.a(), aVar3.b(), aVar2, 4672);
            }
        }
        return y.f85009a;
    }
}
