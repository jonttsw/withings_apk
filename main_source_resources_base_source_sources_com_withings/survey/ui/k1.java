package com.withings.survey.ui;

import androidx.compose.material.c5;
import com.withings.common.compose.component.z4;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class k1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y50.a f44368b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44369c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r8.n f44370d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c5 f44371e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ z4 f44372f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f44373g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(InAppSurveyActivity inAppSurveyActivity, y50.a aVar, ym0.a<nm0.y> aVar2, r8.n nVar, c5 c5Var, z4 z4Var, int i11) {
        super(2);
        this.f44367a = inAppSurveyActivity;
        this.f44368b = aVar;
        this.f44369c = aVar2;
        this.f44370d = nVar;
        this.f44371e = c5Var;
        this.f44372f = z4Var;
        this.f44373g = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f44373g | 1);
        c5 c5Var = this.f44371e;
        z4 z4Var = this.f44372f;
        InAppSurveyActivity.C3(this.f44367a, this.f44368b, this.f44369c, this.f44370d, c5Var, z4Var, aVar, g11);
        return nm0.y.f85009a;
    }
}
