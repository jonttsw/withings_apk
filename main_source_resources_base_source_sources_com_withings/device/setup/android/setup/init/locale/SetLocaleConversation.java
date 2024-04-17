package com.withings.device.setup.android.setup.init.locale;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.LocaleSet;
import java.util.Locale;
import kotlin.Metadata;
import nj.a;
import x70.b;
/* compiled from: SetLocaleConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/setup/android/setup/init/locale/SetLocaleConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetLocaleConversation extends WppDeviceConversation {
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        try {
            LocaleSet localeSet = new LocaleSet();
            localeSet.locale = Locale.getDefault().getLanguage();
            a aVar = new a(x());
            aVar.c((short) 282, localeSet);
            aVar.j();
        } catch (UnsupportedCommandException unused) {
            b.t(this, "Command CMD_LOCALE_SET not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }
}
