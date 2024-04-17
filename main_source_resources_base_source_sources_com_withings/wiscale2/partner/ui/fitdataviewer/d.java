package com.withings.wiscale2.partner.ui.fitdataviewer;

import androidx.compose.material.t5;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDataTypesActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitViewerDataTypesActivity f59054a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FitViewerDataTypesActivity fitViewerDataTypesActivity) {
        super(2);
        this.f59054a = fitViewerDataTypesActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            t5.b(null, null, xh0.a.f107188b, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, s1.b.b(aVar2, 683276103, new c(this.f59054a)), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 12582912, 131067);
        }
        return y.f85009a;
    }
}
