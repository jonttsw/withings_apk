package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41126a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41127b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41128c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z5, boolean z11, ym0.a<nm0.y> aVar) {
        super(2);
        this.f41126a = z5;
        this.f41127b = z11;
        this.f41128c = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            if (this.f41126a) {
                i11 = C1987R.string._DONE_;
            } else {
                i11 = C1987R.string._NEXT_;
            }
            com.withings.common.compose.component.l.a(null, ay.b.u(i11, aVar2), null, this.f41127b, ColorStyle.f33322a, null, false, this.f41128c, aVar2, 24576, 101);
        }
        return nm0.y.f85009a;
    }
}
