package com.withings.wiscale2.weight.list;

import android.content.Context;
import androidx.compose.ui.platform.u0;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.l2;
import com.withings.features.FeatureFlag;
import com.withings.wiscale2.C1987R;
import e.n;
import java.util.LinkedHashMap;
import java.util.List;
import k1.r0;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: WeightListActivity.kt */
/* loaded from: classes5.dex */
final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightListActivity f62924a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WeightListActivity weightListActivity) {
        super(2);
        this.f62924a = weightListActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        g gVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            g.a aVar3 = new g.a();
            WeightListActivity weightListActivity = this.f62924a;
            n a11 = e.d.a(aVar3, new f(weightListActivity), aVar2, 8);
            r0 b10 = t1.d.b(WeightListActivity.A3(weightListActivity).g0(), i0.f76187a, aVar2);
            jm.a z32 = WeightListActivity.z3(weightListActivity);
            List list = (List) b10.getValue();
            u.i(list, "invoke$lambda$0(...)");
            LinkedHashMap a12 = qj0.b.a((Context) aVar2.D(u0.d()), z32, list);
            if (wr.b.c(FeatureFlag.A)) {
                gVar = new g(weightListActivity);
            } else {
                gVar = null;
            }
            hk.b.b(false, ay.b.u(C1987R.string._NB_TOTAL_WEIGHT_, aVar2), x.V(new a3.a(new l2.a(f1.a.a()), new c(weightListActivity))), WeightListActivity.D3(weightListActivity, a12, (Context) aVar2.D(u0.d())), new d(a11, weightListActivity), new e(weightListActivity), gVar, aVar2, 4096, 1);
        }
        return y.f85009a;
    }
}
