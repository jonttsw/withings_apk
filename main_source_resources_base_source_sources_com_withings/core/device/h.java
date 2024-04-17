package com.withings.core.device;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.core.device.FullscreenVideoFragment;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class h extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FullscreenVideoFragment.f f35355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FullscreenVideoFragment.f fVar) {
        super(0);
        this.f35355a = fVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        FullscreenVideoFragment.f fVar = this.f35355a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Fragment fragment = fVar.f35345b;
        if (isAssignableFrom) {
            return (Boolean) yq.b.d(fragment, "canSkip");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) yq.b.e(fragment, "canSkip");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra canSkip of class ", q0.b(Boolean.class), " is not supported"));
    }
}
