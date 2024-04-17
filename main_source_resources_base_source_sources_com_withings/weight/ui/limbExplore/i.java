package com.withings.weight.ui.limbExplore;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.weight.ui.limbExplore.SegmentalLimbExploreActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity.e f47691a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SegmentalLimbExploreActivity.e eVar) {
        super(0);
        this.f47691a = eVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        SegmentalLimbExploreActivity.e eVar = this.f47691a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = eVar.f47658b;
        if (isAssignableFrom) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", q0.b(DateTime.class), " is not supported"));
    }
}
