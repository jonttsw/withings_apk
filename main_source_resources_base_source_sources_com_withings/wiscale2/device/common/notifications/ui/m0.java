package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f52966a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f52967b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l1.a f52968c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List f52969d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ f1 f52970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(m mVar, f1 f1Var, l1.a aVar, List list, List list2) {
        super(4);
        this.f52966a = list;
        this.f52967b = mVar;
        this.f52968c = aVar;
        this.f52969d = list2;
        this.f52970e = f1Var;
    }

    @Override // ym0.r
    public final nm0.y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        boolean z5;
        int i12;
        int i13;
        s0.b bVar2 = bVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 14) == 0) {
            if (aVar2.K(bVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (aVar2.c(intValue)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && aVar2.h()) {
            aVar2.C();
        } else {
            a aVar3 = (a) this.f52966a.get(intValue);
            aVar2.s(1889199768);
            l1.a aVar4 = this.f52968c;
            boolean c11 = aVar4.c();
            if (intValue != kotlin.collections.x.M(aVar4.a())) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5;
            g0 g0Var = new g0(this.f52970e, aVar3, aVar4);
            m.s1(this.f52967b, c11, aVar3, this.f52969d, z11, g0Var, aVar2, 262720);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
