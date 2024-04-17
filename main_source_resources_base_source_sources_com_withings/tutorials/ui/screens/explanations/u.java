package com.withings.tutorials.ui.screens.explanations;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.tutorials.core.model.ExplanationsType;
import com.withings.tutorials.ui.screens.explanations.ExplanationsActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.w implements ym0.a<ExplanationsType> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExplanationsActivity.c f45258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ExplanationsActivity.c cVar) {
        super(0);
        this.f45258a = cVar;
    }

    @Override // ym0.a
    public final ExplanationsType invoke() {
        ExplanationsActivity.c cVar = this.f45258a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ExplanationsType.class);
        Activity activity = cVar.f45086b;
        if (isAssignableFrom) {
            return (ExplanationsType) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_KEY_EXPLANATIONS_IDENTIFIER");
        }
        if (Serializable.class.isAssignableFrom(ExplanationsType.class)) {
            return (ExplanationsType) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_KEY_EXPLANATIONS_IDENTIFIER");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_KEY_EXPLANATIONS_IDENTIFIER of class ", kotlin.jvm.internal.q0.b(ExplanationsType.class), " is not supported"));
    }
}
