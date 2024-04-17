package com.withings.survey.ui;

import com.withings.common.compose.component.z4;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<Integer>> f44428a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44429b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44430c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44431d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ z4 f44432e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f44433f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(k1.o1<? extends List<Integer>> o1Var, k1.r0<Boolean> r0Var, InAppSurveyActivity inAppSurveyActivity, CoroutineScope coroutineScope, z4 z4Var, String str) {
        super(2);
        this.f44428a = o1Var;
        this.f44429b = r0Var;
        this.f44430c = inAppSurveyActivity;
        this.f44431d = coroutineScope;
        this.f44432e = z4Var;
        this.f44433f = str;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            int i11 = InAppSurveyActivity.f44288f;
            if (this.f44428a.getValue().size() > 1) {
                com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._PREVIOUS_, aVar2), null, false, null, null, this.f44429b.getValue().booleanValue(), new r0(this.f44430c, this.f44431d, this.f44429b, this.f44432e, this.f44433f), aVar2, 0, 61);
            }
        }
        return nm0.y.f85009a;
    }
}
