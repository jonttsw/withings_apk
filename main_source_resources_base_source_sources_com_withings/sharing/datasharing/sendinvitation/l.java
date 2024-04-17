package com.withings.sharing.datasharing.sendinvitation;

import com.withings.sharing.datasharing.sendinvitation.g;
import java.util.List;
/* compiled from: SendInvitationNavGraph.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.l<List<? extends y40.a>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SendInvitationViewModel f44227a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f44228b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f44229c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SendInvitationViewModel sendInvitationViewModel, boolean z5, androidx.navigation.e eVar) {
        super(1);
        this.f44227a = sendInvitationViewModel;
        this.f44228b = z5;
        this.f44229c = eVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends y40.a> list) {
        List<? extends y40.a> biomarkers = list;
        kotlin.jvm.internal.u.j(biomarkers, "biomarkers");
        this.f44227a.p0(new g.b(biomarkers));
        boolean z5 = this.f44228b;
        androidx.navigation.e eVar = this.f44229c;
        if (z5) {
            eVar.N();
        } else {
            androidx.navigation.e.L(eVar, "select_time?pop_on_next=false", null, 6);
        }
        return nm0.y.f85009a;
    }
}
