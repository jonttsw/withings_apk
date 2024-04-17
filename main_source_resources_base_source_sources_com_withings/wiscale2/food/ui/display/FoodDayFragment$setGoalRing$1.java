package com.withings.wiscale2.food.ui.display;

import androidx.camera.camera2.internal.c3;
import com.withings.common.compose.component.k3;
import com.withings.wiscale2.food.model.FoodDayData;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FoodDayFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodDayFragment$setGoalRing$1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ FoodDayData $foodDayData;
    final /* synthetic */ boolean $isUnderBudget;
    final /* synthetic */ int $remainingCaloriesValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodDayFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.wiscale2.food.ui.display.FoodDayFragment$setGoalRing$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
        final /* synthetic */ FoodDayData $foodDayData;
        final /* synthetic */ boolean $isUnderBudget;
        final /* synthetic */ int $remainingCaloriesValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z5, FoodDayData foodDayData, int i11) {
            super(2);
            this.$isUnderBudget = z5;
            this.$foodDayData = foodDayData;
            this.$remainingCaloriesValue = i11;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(androidx.compose.runtime.a aVar, int i11) {
            long d11;
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            float eatenCalories = (this.$isUnderBudget ? this.$foodDayData.getEatenCalories() : Math.abs(this.$remainingCaloriesValue)) / this.$foodDayData.getTotalBudget();
            if (!this.$isUnderBudget) {
                aVar.J();
                d11 = ((yk.w) c3.b(aVar, -1139790016, 615317871)).g().b();
            } else {
                aVar.J();
                d11 = ((yk.w) c3.b(aVar, -1139789979, 615317871)).g().d();
            }
            aVar.J();
            k3.a(null, d11, eatenCalories, null, null, false, false, aVar, 0, 121);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodDayFragment$setGoalRing$1(boolean z5, FoodDayData foodDayData, int i11) {
        super(2);
        this.$isUnderBudget = z5;
        this.$foodDayData = foodDayData;
        this.$remainingCaloriesValue = i11;
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
            o.b(false, s1.b.b(aVar, -1981386784, new AnonymousClass1(this.$isUnderBudget, this.$foodDayData, this.$remainingCaloriesValue)), aVar, 48, 1);
        }
    }
}
