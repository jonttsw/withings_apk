package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.s3;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class g extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59057a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FitViewerDetailActivity fitViewerDetailActivity) {
        super(2);
        this.f59057a = fitViewerDetailActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            s3.a(new f(this.f59057a), null, false, null, xh0.b.f107191a, aVar2, 24576, 14);
        }
        return y.f85009a;
    }
}
