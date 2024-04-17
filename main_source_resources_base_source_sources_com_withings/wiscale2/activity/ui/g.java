package com.withings.wiscale2.activity.ui;

import com.withings.common.compose.component.c5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
final class g extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(VasistasInfoActivity vasistasInfoActivity) {
        super(2);
        this.f48637a = vasistasInfoActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            VasistasInfoActivity vasistasInfoActivity = this.f48637a;
            c5.a(0L, 0L, "Data Day Information", true, null, null, null, new e(vasistasInfoActivity), false, new f(vasistasInfoActivity), aVar2, 3456, ConstantsWs.WS_STATUS_INVITATION_ALRDY_ACCEPTED);
        }
        return y.f85009a;
    }
}
