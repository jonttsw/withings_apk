package com.withings.common.device;

import androidx.lifecycle.g1;
import androidx.lifecycle.k0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.DeviceSettingsConversation;
import com.withings.device.Device;
import ej.w;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: DeviceSettingsActivity.kt */
/* loaded from: classes3.dex */
final class p extends g1 implements DeviceSettingsConversation.a {

    /* renamed from: a  reason: collision with root package name */
    private final WppDeviceConversation f35232a;

    /* renamed from: b  reason: collision with root package name */
    private final k0<Boolean> f35233b;

    /* renamed from: c  reason: collision with root package name */
    private final xw.n<y> f35234c;

    /* renamed from: d  reason: collision with root package name */
    private final xw.n<y> f35235d;

    /* renamed from: e  reason: collision with root package name */
    private final ej.k<? extends DeviceSettingsConversation> f35236e;

    public p(w wVar, Device device, WppDeviceConversation conversation) {
        u.j(device, "device");
        u.j(conversation, "conversation");
        this.f35232a = conversation;
        this.f35233b = xw.d.b(Boolean.FALSE);
        this.f35234c = new xw.n<>();
        this.f35235d = new xw.n<>();
        ej.k<? extends DeviceSettingsConversation> u11 = wVar.u(jl.a.b(device), new DeviceSettingsConversation(conversation, this), DeviceSettingsConversation.class);
        this.f35236e = u11;
        u11.r();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        this.f35234c.postValue(null);
    }

    public final xw.n<y> f0() {
        return this.f35235d;
    }

    public final xw.n<y> g0() {
        return this.f35234c;
    }

    public final k0<Boolean> i0() {
        return this.f35233b;
    }

    @Override // com.withings.common.device.DeviceSettingsConversation.a
    public final void k3() {
        this.f35235d.postValue(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f35236e.k();
        this.f35232a.p();
    }

    @Override // com.withings.common.device.DeviceSettingsConversation.a
    public final void w() {
        this.f35233b.postValue(Boolean.TRUE);
    }
}
