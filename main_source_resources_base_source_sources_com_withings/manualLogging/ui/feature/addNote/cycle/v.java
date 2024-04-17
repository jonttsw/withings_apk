package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41260a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
        super(2);
        this.f41260a = aVar;
        this.f41261b = aVar2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            a0.f40840a.h(false, false, true, false, this.f41260a, this.f41261b, aVar2, 1573254, 10);
        }
        return nm0.y.f85009a;
    }
}
