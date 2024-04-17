package com.withings.wiscale2.device.common.feature;

import android.content.Context;
import com.withings.device.Device;
import com.withings.devicescreens.device.SendDeviceScreensConversation;
import com.withings.screen.ktx.DeviceScreensRepositoryKt;
import com.withings.screen.model.DeviceScreen;
import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.DeviceScreensRepository;
import ej.w;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.collections.x;
import kotlinx.coroutines.BuildersKt__BuildersKt;
/* compiled from: DeviceScreenModifier.kt */
@Singleton
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: f */
    private static c f51053f;

    /* renamed from: a */
    private final Context f51054a;

    /* renamed from: b */
    private final DeviceScreensRepository f51055b;

    /* renamed from: c */
    private final m70.i f51056c;

    /* renamed from: d */
    private final kn.e f51057d;

    /* renamed from: e */
    private final w f51058e;

    @Inject
    public c(Context context, DeviceScreensRepository deviceScreensRepository, m70.i userManager, kn.e deviceManager, w wVar) {
        kotlin.jvm.internal.u.j(deviceScreensRepository, "deviceScreensRepository");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f51054a = context;
        this.f51055b = deviceScreensRepository;
        this.f51056c = userManager;
        this.f51057d = deviceManager;
        this.f51058e = wVar;
    }

    public static final /* synthetic */ void c(c cVar) {
        f51053f = cVar;
    }

    public final void d(int i11, Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        Long userId = device.getUserId();
        if (userId == null) {
            userId = Long.valueOf(this.f51056c.e().q());
        }
        long longValue = userId.longValue();
        List<DeviceScreensGroup> onceBlocking = DeviceScreensRepositoryKt.getOnceBlocking(this.f51055b, device.getId(), Long.valueOf(longValue));
        List<DeviceScreensGroup> list = onceBlocking;
        int i12 = 10;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (DeviceScreensGroup deviceScreensGroup : list) {
            List<DeviceScreen> screens = deviceScreensGroup.getScreens();
            ArrayList arrayList2 = new ArrayList(x.y(screens, i12));
            for (DeviceScreen deviceScreen : screens) {
                Long embeddedId = deviceScreen.getEmbeddedId();
                long j5 = longValue;
                long j11 = i11;
                if (embeddedId != null && embeddedId.longValue() == j11) {
                    deviceScreen = DeviceScreen.copy$default(deviceScreen, 0L, 0L, null, null, null, false, true, 0, null, null, 959, null);
                }
                arrayList2.add(deviceScreen);
                longValue = j5;
            }
            arrayList.add(DeviceScreensGroup.copy$default(deviceScreensGroup, 0L, null, arrayList2, null, 0L, 27, null));
            i12 = 10;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new b(this, device, longValue, onceBlocking, null), 1, null);
        e(device);
    }

    public final void e(Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        u70.i macAddress = device.getMacAddress();
        w wVar = this.f51058e;
        cj.b D = wVar.D(macAddress);
        if (D != null && D.n()) {
            Context context = this.f51054a;
            kotlin.jvm.internal.u.j(context, "context");
            SendDeviceScreensConversation.a aVar = (SendDeviceScreensConversation.a) ah.o.c(context, SendDeviceScreensConversation.a.class);
            kn.e c11 = kn.e.c();
            kotlin.jvm.internal.u.i(c11, "get(...)");
            wVar.u(jl.a.b(this.f51057d.d(device.getId())), new SendDeviceScreensConversation(c11, aVar.e(), aVar.K(), aVar.g(), aVar.N()), SendDeviceScreensConversation.class).r();
        }
    }
}
