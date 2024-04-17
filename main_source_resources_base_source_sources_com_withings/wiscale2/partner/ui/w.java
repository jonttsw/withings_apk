package com.withings.wiscale2.partner.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.partner.ui.PartnerActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PartnerActivity.h f59233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(PartnerActivity.h hVar) {
        super(0);
        this.f59233a = hVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        PartnerActivity.h hVar = this.f59233a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = hVar.f58886b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_IS_FIT_FLOW");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_IS_FIT_FLOW");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_IS_FIT_FLOW of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
