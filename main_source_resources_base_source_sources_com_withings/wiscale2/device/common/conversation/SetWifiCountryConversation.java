package com.withings.wiscale2.device.common.conversation;

import android.text.TextUtils;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WifiCountry;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.withings.api.AccountApi;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: SetWifiCountryConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/SetWifiCountryConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SetWifiCountryConversation extends WppDeviceConversation {
    /* JADX WARN: Type inference failed for: r1v9, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        try {
            String country = ((AccountApi) Webservices.get().getApiForAccount(AccountApi.class)).getGeoIp().country;
            kotlin.jvm.internal.u.i(country, "country");
            WifiCountry wifiCountry = new WifiCountry();
            wifiCountry.f33283rc = (byte) 0;
            wifiCountry.cmd = (byte) 0;
            if (TextUtils.isEmpty(country) || dp0.j.x("??", country)) {
                country = Locale.getDefault().getCountry();
            }
            wifiCountry.country = country;
            ?? aVar = new nj.a(x());
            aVar.c((short) 264, wifiCountry);
            aVar.y(WifiCountry.class);
        } catch (Exception e11) {
            throw new IOException("Unable to get geo ip", e11);
        }
    }
}
