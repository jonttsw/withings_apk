package com.withings.survey.ui;

import androidx.compose.material.c5;
import androidx.compose.runtime.a;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class j1 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y50.a f44356a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f44357b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<Integer> f44358c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44359d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<z50.a>> f44360e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44361f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c5 f44362g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(y50.a aVar, r8.n nVar, k1.r0 r0Var, InAppSurveyActivity inAppSurveyActivity, k1.r0 r0Var2, CoroutineScope coroutineScope, c5 c5Var) {
        super(3);
        this.f44356a = aVar;
        this.f44357b = nVar;
        this.f44358c = r0Var;
        this.f44359d = inAppSurveyActivity;
        this.f44360e = r0Var2;
        this.f44361f = coroutineScope;
        this.f44362g = c5Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.w contentPadding = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(contentPadding, "contentPadding");
        if ((intValue & 14) == 0) {
            if (aVar2.K(contentPadding)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.x0.e(androidx.compose.ui.e.f8927a, contentPadding);
            String valueOf = String.valueOf(((t50.a) kotlin.collections.x.I(this.f44356a.a())).d());
            aVar2.s(-1853046248);
            k1.o1<Integer> o1Var = this.f44358c;
            boolean K = aVar2.K(o1Var);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new v0(o1Var);
                aVar2.n(t11);
            }
            ym0.l lVar = (ym0.l) t11;
            aVar2.J();
            aVar2.s(-1853046099);
            boolean K2 = aVar2.K(o1Var);
            Object t12 = aVar2.t();
            if (K2 || t12 == a.C0060a.a()) {
                t12 = new x0(o1Var);
                aVar2.n(t12);
            }
            aVar2.J();
            i1 i1Var = new i1(this.f44356a, this.f44359d, this.f44360e, this.f44361f, this.f44357b, this.f44362g);
            androidx.navigation.compose.s.b(this.f44357b, valueOf, e11, null, null, lVar, (ym0.l) t12, null, null, i1Var, aVar2, 8, 408);
        }
        return nm0.y.f85009a;
    }
}
