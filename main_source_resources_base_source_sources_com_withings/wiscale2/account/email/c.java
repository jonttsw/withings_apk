package com.withings.wiscale2.account.email;

import com.withings.wiscale2.account.email.EmailModificationViewModel;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
final class c extends w implements ym0.l<EmailModificationViewModel.b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48075a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmailModificationActivity emailModificationActivity) {
        super(1);
        this.f48075a = emailModificationActivity;
    }

    @Override // ym0.l
    public final y invoke(EmailModificationViewModel.b bVar) {
        EmailModificationViewModel.b bVar2 = bVar;
        EmailModificationActivity emailModificationActivity = this.f48075a;
        qc.b B = new qc.b(emailModificationActivity).B(emailModificationActivity.getString(bVar2.c()));
        B.v(emailModificationActivity.getString(bVar2.b()));
        B.x(bVar2.a(), null);
        B.s();
        return y.f85009a;
    }
}
