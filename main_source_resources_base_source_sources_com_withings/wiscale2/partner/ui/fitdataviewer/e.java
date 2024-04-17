package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.p8;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59055a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FitViewerDetailActivity fitViewerDetailActivity) {
        super(2);
        this.f59055a = fitViewerDetailActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            p8.b(FitViewerDetailActivity.B3(this.f59055a).c(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131070);
        }
        return y.f85009a;
    }
}
