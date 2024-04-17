package com.withings.sharing.datasharing.sendinvitation;

import com.withings.sharing.core.model.TimeSharePeriod;
import com.withings.sharing.datasharing.sendinvitation.g;
/* compiled from: SendInvitationNavGraph.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.l<TimeSharePeriod, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SendInvitationViewModel f44234a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f44235b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f44236c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SendInvitationViewModel sendInvitationViewModel, boolean z5, androidx.navigation.e eVar) {
        super(1);
        this.f44234a = sendInvitationViewModel;
        this.f44235b = z5;
        this.f44236c = eVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(TimeSharePeriod timeSharePeriod) {
        TimeSharePeriod timeSharePeriod2 = timeSharePeriod;
        kotlin.jvm.internal.u.j(timeSharePeriod2, "timeSharePeriod");
        this.f44234a.p0(new g.c(timeSharePeriod2));
        boolean z5 = this.f44235b;
        androidx.navigation.e eVar = this.f44236c;
        if (z5) {
            eVar.N();
        } else {
            androidx.navigation.e.L(eVar, "summary", null, 6);
        }
        return nm0.y.f85009a;
    }
}
