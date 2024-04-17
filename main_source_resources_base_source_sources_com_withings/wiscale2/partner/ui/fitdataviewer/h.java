package com.withings.wiscale2.partner.ui.fitdataviewer;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class h extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59058a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FitViewerDetailActivity fitViewerDetailActivity) {
        super(2);
        this.f59058a = fitViewerDetailActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            FitViewerDetailActivity fitViewerDetailActivity = this.f59058a;
            androidx.compose.material.k.c(s1.b.b(aVar2, 805204808, new e(fitViewerDetailActivity)), null, s1.b.b(aVar2, 398181322, new g(fitViewerDetailActivity)), null, 0L, 0L, 0.0f, aVar2, 390, 122);
        }
        return y.f85009a;
    }
}
