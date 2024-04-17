package com.withings.sharing.datasharing.sendinvitation;

import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendInvitationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sharing.datasharing.sendinvitation.SendInvitationViewModel$sendInvitation$1", f = "SendInvitationViewModel.kt", l = {56, 55, 62, 65}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    z40.j f44251a;

    /* renamed from: b  reason: collision with root package name */
    v40.a f44252b;

    /* renamed from: c  reason: collision with root package name */
    int f44253c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SendInvitationViewModel f44254d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f44255e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(SendInvitationViewModel sendInvitationViewModel, String str, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f44254d = sendInvitationViewModel;
        this.f44255e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f44254d, this.f44255e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.sharing.datasharing.sendinvitation.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
