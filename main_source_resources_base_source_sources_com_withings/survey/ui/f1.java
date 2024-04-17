package com.withings.survey.ui;

import androidx.compose.material.c5;
import kotlinx.coroutines.CoroutineScope;
import t50.a;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class f1 extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44328a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t50.a f44329b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f44330c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44331d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r8.n f44332e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(CoroutineScope coroutineScope, t50.a aVar, c5 c5Var, InAppSurveyActivity inAppSurveyActivity, r8.n nVar) {
        super(4);
        this.f44328a = coroutineScope;
        this.f44329b = aVar;
        this.f44330c = c5Var;
        this.f44331d = inAppSurveyActivity;
        this.f44332e = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        Double d11;
        r0.h bottomSheet = hVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(it, "it");
        a.e eVar = (a.e) this.f44329b;
        en0.f o11 = en0.r.o(Double.parseDouble(eVar.h()), Double.parseDouble(eVar.g()));
        double parseDouble = Double.parseDouble(eVar.j());
        String k11 = eVar.k();
        String i11 = eVar.i();
        if (i11 != null) {
            d11 = dp0.j.e0(i11);
        } else {
            d11 = null;
        }
        Double d12 = d11;
        tj.k.a(this.f44328a, o11, parseDouble, k11, this.f44330c, d12, new e1(this.f44331d, this.f44332e), aVar2, 32776, 0);
        return nm0.y.f85009a;
    }
}
