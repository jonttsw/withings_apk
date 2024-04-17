package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.Wpm04TutorialActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class h extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm04TutorialActivity.c f55864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Wpm04TutorialActivity.c cVar) {
        super(0);
        this.f55864a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        Wpm04TutorialActivity.c cVar = this.f55864a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = cVar.f55856b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "extra_post_install");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "extra_post_install");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_post_install of class ", q0.b(Boolean.class), " is not supported"));
    }
}
