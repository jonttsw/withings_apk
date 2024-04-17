package com.withings.survey.ui;

import com.withings.common.compose.component.z4;
import com.withings.survey.viewModel.InAppSurveyViewModel;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InAppSurveyActivity f44421a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f44422b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44423c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z4 f44424d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f44425e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(InAppSurveyActivity inAppSurveyActivity, CoroutineScope coroutineScope, k1.r0<Boolean> r0Var, z4 z4Var, String str) {
        super(0);
        this.f44421a = inAppSurveyActivity;
        this.f44422b = coroutineScope;
        this.f44423c = r0Var;
        this.f44424d = z4Var;
        this.f44425e = str;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        InAppSurveyViewModel E3;
        InAppSurveyViewModel E32;
        InAppSurveyActivity inAppSurveyActivity = this.f44421a;
        E3 = inAppSurveyActivity.E3();
        if (E3.Y0()) {
            E32 = inAppSurveyActivity.E3();
            E32.d1();
            BuildersKt__Builders_commonKt.launch$default(this.f44422b, null, null, new p0(this.f44423c, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.f44422b, null, null, new q0(this.f44424d, this.f44425e, null), 3, null);
        }
        return nm0.y.f85009a;
    }
}
