package com.withings.survey.ui;

import com.withings.common.compose.component.c5;
import com.withings.library.authentication.api.ConstantsWs;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppSurveyActivity.kt */
/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44365a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y50.a f44366b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ym0.a<nm0.y> aVar, y50.a aVar2) {
        super(2);
        this.f44365a = aVar;
        this.f44366b = aVar2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            c5.c(null, null, s1.b.b(aVar2, -2125198410, new j0(this.f44366b)), f1.d.a(), null, null, null, this.f44365a, false, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, ConstantsWs.WS_STATUS_INVITATION_ALRDY_ACCEPTED);
        }
        return nm0.y.f85009a;
    }
}
