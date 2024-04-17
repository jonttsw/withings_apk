package com.withings.devicescreens.device;

import fl.o;
import fl.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: SendDeviceScreensConversation.kt */
/* loaded from: classes3.dex */
final class a extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SendDeviceScreensConversation f37688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SendDeviceScreensConversation sendDeviceScreensConversation) {
        super(0);
        this.f37688a = sendDeviceScreensConversation;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        p pVar;
        up.a aVar;
        SendDeviceScreensConversation sendDeviceScreensConversation = this.f37688a;
        pVar = sendDeviceScreensConversation.f37687j;
        cj.b x11 = sendDeviceScreensConversation.x();
        u.i(x11, "getWppDevice(...)");
        u.j(pVar, "<this>");
        o f11 = pVar.f(x11);
        if (f11 instanceof up.a) {
            aVar = (up.a) f11;
        } else {
            aVar = null;
        }
        boolean z5 = false;
        if (aVar != null && aVar.d(x11.i().softVersion)) {
            z5 = true;
        }
        return Boolean.valueOf(!z5);
    }
}
