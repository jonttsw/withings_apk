package com.withings.device.details.automatic.activity.detection;

import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36734a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WorkoutCategory f36735b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AutomaticActivityDetection automaticActivityDetection, WorkoutCategory workoutCategory) {
        super(3);
        this.f36734a = automaticActivityDetection;
        this.f36735b = workoutCategory;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
        r0.a0 LabelSwitchCell = a0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(LabelSwitchCell, "$this$LabelSwitchCell");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            String glyphName = this.f36735b.getGlyphName();
            kotlin.jvm.internal.u.i(glyphName, "getGlyphName(...)");
            AutomaticActivityDetection.C3(this.f36734a, glyphName, aVar2, 64);
        }
        return nm0.y.f85009a;
    }
}
