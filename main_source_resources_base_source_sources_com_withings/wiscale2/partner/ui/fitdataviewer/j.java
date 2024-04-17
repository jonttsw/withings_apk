package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.c5;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: FitViewerDetailActivity.kt */
/* loaded from: classes5.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f59061a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f59062b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c5 c5Var, CoroutineScope coroutineScope) {
        super(0);
        this.f59061a = coroutineScope;
        this.f59062b = c5Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f59061a, null, null, new i(this.f59062b, null), 3, null);
        return y.f85009a;
    }
}
