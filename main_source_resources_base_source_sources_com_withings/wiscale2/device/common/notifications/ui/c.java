package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.C1987R;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f52840a = new s1.a(false, -1271420219, a.f52841a);

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f52841a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
            s0.b item = bVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(item, "$this$item");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(androidx.compose.foundation.layout.x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.a()), ay.b.u(C1987R.string.notifications_device_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 124);
            }
            return nm0.y.f85009a;
        }
    }
}
