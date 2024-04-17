package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.manualLogging.ui.feature.addNote.cycle.CycleOnBoardingManualLoggingActivity;
import java.io.Serializable;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class d3 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleOnBoardingManualLoggingActivity.c f40983a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(CycleOnBoardingManualLoggingActivity.c cVar) {
        super(0);
        this.f40983a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        CycleOnBoardingManualLoggingActivity.c cVar = this.f40983a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = cVar.f40805b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, DiscoverItems.Item.UPDATE_ACTION);
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, DiscoverItems.Item.UPDATE_ACTION);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra update of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
