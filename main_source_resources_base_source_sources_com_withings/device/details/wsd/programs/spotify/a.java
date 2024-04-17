package com.withings.device.details.wsd.programs.spotify;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.device.Device;
import com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class a extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdSpotifyActivity.d f37274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WsdSpotifyActivity.d dVar) {
        super(0);
        this.f37274a = dVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        WsdSpotifyActivity.d dVar = this.f37274a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = dVar.f37271b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
