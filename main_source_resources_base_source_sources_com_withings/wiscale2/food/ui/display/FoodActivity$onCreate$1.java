package com.withings.wiscale2.food.ui.display;

import com.withings.periodsbar.Period;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: FoodActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/periodsbar/Period;", "it", "Lnm0/y;", "invoke", "(Lcom/withings/periodsbar/Period;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FoodActivity$onCreate$1 extends w implements l<Period, y> {
    final /* synthetic */ FoodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodActivity$onCreate$1(FoodActivity foodActivity) {
        super(1);
        this.this$0 = foodActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Period period) {
        invoke2(period);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Period it) {
        r0 period;
        u.j(it, "it");
        period = this.this$0.getPeriod();
        period.setValue(it);
        this.this$0.onPeriodChanged();
    }
}
