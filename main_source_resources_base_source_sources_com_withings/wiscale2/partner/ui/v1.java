package com.withings.wiscale2.partner.ui;

import androidx.camera.camera2.internal.q2;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.runtime.a;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
final class v1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59232a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(k1 k1Var) {
        super(2);
        this.f59232a = k1Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Object a11 = q2.a(aVar2, 773894976, -492369756);
            if (a11 == a.C0060a.a()) {
                a11 = androidx.camera.camera2.internal.q.b(k1.y.i(aVar2), aVar2);
            }
            aVar2.J();
            CoroutineScope a12 = ((androidx.compose.runtime.k) a11).a();
            aVar2.J();
            c5 f11 = f4.f(ModalBottomSheetValue.f4842a, null, false, aVar2, 14);
            s1.a aVar3 = b.f58907a;
            k1 k1Var = this.f59232a;
            wk.h.a(null, f11, aVar3, s1.b.b(aVar2, -258021838, new r1(k1Var, a12, f11)), s1.b.b(aVar2, 1567613939, new u1(k1Var, a12, f11)), aVar2, 28096, 1);
        }
        return nm0.y.f85009a;
    }
}
