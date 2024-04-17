package com.withings.wiscale2.activity.workout.ui.detail;

import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: WorkoutHeartRateZonesView.kt */
/* loaded from: classes4.dex */
public final class d5 {

    /* renamed from: a  reason: collision with root package name */
    private final ComposeView f49162a;

    /* compiled from: WorkoutHeartRateZonesView.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<com.withings.common.compose.component.u1> f49163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<com.withings.common.compose.component.u1> list) {
            super(2);
            this.f49163a = list;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 689363467, new c5(this.f49163a)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    public d5(LinearLayout linearLayout) {
        this.f49162a = (ComposeView) linearLayout.findViewById(C1987R.id.heart_rate_zones);
    }

    public final void a(List<com.withings.common.compose.component.u1> zones) {
        kotlin.jvm.internal.u.j(zones, "zones");
        if (!zones.isEmpty()) {
            this.f49162a.setContent(new s1.a(true, 818785777, new a(zones)));
        }
    }
}
