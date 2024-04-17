package com.withings.survey.ui;

import androidx.compose.material3.j5;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class d1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44305a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t50.a f44306b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<z50.a>> f44307c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44308d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r8.n f44309e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(InAppSurveyActivity inAppSurveyActivity, t50.a aVar, k1.o1<? extends List<z50.a>> o1Var, CoroutineScope coroutineScope, r8.n nVar) {
        super(4);
        this.f44305a = inAppSurveyActivity;
        this.f44306b = aVar;
        this.f44307c = o1Var;
        this.f44308d = coroutineScope;
        this.f44309e = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        int i11 = InAppSurveyActivity.f44288f;
        List<z50.a> value = this.f44307c.getValue();
        CoroutineScope coroutineScope = this.f44308d;
        r8.n nVar = this.f44309e;
        z0 z0Var = new z0(coroutineScope, nVar);
        a1 a1Var = new a1(nVar);
        InAppSurveyActivity inAppSurveyActivity = this.f44305a;
        b1 b1Var = new b1(inAppSurveyActivity);
        c1 c1Var = new c1(inAppSurveyActivity);
        InAppSurveyActivity.z3(this.f44305a, this.f44306b, value, z0Var, a1Var, b1Var, c1Var, aVar, 2097216);
        return nm0.y.f85009a;
    }
}
