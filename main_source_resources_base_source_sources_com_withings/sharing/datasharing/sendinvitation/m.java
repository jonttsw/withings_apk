package com.withings.sharing.datasharing.sendinvitation;

import android.os.Bundle;
import androidx.compose.runtime.l0;
import java.util.List;
/* compiled from: SendInvitationNavGraph.kt */
/* loaded from: classes4.dex */
final class m extends kotlin.jvm.internal.w implements ym0.r<l0.i, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SendInvitationViewModel f44230a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f44231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SendInvitationViewModel sendInvitationViewModel, r8.n nVar) {
        super(4);
        this.f44230a = sendInvitationViewModel;
        this.f44231b = nVar;
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
            SendInvitationViewModel sendInvitationViewModel = this.f44230a;
            List<y40.a> b10 = ((z40.j) l0.b(sendInvitationViewModel.m0(), aVar2).getValue()).b();
            androidx.navigation.e eVar = this.f44231b;
            b.b(null, b10, new k(eVar), new l(sendInvitationViewModel, booleanValue, eVar), aVar2, 64, 1);
            return nm0.y.f85009a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
