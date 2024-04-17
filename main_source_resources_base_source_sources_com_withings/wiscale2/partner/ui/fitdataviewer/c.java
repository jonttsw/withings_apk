package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material3.a9;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDataTypesActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDataTypesActivity f59053a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FitViewerDataTypesActivity fitViewerDataTypesActivity) {
        super(3);
        this.f59053a = fitViewerDataTypesActivity;
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
            a9.a(null, null, ((i1) aVar2.D(j1.e())).a(), 0L, 0.0f, 0.0f, null, s1.b.b(aVar2, 1756185740, new b(this.f59053a)), aVar2, 12582912, 123);
        }
        return y.f85009a;
    }
}
