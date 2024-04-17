package com.withings.account.ui;

import com.withings.account.ui.VerifyAuthenticationSensitiveActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class e extends w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationSensitiveActivity.d f31021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VerifyAuthenticationSensitiveActivity.d dVar) {
        super(0);
        this.f31021a = dVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return b0.I(this.f31021a.f31013b, "mail");
    }
}
