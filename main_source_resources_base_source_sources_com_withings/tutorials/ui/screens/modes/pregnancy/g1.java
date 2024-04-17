package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class g1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<DateTime> f45944a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DateTime f45945b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<DateTime, nm0.y> f45946c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45947d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g1(k1.r0<DateTime> r0Var, DateTime dateTime, ym0.l<? super DateTime, nm0.y> lVar, ym0.a<nm0.y> aVar) {
        super(2);
        this.f45944a = r0Var;
        this.f45945b = dateTime;
        this.f45946c = lVar;
        this.f45947d = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
            ColorStyle colorStyle = ColorStyle.f33322a;
            if (this.f45944a.getValue() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.withings.common.compose.component.l.a(null, u11, null, z5, colorStyle, null, false, new f1(this.f45945b, this.f45946c, this.f45947d), aVar2, 24576, 101);
        }
        return nm0.y.f85009a;
    }
}
