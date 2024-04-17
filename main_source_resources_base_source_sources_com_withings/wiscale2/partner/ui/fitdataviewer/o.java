package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.runtime.l0;
import java.util.List;
import kotlin.collections.i0;
import kotlin.jvm.internal.w;
import nm0.y;
import xh0.s;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class o extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59073a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(FitViewerDetailActivity fitViewerDetailActivity) {
        super(2);
        this.f59073a = fitViewerDetailActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            FitViewerDetailActivity fitViewerDetailActivity = this.f59073a;
            s.c(FitViewerDetailActivity.B3(fitViewerDetailActivity), (List) l0.a(FitViewerDetailActivity.C3(fitViewerDetailActivity).i0(), i0.f76187a, null, aVar2, 2).getValue(), aVar2, 72);
        }
        return y.f85009a;
    }
}
