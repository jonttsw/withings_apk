package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.camera.camera2.internal.q2;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.c5;
import androidx.compose.material.f4;
import androidx.compose.material.t5;
import androidx.compose.runtime.a;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class r extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59080a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(FitViewerDetailActivity fitViewerDetailActivity) {
        super(2);
        this.f59080a = fitViewerDetailActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
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
            FitViewerDetailActivity fitViewerDetailActivity = this.f59080a;
            t5.b(null, null, s1.b.b(aVar2, -2033321340, new h(fitViewerDetailActivity)), null, null, s1.b.b(aVar2, 1749127585, new k(f11, a12)), 2, true, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, 830670315, new q(f11, fitViewerDetailActivity, a12)), aVar2, 12779904, 12582912, 130843);
        }
        return y.f85009a;
    }
}
