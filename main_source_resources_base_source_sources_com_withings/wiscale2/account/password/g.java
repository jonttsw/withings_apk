package com.withings.wiscale2.account.password;

import com.withings.wiscale2.account.password.LinkForPasswordSentActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class g extends w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LinkForPasswordSentActivity.b f48145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinkForPasswordSentActivity.b bVar) {
        super(0);
        this.f48145a = bVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return b0.I(this.f48145a.f48124b, "extra_key_email");
    }
}
