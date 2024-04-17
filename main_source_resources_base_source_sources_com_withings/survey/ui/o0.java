package com.withings.survey.ui;

import android.content.Context;
import com.withings.common.compose.component.z4;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<t50.a> f44399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44400b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f44401c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44402d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44403e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Context f44404f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ z4 f44405g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f44406h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(k1.o1<? extends t50.a> o1Var, k1.r0<Boolean> r0Var, k1.o1<Boolean> o1Var2, InAppSurveyActivity inAppSurveyActivity, CoroutineScope coroutineScope, Context context, z4 z4Var, String str) {
        super(2);
        this.f44399a = o1Var;
        this.f44400b = r0Var;
        this.f44401c = o1Var2;
        this.f44402d = inAppSurveyActivity;
        this.f44403e = coroutineScope;
        this.f44404f = context;
        this.f44405g = z4Var;
        this.f44406h = str;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            int i11 = InAppSurveyActivity.f44288f;
            t50.a value = this.f44399a.getValue();
            if (value != null) {
                String b10 = value.b();
                k1.r0<Boolean> r0Var = this.f44400b;
                if (!r0Var.getValue().booleanValue() && this.f44401c.getValue().booleanValue()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                com.withings.common.compose.component.l.a(null, b10, null, z5, null, null, r0Var.getValue().booleanValue(), new n0(this.f44402d, value, this.f44403e, this.f44404f, r0Var, this.f44405g, this.f44406h), aVar2, 0, 53);
            }
        }
        return nm0.y.f85009a;
    }
}
