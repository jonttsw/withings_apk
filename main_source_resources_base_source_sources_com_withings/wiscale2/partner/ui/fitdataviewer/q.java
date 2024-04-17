package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.c5;
import androidx.compose.material3.a9;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class q extends w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c5 f59077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FitViewerDetailActivity f59078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59079c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c5 c5Var, FitViewerDetailActivity fitViewerDetailActivity, CoroutineScope coroutineScope) {
        super(3);
        this.f59077a = c5Var;
        this.f59078b = fitViewerDetailActivity;
        this.f59079c = coroutineScope;
    }

    @Override // ym0.q
    public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            a9.a(null, null, ((i1) aVar2.D(j1.e())).a(), 0L, 0.0f, 0.0f, null, s1.b.b(aVar2, -2009666832, new p(this.f59077a, this.f59078b, this.f59079c)), aVar2, 12582912, 123);
        }
        return y.f85009a;
    }
}
