package com.withings.tutorials.ui.screens.explanations;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.tutorials.ui.screens.explanations.ExplanationsActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExplanationsActivity.e f45279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ExplanationsActivity.e eVar) {
        super(0);
        this.f45279a = eVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        ExplanationsActivity.e eVar = this.f45279a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = eVar.f45090b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_KEY_ALLOW_BACK");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_KEY_ALLOW_BACK");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_KEY_ALLOW_BACK of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
