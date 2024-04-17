package com.withings.nervehealth.ui;

import androidx.camera.camera2.internal.q2;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.a;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42734a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        super(2);
        this.f42734a = nerveHealthMeasureListActivity;
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
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            x0.g d12 = wk.h.d();
            long O = ((i1) aVar2.D(j1.e())).O();
            NerveHealthMeasureListActivity nerveHealthMeasureListActivity = this.f42734a;
            f4.a(s1.b.b(aVar2, -705296448, new g0(nerveHealthMeasureListActivity, f11)), d11, f11, false, d12, 0.0f, O, 0L, 0L, s1.b.b(aVar2, 961391801, new k0(nerveHealthMeasureListActivity, a12, f11)), aVar2, 805306934, HttpStatus.SC_FAILED_DEPENDENCY);
        }
        return nm0.y.f85009a;
    }
}
