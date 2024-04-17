package com.withings.device.details.automatic.activity.detection;

import com.withings.workout.category.model.WorkoutCategory;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<WorkoutCategory, Boolean> f36740b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.p<Long, Boolean, nm0.y> f36741c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f36742d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(AutomaticActivityDetection automaticActivityDetection, Map<WorkoutCategory, Boolean> map, ym0.p<? super Long, ? super Boolean, nm0.y> pVar, int i11) {
        super(2);
        this.f36739a = automaticActivityDetection;
        this.f36740b = map;
        this.f36741c = pVar;
        this.f36742d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36742d | 1);
        Map<WorkoutCategory, Boolean> map = this.f36740b;
        ym0.p<Long, Boolean, nm0.y> pVar = this.f36741c;
        AutomaticActivityDetection.D3(this.f36739a, map, pVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
