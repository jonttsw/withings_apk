package com.withings.wiscale2.settings;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.appnavigation.api.builder.SettingsDestinations;
import com.withings.wiscale2.settings.SettingsActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class b5 extends kotlin.jvm.internal.w implements ym0.a<SettingsDestinations> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity.f f59887a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(SettingsActivity.f fVar) {
        super(0);
        this.f59887a = fVar;
    }

    @Override // ym0.a
    public final SettingsDestinations invoke() {
        SettingsActivity.f fVar = this.f59887a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(SettingsDestinations.class);
        Activity activity = fVar.f59757b;
        if (isAssignableFrom) {
            return (SettingsDestinations) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "settingsStart");
        }
        if (Serializable.class.isAssignableFrom(SettingsDestinations.class)) {
            return (SettingsDestinations) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "settingsStart");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra settingsStart of class ", kotlin.jvm.internal.q0.b(SettingsDestinations.class), " is not supported"));
    }
}
