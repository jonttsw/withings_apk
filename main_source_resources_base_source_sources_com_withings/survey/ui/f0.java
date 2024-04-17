package com.withings.survey.ui;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44320a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t50.a f44321b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<z50.a> f44322c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44323d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44324e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44325f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.l<List<z50.a>, nm0.y> f44326g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f44327h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(InAppSurveyActivity inAppSurveyActivity, t50.a aVar, List<z50.a> list, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.l<? super List<z50.a>, nm0.y> lVar, int i11) {
        super(2);
        this.f44320a = inAppSurveyActivity;
        this.f44321b = aVar;
        this.f44322c = list;
        this.f44323d = aVar2;
        this.f44324e = aVar3;
        this.f44325f = aVar4;
        this.f44326g = lVar;
        this.f44327h = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44327h | 1);
        ym0.a<nm0.y> aVar2 = this.f44325f;
        ym0.l<List<z50.a>, nm0.y> lVar = this.f44326g;
        InAppSurveyActivity.z3(this.f44320a, this.f44321b, this.f44322c, this.f44323d, this.f44324e, aVar2, lVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
