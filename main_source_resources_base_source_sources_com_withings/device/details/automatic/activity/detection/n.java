package com.withings.device.details.automatic.activity.detection;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class n extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AutomaticActivityDetection automaticActivityDetection) {
        super(1);
        this.f36722a = automaticActivityDetection;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        AutomaticActivityDetectionViewModel E3 = AutomaticActivityDetection.E3(this.f36722a);
        E3.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(E3), null, null, new y(E3, booleanValue, null), 3, null);
        return nm0.y.f85009a;
    }
}
