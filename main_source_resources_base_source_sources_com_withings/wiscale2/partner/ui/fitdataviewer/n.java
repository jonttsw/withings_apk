package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.c5;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import xh0.s;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class n extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59070a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59071b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f59072c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c5 c5Var, FitViewerDetailActivity fitViewerDetailActivity, CoroutineScope coroutineScope) {
        super(2);
        this.f59070a = fitViewerDetailActivity;
        this.f59071b = coroutineScope;
        this.f59072c = c5Var;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            FitViewerDetailActivity fitViewerDetailActivity = this.f59070a;
            s.e(FitViewerDetailActivity.B3(fitViewerDetailActivity), new m(this.f59072c, fitViewerDetailActivity, this.f59071b), aVar2, 8, 0);
        }
        return y.f85009a;
    }
}
