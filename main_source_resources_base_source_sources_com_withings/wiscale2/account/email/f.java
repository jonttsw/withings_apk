package com.withings.wiscale2.account.email;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
final class f extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48078a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EmailModificationActivity emailModificationActivity) {
        super(0);
        this.f48078a = emailModificationActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f48078a.finish();
        return y.f85009a;
    }
}
