package com.withings.wiscale2;

import android.content.Context;
import com.withings.device.Device;
import com.withings.device.ws.DeviceCredentials;
import zx.r;
/* compiled from: ApplicationProviderModule.kt */
/* loaded from: classes4.dex */
public final class d implements r.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f50483a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ kn.f f50484b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, e eVar) {
        this.f50483a = context;
        this.f50484b = eVar;
    }

    @Override // zx.r.a
    public final Device a(String str, DeviceCredentials deviceCredentials) {
        return new kn.a(this.f50483a, str, deviceCredentials, this.f50484b).call();
    }
}
