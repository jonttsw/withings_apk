package com.withings.wiscale2.user.ui.profile;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity.z f61947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(EditProfileActivity.z zVar) {
        super(0);
        this.f61947a = zVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        EditProfileActivity.z zVar = this.f61947a;
        zVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = zVar.f61914b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "extra_fix_weight");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "extra_fix_weight");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_fix_weight of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
