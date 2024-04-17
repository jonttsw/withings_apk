package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f52923a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f52924b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l1.a f52925c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List f52926d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ f1 f52927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m mVar, f1 f1Var, l1.a aVar, List list, List list2) {
        super(4);
        this.f52923a = list;
        this.f52924b = mVar;
        this.f52925c = aVar;
        this.f52926d = list2;
        this.f52927e = f1Var;
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
            b bVar3 = (b) this.f52923a.get(intValue);
            aVar2.s(1889199023);
            l1.a aVar3 = this.f52925c;
            boolean c11 = aVar3.c();
            if (intValue > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            m.u1(this.f52924b, c11, bVar3, this.f52926d, z5, new c0(this.f52927e, bVar3, this.f52924b), aVar2, 262656);
            if (intValue == kotlin.collections.x.M(aVar3.b())) {
                com.withings.common.compose.component.v0.a(aVar2, 0);
            }
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
