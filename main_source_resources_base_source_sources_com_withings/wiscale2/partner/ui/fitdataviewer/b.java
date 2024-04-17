package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDataTypesActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDataTypesActivity f59052a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FitViewerDataTypesActivity fitViewerDataTypesActivity) {
        super(2);
        this.f59052a = fitViewerDataTypesActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(1874328760);
            FitViewerDataTypesActivity fitViewerDataTypesActivity = this.f59052a;
            boolean K = aVar2.K(fitViewerDataTypesActivity);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new a(fitViewerDataTypesActivity);
                aVar2.n(t11);
            }
            aVar2.J();
            xh0.f.e((ym0.l) t11, aVar2, 0);
        }
        return y.f85009a;
    }
}
