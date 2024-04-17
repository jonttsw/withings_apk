package com.withings.device.details.wsd.programs.webradio;

import android.location.Location;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdWebRadioActivity.kt */
/* loaded from: classes3.dex */
public final class e extends w implements l<Location, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdWebRadioActivity f37303a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WsdWebRadioActivity wsdWebRadioActivity) {
        super(1);
        this.f37303a = wsdWebRadioActivity;
    }

    @Override // ym0.l
    public final y invoke(Location location) {
        Location location2 = location;
        if (location2 != null) {
            this.f37303a.f37289n = location2;
        }
        return y.f85009a;
    }
}
