package com.withings.authentication.tryToLogin.google;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GoogleAuthProviderViewModel.kt */
/* loaded from: classes3.dex */
public final class c extends w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GoogleAuthProviderViewModel f32381a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GoogleAuthProviderViewModel googleAuthProviderViewModel) {
        super(0);
        this.f32381a = googleAuthProviderViewModel;
    }

    @Override // ym0.a
    public final String invoke() {
        Context context;
        context = this.f32381a.f32346a;
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
