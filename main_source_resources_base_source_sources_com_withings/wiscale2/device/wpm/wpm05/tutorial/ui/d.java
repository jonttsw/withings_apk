package com.withings.wiscale2.device.wpm.wpm05.tutorial.ui;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.Wpm05TutorialActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm05TutorialActivity.b f55934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Wpm05TutorialActivity.b bVar) {
        super(0);
        this.f55934a = bVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        Wpm05TutorialActivity.b bVar = this.f55934a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = bVar.f55930b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "extra_post_install");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "extra_post_install");
        }
        throw new IllegalArgumentException(g.a("extra extra_post_install of class ", q0.b(Boolean.class), " is not supported"));
    }
}
