package com.withings.common.device;

import com.withings.device.ws.DeviceApi;
import com.withings.device.ws.SharePublicKey;
import com.withings.user.User;
import com.withings.webservices.legacy.Webservices;
/* compiled from: GetPublicKeyForDevice.kt */
/* loaded from: classes3.dex */
public final class q implements vh.m<SharePublicKey> {

    /* renamed from: a  reason: collision with root package name */
    private final User f35237a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35238b;

    public q(long j5, User user) {
        this.f35237a = user;
        this.f35238b = j5;
    }

    @Override // vh.m
    /* renamed from: a */
    public final SharePublicKey call() {
        return ((DeviceApi) Webservices.get().getApiForAccount(DeviceApi.class)).createPublicKey(this.f35237a.q(), this.f35238b);
    }
}
