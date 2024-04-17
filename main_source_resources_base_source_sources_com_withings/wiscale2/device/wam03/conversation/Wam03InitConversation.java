package com.withings.wiscale2.device.wam03.conversation;

import ah.o;
import android.content.Context;
import androidx.camera.camera2.internal.q;
import com.withings.alarm.conversation.GetAlarmSettingsConversation;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.common.device.conversation.GetLocaleConversation;
import com.withings.device.setup.android.setup.init.clockmode.ClockModeConversation;
import com.withings.device.setup.android.setup.init.glance.GetGlanceSettingConversation;
import com.withings.device.setup.android.setup.init.locale.SetLocaleConversation;
import com.withings.device.setup.android.setup.init.screen.settings.GetScreenSettingsConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.devicescreens.device.SendDeviceScreensConversation;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.GetAndSaveAlarmsConversation;
import com.withings.wiscale2.device.common.conversation.GetLuminosityLevelConversation;
import com.withings.wiscale2.device.common.conversation.SendDistanceUnitConversation;
import com.withings.wiscale2.device.common.conversation.SendStepGoalConversation;
import com.withings.wiscale2.device.common.conversation.SendTrackerUserAndSecretConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenInitConversation;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fl.p;
import java.util.Locale;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import rg.b;
/* compiled from: Wam03InitConversation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/wam03/conversation/Wam03InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/common/device/conversation/GetLocaleConversation$b;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam03InitConversation extends WppDeviceConversation implements GetLocaleConversation.b {

    /* renamed from: f  reason: collision with root package name */
    private final User f54947f;

    /* renamed from: g  reason: collision with root package name */
    private final p f54948g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54949h;

    /* renamed from: i  reason: collision with root package name */
    private final b f54950i;

    /* renamed from: j  reason: collision with root package name */
    private final WorkoutCategoryManager f54951j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f54952k;

    public Wam03InitConversation(User user) {
        p a11 = p.f67672b.a();
        e c11 = e.c();
        u.i(c11, "get(...)");
        b b10 = b.b();
        u.i(b10, "get(...)");
        WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
        u.i(workoutCategoryManager, "get(...)");
        this.f54947f = user;
        this.f54948g = a11;
        this.f54949h = c11;
        this.f54950i = b10;
        this.f54951j = workoutCategoryManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        boolean z5 = this.f54952k;
        User user = this.f54947f;
        e eVar = this.f54949h;
        E(new SendTrackerUserAndSecretConversation(user, eVar, z5));
        E(new SendStepGoalConversation(user));
        E(new SendDistanceUnitConversation());
        E(new ClockModeConversation());
        E(new GetLuminosityLevelConversation());
        E(new GetAlarmSettingsConversation());
        E(new GetAndSaveAlarmsConversation(eVar, this.f54950i));
        E(new GetScreenSettingsConversation(eVar));
        Context r7 = r();
        u.i(r7, "getContext(...)");
        SendDeviceScreensConversation.a aVar = (SendDeviceScreensConversation.a) o.c(r7, SendDeviceScreensConversation.a.class);
        e c11 = e.c();
        u.i(c11, "get(...)");
        E(new SendDeviceScreensConversation(c11, aVar.e(), aVar.K(), aVar.g(), aVar.N()));
        E(new GetLocaleConversation(this));
        try {
            E(new GetGlanceSettingConversation(eVar));
        } catch (UnsupportedCommandException unused) {
            x70.b.d(this, q.c("Glance Setting is not supported on this device fw:", x().i().softVersion), new Object[0]);
        }
    }

    public final void L() {
        this.f54952k = true;
    }

    @Override // com.withings.common.device.conversation.GetLocaleConversation.b
    public final void g(LocaleSet localeSet) {
        if (localeSet == null || !u.e(Locale.getDefault().getLanguage(), localeSet.locale)) {
            E(new SetLocaleConversation());
        }
        E(new WorkoutScreenInitConversation(this.f54948g, this.f54951j, localeSet));
    }
}
