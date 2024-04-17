package com.withings.wiscale2.settings;

import android.content.Intent;
import com.withings.wiscale2.account.email.EmailModificationActivity;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class y2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60390a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(SettingsActivity settingsActivity) {
        super(0);
        this.f60390a = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = EmailModificationActivity.f48003f;
        SettingsActivity context = this.f60390a;
        kotlin.jvm.internal.u.j(context, "context");
        context.startActivity(new Intent(context, EmailModificationActivity.class));
        return nm0.y.f85009a;
    }
}
