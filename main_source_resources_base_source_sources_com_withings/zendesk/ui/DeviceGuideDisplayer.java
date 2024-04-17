package com.withings.zendesk.ui;

import android.content.Context;
import android.content.Intent;
import ch.l;
import com.withings.common.device.r;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.zendesk.models.ZendeskDevice;
import com.withings.zendesk.models.ZendeskStatic;
import com.withings.zendesk.repositories.data.ZendeskManager;
import com.withings.zendesk.ui.HelpCenterActivity;
import fl.o;
import fl.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import zg.c;
/* compiled from: DeviceGuideDisplayer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/withings/zendesk/ui/DeviceGuideDisplayer;", "", "Lch/l;", "webIntentBuilder", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/device/Device;", "device", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Landroid/content/Intent;", "getZendeskIntent", "(Lch/l;Landroid/content/Context;Lcom/withings/device/Device;Lcom/withings/user/User;)Landroid/content/Intent;", "<init>", "()V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceGuideDisplayer {
    public static final int $stable = 0;
    public static final DeviceGuideDisplayer INSTANCE = new DeviceGuideDisplayer();

    private DeviceGuideDisplayer() {
    }

    public static final Intent getZendeskIntent(l webIntentBuilder, Context context, Device device) {
        u.j(webIntentBuilder, "webIntentBuilder");
        u.j(context, "context");
        u.j(device, "device");
        return getZendeskIntent$default(webIntentBuilder, context, device, null, 8, null);
    }

    public static /* synthetic */ Intent getZendeskIntent$default(l lVar, Context context, Device device, User user, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            user = null;
        }
        return getZendeskIntent(lVar, context, device, user);
    }

    public static final Intent getZendeskIntent(l webIntentBuilder, Context context, Device device, User user) {
        List<ZendeskDevice> devices;
        Object obj;
        User user2;
        u.j(webIntentBuilder, "webIntentBuilder");
        u.j(context, "context");
        u.j(device, "device");
        o d11 = p.f67672b.a().d(device.getModelId());
        ZendeskStatic zendeskStatic = ZendeskManager.INSTANCE.get(context);
        if (zendeskStatic != null && (devices = zendeskStatic.getDevices()) != null) {
            Iterator<T> it = devices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ZendeskDevice) obj).getModelId() == device.getModelId()) {
                    break;
                }
            }
            ZendeskDevice zendeskDevice = (ZendeskDevice) obj;
            if (zendeskDevice != null) {
                if (user == null) {
                    Long userId = device.getUserId();
                    user2 = userId != null ? i.b().i(userId.longValue()) : null;
                } else {
                    user2 = user;
                }
                String string = context.getString(d11.I(null));
                u.i(string, "getString(...)");
                String str = "MAC: " + device.getMacAddress() + " ● FW: " + device.getFirmware();
                String string2 = context.getString(d11.E(null));
                u.i(string2, "getString(...)");
                int a02 = d11.a0();
                DevicePictures pictures = device.getPictures();
                String url = pictures != null ? pictures.getUrl(2) : null;
                if (url == null) {
                    url = "";
                }
                Intent createIntent$default = HelpCenterActivity.Companion.createIntent$default(HelpCenterActivity.Companion, context, new ProductHelpCenter(string, str, string2, a02, url, Long.parseLong(zendeskDevice.getCategory()), Long.parseLong(zendeskDevice.getSection()), user2 != null ? c.a.f110626a.f(context, device, user2) : null), null, 4, null);
                if (createIntent$default != null) {
                    return createIntent$default;
                }
            }
        }
        String name = device.getName();
        u.i(name, "getName(...)");
        return r.a(webIntentBuilder, context, d11, name);
    }
}
