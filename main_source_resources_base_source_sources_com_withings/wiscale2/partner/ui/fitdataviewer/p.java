package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.c5;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class p extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c5 f59074a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59075b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59076c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c5 c5Var, FitViewerDetailActivity fitViewerDetailActivity, CoroutineScope coroutineScope) {
        super(2);
        this.f59074a = c5Var;
        this.f59075b = fitViewerDetailActivity;
        this.f59076c = coroutineScope;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            CoroutineScope coroutineScope = this.f59076c;
            c5 c5Var = this.f59074a;
            FitViewerDetailActivity fitViewerDetailActivity = this.f59075b;
            wk.h.a(null, c5Var, null, s1.b.b(aVar2, 735833494, new n(c5Var, fitViewerDetailActivity, coroutineScope)), s1.b.b(aVar2, -2061687691, new o(fitViewerDetailActivity)), aVar2, 27712, 5);
        }
        return y.f85009a;
    }
}
