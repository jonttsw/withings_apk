package com.withings.survey.ui;

import android.content.Context;
import com.withings.common.compose.component.z4;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<t50.a> f44440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44441b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f44442c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44443d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44444e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Context f44445f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ z4 f44446g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f44447h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<Integer>> f44448i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(k1.o1 o1Var, k1.r0 r0Var, k1.r0 r0Var2, InAppSurveyActivity inAppSurveyActivity, CoroutineScope coroutineScope, Context context, z4 z4Var, String str, k1.r0 r0Var3) {
        super(2);
        this.f44440a = o1Var;
        this.f44441b = r0Var;
        this.f44442c = r0Var2;
        this.f44443d = inAppSurveyActivity;
        this.f44444e = coroutineScope;
        this.f44445f = context;
        this.f44446g = z4Var;
        this.f44447h = str;
        this.f44448i = r0Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            wk.i.a(androidx.compose.ui.e.f8927a, false, s1.b.b(aVar2, -1880854242, new o0(this.f44440a, this.f44441b, this.f44442c, this.f44443d, this.f44444e, this.f44445f, this.f44446g, this.f44447h)), s1.b.b(aVar2, -1232626785, new s0(this.f44448i, this.f44441b, this.f44443d, this.f44444e, this.f44446g, this.f44447h)), aVar2, 3462, 2);
        }
        return nm0.y.f85009a;
    }
}
