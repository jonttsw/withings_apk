package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.c5;
import androidx.compose.material.m3;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class k extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c5 f59063a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59064b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c5 c5Var, CoroutineScope coroutineScope) {
        super(2);
        this.f59063a = c5Var;
        this.f59064b = coroutineScope;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            c5 c5Var = this.f59063a;
            if (!c5Var.j()) {
                m3.b(new j(c5Var, this.f59064b), null, null, null, 0L, 0L, null, xh0.b.f107192b, aVar2, 12582912, 126);
            }
        }
        return y.f85009a;
    }
}
