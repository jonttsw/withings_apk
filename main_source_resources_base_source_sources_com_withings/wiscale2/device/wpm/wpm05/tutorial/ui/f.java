package com.withings.wiscale2.device.wpm.wpm05.tutorial.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.work.impl.g;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.Wpm05TutorialScreen;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.a<Wpm05TutorialScreen> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e.c f55941a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e.c cVar) {
        super(0);
        this.f55941a = cVar;
    }

    @Override // ym0.a
    public final Wpm05TutorialScreen invoke() {
        e.c cVar = this.f55941a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Wpm05TutorialScreen.class);
        Fragment fragment = cVar.f55940b;
        if (isAssignableFrom) {
            return (Wpm05TutorialScreen) yq.b.d(fragment, "arg_screen");
        }
        if (Serializable.class.isAssignableFrom(Wpm05TutorialScreen.class)) {
            return (Wpm05TutorialScreen) yq.b.e(fragment, "arg_screen");
        }
        throw new IllegalArgumentException(g.a("extra arg_screen of class ", q0.b(Wpm05TutorialScreen.class), " is not supported"));
    }
}
