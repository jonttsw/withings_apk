package com.withings.wiscale2.food.ui.display;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import com.withings.periodsbar.Period;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: FoodActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk1/r0;", "Lcom/withings/periodsbar/Period;", "invoke", "()Lk1/r0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class FoodActivity$period$2 extends w implements ym0.a<r0<Period>> {
    final /* synthetic */ FoodActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodActivity$period$2(FoodActivity foodActivity) {
        super(0);
        this.this$0 = foodActivity;
    }

    @Override // ym0.a
    public final r0<Period> invoke() {
        Period defaultPeriod;
        ParcelableSnapshotMutableState f11;
        defaultPeriod = this.this$0.getDefaultPeriod();
        f11 = l0.f(defaultPeriod, v0.f8878a);
        return f11;
    }
}
