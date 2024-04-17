package com.withings.manualLogging.ui.feature.addNote.cycle;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41156b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f41157c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41158d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z5, boolean z11, boolean z12, ym0.a<nm0.y> aVar) {
        super(2);
        this.f41155a = z5;
        this.f41156b = z11;
        this.f41157c = z12;
        this.f41158d = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            if (!this.f41155a && !this.f41156b) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5;
            l0.g.e(z11, null, null, null, null, s1.b.b(aVar2, 1252469892, new o0(this.f41158d, this.f41157c)), aVar2, 196608, 30);
        }
        return nm0.y.f85009a;
    }
}
