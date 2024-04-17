package com.withings.survey.ui;

import androidx.compose.material.c5;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import t50.a;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class i1 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y50.a f44347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44348b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<z50.a>> f44349c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44350d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r8.n f44351e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c5 f44352f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(y50.a aVar, InAppSurveyActivity inAppSurveyActivity, k1.o1<? extends List<z50.a>> o1Var, CoroutineScope coroutineScope, r8.n nVar, c5 c5Var) {
        super(1);
        this.f44347a = aVar;
        this.f44348b = inAppSurveyActivity;
        this.f44349c = o1Var;
        this.f44350d = coroutineScope;
        this.f44351e = nVar;
        this.f44352f = c5Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        boolean z5;
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        for (t50.a aVar : this.f44347a.a()) {
            String valueOf = String.valueOf(aVar.d());
            InAppSurveyActivity inAppSurveyActivity = this.f44348b;
            k1.o1<List<z50.a>> o1Var = this.f44349c;
            CoroutineScope coroutineScope = this.f44350d;
            r8.n nVar = this.f44351e;
            androidx.navigation.compose.n.b(NavHost, valueOf, null, null, null, null, null, null, new s1.a(true, 891628340, new d1(inAppSurveyActivity, aVar, o1Var, coroutineScope, nVar)), 126);
            if (aVar instanceof a.e) {
                z5 = true;
                xb.i.a(NavHost, "NumberPickerBottomSheet", null, new s1.a(true, -2064342500, new f1(coroutineScope, aVar, this.f44352f, inAppSurveyActivity, nVar)), 6);
            } else {
                z5 = true;
            }
            if (aVar instanceof a.f) {
                xb.i.a(NavHost, "LocaleBottomSheet", null, new s1.a(z5, -1449383227, new h1(inAppSurveyActivity, nVar)), 6);
            }
        }
        return nm0.y.f85009a;
    }
}
