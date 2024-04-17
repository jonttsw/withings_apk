package com.withings.sharing.datasharing.sendinvitation;

import android.os.Bundle;
import androidx.compose.runtime.l0;
import com.withings.sharing.core.model.TimeSharePeriod;
/* compiled from: SendInvitationNavGraph.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.r<l0.i, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SendInvitationViewModel f44237a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44238b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f44239c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SendInvitationViewModel sendInvitationViewModel, ym0.a aVar, r8.n nVar) {
        super(4);
        this.f44237a = sendInvitationViewModel;
        this.f44238b = aVar;
        this.f44239c = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.i iVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        Boolean bool;
        l0.i composableWithHorizontalTransition = iVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composableWithHorizontalTransition, "$this$composableWithHorizontalTransition");
        kotlin.jvm.internal.u.j(it, "it");
        Bundle c11 = it.c();
        if (c11 != null) {
            bool = Boolean.valueOf(c11.getBoolean("pop_on_next"));
        } else {
            bool = null;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            SendInvitationViewModel sendInvitationViewModel = this.f44237a;
            TimeSharePeriod c12 = ((z40.j) l0.b(sendInvitationViewModel.m0(), aVar2).getValue()).c();
            androidx.navigation.e eVar = this.f44239c;
            z40.g.a(c12, null, new o(eVar), new p(sendInvitationViewModel, booleanValue, eVar), this.f44238b, aVar2, 0, 2);
            return nm0.y.f85009a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
