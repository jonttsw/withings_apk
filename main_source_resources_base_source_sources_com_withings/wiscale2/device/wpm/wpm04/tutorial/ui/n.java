package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.m;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class n extends w implements ym0.a<ProcessingTextInfo> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m.b f55886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m.b bVar) {
        super(0);
        this.f55886a = bVar;
    }

    @Override // ym0.a
    public final ProcessingTextInfo invoke() {
        m.b bVar = this.f55886a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ProcessingTextInfo.class);
        Fragment fragment = bVar.f55885b;
        if (isAssignableFrom) {
            return (ProcessingTextInfo) yq.b.d(fragment, "arg_info");
        }
        if (Serializable.class.isAssignableFrom(ProcessingTextInfo.class)) {
            return (ProcessingTextInfo) yq.b.e(fragment, "arg_info");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra arg_info of class ", q0.b(ProcessingTextInfo.class), " is not supported"));
    }
}
