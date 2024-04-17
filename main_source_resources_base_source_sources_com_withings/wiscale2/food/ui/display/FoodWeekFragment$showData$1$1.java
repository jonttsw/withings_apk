package com.withings.wiscale2.food.ui.display;

import androidx.camera.camera2.internal.p2;
import com.withings.common.compose.component.k3;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.model.FoodWeekData;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FoodWeekFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodWeekFragment$showData$1$1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ FoodWeekData $foodWeekData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodWeekFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.wiscale2.food.ui.display.FoodWeekFragment$showData$1$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
        final /* synthetic */ FoodWeekData $foodWeekData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FoodWeekData foodWeekData) {
            super(2);
            this.$foodWeekData = foodWeekData;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            String valueOf = String.valueOf(this.$foodWeekData.getTimesOverBudget());
            float timesOverBudget = this.$foodWeekData.getTimesOverBudget() / this.$foodWeekData.getNumberOfDayWithData();
            aVar.J();
            k3.a(null, ((yk.w) p2.b(aVar, 615317871)).g().d(), timesOverBudget, valueOf, ay.b.u(C1987R.string._STAR_, aVar), false, false, aVar, 0, 97);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodWeekFragment$showData$1$1(FoodWeekData foodWeekData) {
        super(2);
        this.$foodWeekData = foodWeekData;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            o.b(false, s1.b.b(aVar, -964190450, new AnonymousClass1(this.$foodWeekData)), aVar, 48, 1);
        }
    }
}
