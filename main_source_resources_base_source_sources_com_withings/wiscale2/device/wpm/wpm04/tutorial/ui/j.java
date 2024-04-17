package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ErrorInfo;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.i;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class j extends w implements ym0.a<ErrorInfo> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.c f55871a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i.c cVar) {
        super(0);
        this.f55871a = cVar;
    }

    @Override // ym0.a
    public final ErrorInfo invoke() {
        i.c cVar = this.f55871a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ErrorInfo.class);
        Fragment fragment = cVar.f55870b;
        if (isAssignableFrom) {
            return (ErrorInfo) yq.b.d(fragment, "arg_error");
        }
        if (Serializable.class.isAssignableFrom(ErrorInfo.class)) {
            return (ErrorInfo) yq.b.e(fragment, "arg_error");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra arg_error of class ", q0.b(ErrorInfo.class), " is not supported"));
    }
}
