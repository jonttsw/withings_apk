package com.withings.wiscale2.device.common.handcalibration;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.device.common.handcalibration.a;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class e extends w implements ym0.a<HandCalibration> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a.b f52697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a.b bVar) {
        super(0);
        this.f52697a = bVar;
    }

    @Override // ym0.a
    public final HandCalibration invoke() {
        a.b bVar = this.f52697a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(HandCalibration.class);
        Fragment fragment = bVar.f52690b;
        if (isAssignableFrom) {
            return (HandCalibration) yq.b.d(fragment, "handCalibration");
        }
        if (Serializable.class.isAssignableFrom(HandCalibration.class)) {
            return (HandCalibration) yq.b.e(fragment, "handCalibration");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra handCalibration of class ", q0.b(HandCalibration.class), " is not supported"));
    }
}
