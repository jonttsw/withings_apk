package com.withings.wiscale2.device.wam.conversation;

import a50.a;
import ah.o;
import android.content.Context;
import androidx.compose.material.h6;
import cj.b;
import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.comm.wpp.generated.object.TrackerGoal;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.WamAutoSleep;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.screen.settings.GetScreenSettingsConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.devicescreens.device.SendDeviceScreensConversation;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.data.LocalTargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.SendUserUnitsConversation;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.u;
/* loaded from: classes5.dex */
public class Wam01SetUserInfoConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f54835f;

    /* renamed from: g  reason: collision with root package name */
    private final Device f54836g;

    public Wam01SetUserInfoConversation(Device device, User user) {
        this.f54835f = user;
        this.f54836g = device;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new SendTimeConversation(e.a()));
        E(new SendUserUnitsConversation());
        E(new GetScreenSettingsConversation(kn.e.c()));
        User user = this.f54835f;
        TrackerUser g11 = a.g(user);
        int i11 = g11.birth;
        JsonObject a11 = Traces.a("set_tracker_user");
        h6.c((int) g11.weight, a11, "weight", (int) g11.height, "height");
        a11.addProperty(ConstantsWs.AUTHENTICATION_TYPE_BIRTHDATE, Integer.valueOf(i11));
        e.a().d(x(), a11);
        nj.a aVar = new nj.a(x());
        aVar.c((short) 1282, g11);
        aVar.j();
        Device device = this.f54836g;
        if (device != null) {
            Context context = r();
            u.j(context, "context");
            SendDeviceScreensConversation.a aVar2 = (SendDeviceScreensConversation.a) o.c(context, SendDeviceScreensConversation.a.class);
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            E(new SendDeviceScreensConversation(c11, aVar2.e(), aVar2.K(), aVar2.g(), aVar2.N()));
        }
        r();
        long j5 = x().i().softVersion;
        if (j5 == 0 || j5 >= 1501) {
            boolean F = user.F();
            WamAutoSleep wamAutoSleep = new WamAutoSleep();
            wamAutoSleep.autoSleep = F ? 1 : 0;
            nj.a aVar3 = new nj.a(x());
            aVar3.c((short) 1289, wamAutoSleep);
            aVar3.j();
        }
        LocaleSet localeSet = new LocaleSet();
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String locale2 = locale.toString();
        if (!locale2.equalsIgnoreCase(Locale.FRANCE.toString()) && !locale2.equalsIgnoreCase(Locale.ITALY.toString()) && ((!"en".equalsIgnoreCase(language) || !"EN".equalsIgnoreCase(country)) && ((!"es".equalsIgnoreCase(language) || !"ES".equalsIgnoreCase(country)) && (!"nl".equalsIgnoreCase(language) || !"NL".equalsIgnoreCase(country))))) {
            locale = new Locale("en", "US");
        }
        localeSet.locale = locale.getLanguage();
        if (device != null && device.getPreferredLanguage() != null) {
            localeSet.locale = device.getPreferredLanguage();
        }
        nj.a aVar4 = new nj.a(x());
        aVar4.c((short) 282, localeSet);
        aVar4.j();
        e a12 = e.a();
        b x11 = x();
        String str = localeSet.locale;
        JsonObject a13 = Traces.a("set_locale");
        a13.addProperty("locale", str);
        a12.d(x11, a13);
        r();
        long j11 = x().i().softVersion;
        if (j11 == 0 || j11 >= 2031) {
            TrackerGoal trackerGoal = new TrackerGoal();
            trackerGoal.goalType = 0;
            trackerGoal.value = LocalTargetRepository.get().getLastActiveStepsTargetOrDefault(user.q()).getAsInt();
            nj.a aVar5 = new nj.a(x());
            aVar5.c((short) 1290, trackerGoal);
            aVar5.j();
        }
    }
}
