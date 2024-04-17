package com.withings.sharing.datasharing.sendinvitation;
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InvitationStatus f44225a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f44226b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(InvitationStatus invitationStatus, ym0.l<? super String, nm0.y> lVar) {
        super(3);
        this.f44225a = invitationStatus;
        this.f44226b = lVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        r0.h ModalBottomSheet = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            if (this.f44225a == InvitationStatus.f44088b) {
                z5 = true;
            } else {
                z5 = false;
            }
            f0.c(z5, this.f44226b, aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}
