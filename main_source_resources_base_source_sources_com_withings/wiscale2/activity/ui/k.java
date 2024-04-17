package com.withings.wiscale2.activity.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.activity.ui.VasistasInfoActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class k extends w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity.u f48641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(VasistasInfoActivity.u uVar) {
        super(0);
        this.f48641a = uVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        VasistasInfoActivity.u uVar = this.f48641a;
        uVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Activity activity = uVar.f48612b;
        if (isAssignableFrom) {
            return (DateTime) b0.F(activity, "date");
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) b0.H(activity, "date");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra date of class ", q0.b(DateTime.class), " is not supported"));
    }
}
