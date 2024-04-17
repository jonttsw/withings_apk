package com.withings.device.details.automatic.activity.detection;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<Long, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36723a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AutomaticActivityDetection automaticActivityDetection) {
        super(2);
        this.f36723a = automaticActivityDetection;
    }

    @Override // ym0.p
    public final nm0.y invoke(Long l5, Boolean bool) {
        long longValue = l5.longValue();
        boolean booleanValue = bool.booleanValue();
        AutomaticActivityDetectionViewModel E3 = AutomaticActivityDetection.E3(this.f36723a);
        E3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(E3), null, null, new x(E3, longValue, booleanValue, null), 3, null);
        return nm0.y.f85009a;
    }
}
