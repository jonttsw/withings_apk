package com.withings.account.ui;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.account.ui.VerifyAuthenticationSensitiveActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class d extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationSensitiveActivity.c f31020a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(VerifyAuthenticationSensitiveActivity.c cVar) {
        super(0);
        this.f31020a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        VerifyAuthenticationSensitiveActivity.c cVar = this.f31020a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = cVar.f31011b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "is_google");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "is_google");
        }
        throw new IllegalArgumentException(g.a("extra is_google of class ", q0.b(Boolean.class), " is not supported"));
    }
}
