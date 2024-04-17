package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.Wpm04TutorialScreen;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.k;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class l extends w implements ym0.a<Wpm04TutorialScreen> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k.c f55880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k.c cVar) {
        super(0);
        this.f55880a = cVar;
    }

    @Override // ym0.a
    public final Wpm04TutorialScreen invoke() {
        k.c cVar = this.f55880a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Wpm04TutorialScreen.class);
        Fragment fragment = cVar.f55879b;
        if (isAssignableFrom) {
            return (Wpm04TutorialScreen) yq.b.d(fragment, "arg_screen");
        }
        if (Serializable.class.isAssignableFrom(Wpm04TutorialScreen.class)) {
            return (Wpm04TutorialScreen) yq.b.e(fragment, "arg_screen");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra arg_screen of class ", q0.b(Wpm04TutorialScreen.class), " is not supported"));
    }
}
