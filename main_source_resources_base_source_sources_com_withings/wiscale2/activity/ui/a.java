package com.withings.wiscale2.activity.ui;

import androidx.activity.a0;
import androidx.compose.foundation.layout.x0;
import com.withings.core.data.aggregate.ActivityAggregate;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
final class a extends w implements q<s0.b, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActivityAggregate f48616a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48617b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ActivityAggregate activityAggregate, VasistasInfoActivity vasistasInfoActivity) {
        super(3);
        this.f48616a = activityAggregate;
        this.f48617b = vasistasInfoActivity;
    }

    @Override // ym0.q
    public final y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            VasistasInfoActivity vasistasInfoActivity = this.f48617b;
            ActivityAggregate activityAggregate = this.f48616a;
            if (activityAggregate != null) {
                aVar2.s(-1115510029);
                vasistasInfoActivity.A3(activityAggregate, aVar2, 72);
                aVar2.J();
            } else {
                aVar2.s(-1115509959);
                nk.j.e(0, 0, 28, 0L, aVar2, x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B()), null, a0.b("No aggregate data for day ", VasistasInfoActivity.a4(vasistasInfoActivity).toString("dd-MM-yy")));
                aVar2.J();
            }
        }
        return y.f85009a;
    }
}
