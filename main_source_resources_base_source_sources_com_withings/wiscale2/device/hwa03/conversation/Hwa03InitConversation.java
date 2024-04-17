package com.withings.wiscale2.device.hwa03.conversation;

import ah.o;
import ah.t;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.appcompat.view.menu.d;
import com.withings.alarm.conversation.GetAlarmSettingsConversation;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.Alarm;
import com.withings.comm.wpp.generated.object.AlarmEnabled;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.comm.wpp.generated.object.LuminosityLevel;
import com.withings.comm.wpp.generated.object.ProgramSetting;
import com.withings.comm.wpp.generated.object.TrackerGoal;
import com.withings.comm.wpp.generated.object.TrackerUser;
import com.withings.comm.wpp.generated.object.UserSecret;
import com.withings.comm.wpp.generated.object.UserUnit;
import com.withings.comm.wpp.h;
import com.withings.common.device.conversation.GetLocaleConversation;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.screen.settings.GetScreenSettingsConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.devicescreens.device.SendDeviceScreensConversation;
import com.withings.target.data.LocalTargetRepository;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenInitConversation;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fl.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import l70.v;
import l70.w;
import xc0.i;
/* compiled from: Hwa03InitConversation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/hwa03/conversation/Hwa03InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/common/device/conversation/GetLocaleConversation$b;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa03InitConversation extends WppDeviceConversation implements GetLocaleConversation.b {

    /* renamed from: f  reason: collision with root package name */
    private final User f54213f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54214g;

    /* renamed from: h  reason: collision with root package name */
    private final p f54215h;

    /* renamed from: i  reason: collision with root package name */
    private final w f54216i;

    /* renamed from: j  reason: collision with root package name */
    private final WorkoutCategoryManager f54217j;

    /* renamed from: k  reason: collision with root package name */
    private final rg.b f54218k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f54219l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Hwa03InitConversation(User user) {
        this(user, 0);
        u.j(user, "user");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r3v14, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r3v19, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        Object runBlocking$default;
        int i11;
        int i12;
        boolean z5 = false;
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        User user = this.f54213f;
        TrackerUser g11 = a50.a.g(user);
        boolean z11 = this.f54219l;
        e eVar = this.f54214g;
        if (z11) {
            x().u();
            Device f11 = eVar.f(v());
            u.g(f11);
            UserSecret w11 = t.w(f11);
            nj.a aVar = new nj.a(x());
            aVar.c((short) 1282, g11, w11);
            aVar.j();
        } else {
            nj.a aVar2 = new nj.a(x());
            aVar2.c((short) 1282, g11);
            aVar2.j();
        }
        int asInt = LocalTargetRepository.Companion.get().getLastActiveStepsTargetOrDefault(user.q()).getAsInt();
        TrackerGoal trackerGoal = new TrackerGoal();
        trackerGoal.goalType = 0;
        trackerGoal.value = asInt;
        nj.a aVar3 = new nj.a(x());
        aVar3.c((short) 1290, trackerGoal);
        aVar3.j();
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a(this, null), 1, null);
        int b10 = ((v) runBlocking$default).b();
        nj.a aVar4 = new nj.a(x());
        UserUnit userUnit = new UserUnit();
        userUnit.cmd = (short) 0;
        userUnit.type = 2;
        if (b10 != 6) {
            i11 = 25;
        } else {
            i11 = 24;
        }
        userUnit.unit = i11;
        aVar4.c((short) 274, userUnit);
        aVar4.j();
        boolean is24HourFormat = DateFormat.is24HourFormat(r());
        nj.a aVar5 = new nj.a(x());
        UserUnit userUnit2 = new UserUnit();
        userUnit2.cmd = (short) 0;
        userUnit2.type = 4;
        if (is24HourFormat) {
            i12 = 26;
        } else {
            i12 = 27;
        }
        userUnit2.unit = i12;
        aVar5.c((short) 274, userUnit2);
        aVar5.j();
        Object e11 = x().e();
        u.h(e11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.wpp.WppDeviceInfoHolder");
        i iVar = (i) e11;
        ?? aVar6 = new nj.a(x());
        aVar6.c((short) 2370, new h[0]);
        LuminosityLevel luminosityLevel = (LuminosityLevel) aVar6.y(LuminosityLevel.class);
        E(new GetAlarmSettingsConversation());
        E(new GetScreenSettingsConversation(eVar));
        Device f12 = eVar.f(v());
        ?? aVar7 = new nj.a(x());
        aVar7.c((short) 293, new h[0]);
        aVar7.j();
        ArrayList arrayList = new ArrayList();
        for (h hVar : aVar7.D().d()) {
            if (hVar instanceof Alarm) {
                qj.a aVar8 = new qj.a();
                aVar8.d(new ArrayList());
                aVar8.c((Alarm) hVar);
                arrayList.add(aVar8);
            } else if (hVar instanceof ProgramSetting) {
                ((qj.a) d.d(arrayList, 1)).b().add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        long id2 = f12.getId();
        rg.b bVar = this.f54218k;
        bVar.a(id2);
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            i13++;
            arrayList2.add(qg.e.d(f12, (qj.a) arrayList.get(i13), (short) i13));
        }
        bVar.h(r(), f12, arrayList2);
        try {
            ?? aVar9 = new nj.a(x());
            aVar9.c((short) 2330, new h[0]);
            if (((AlarmEnabled) aVar9.y(AlarmEnabled.class)).state == 1) {
                z5 = true;
            }
            f12.setAlarmsEnabled(z5);
            eVar.t(f12);
        } catch (UnsupportedCommandException unused) {
        }
        Context r7 = r();
        u.i(r7, "getContext(...)");
        SendDeviceScreensConversation.a aVar10 = (SendDeviceScreensConversation.a) o.c(r7, SendDeviceScreensConversation.a.class);
        e c11 = e.c();
        u.i(c11, "get(...)");
        E(new SendDeviceScreensConversation(c11, aVar10.e(), aVar10.K(), aVar10.g(), aVar10.N()));
        E(new GetLocaleConversation(this));
    }

    public final void M() {
        this.f54219l = true;
    }

    @Override // com.withings.common.device.conversation.GetLocaleConversation.b
    public final void g(LocaleSet localeSet) throws IOException, InterruptedException, ConversationException, WaitForInput.CancelException {
        E(new WorkoutScreenInitConversation(this.f54215h, this.f54217j, localeSet));
        if (localeSet == null || !u.e(Locale.getDefault().getLanguage(), localeSet.locale)) {
            try {
                LocaleSet localeSet2 = new LocaleSet();
                localeSet2.locale = Locale.getDefault().getLanguage();
                nj.a aVar = new nj.a(x());
                aVar.c((short) 282, localeSet2);
                aVar.j();
            } catch (UnsupportedCommandException unused) {
                x70.b.t(this, "Command CMD_LOCALE_SET not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
            }
        }
    }

    public Hwa03InitConversation(User user, int i11) {
        e c11 = e.c();
        u.i(c11, "get(...)");
        p a11 = p.f67672b.a();
        w a12 = w.a.a();
        WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
        u.i(workoutCategoryManager, "get(...)");
        rg.b b10 = rg.b.b();
        u.i(b10, "get(...)");
        u.j(user, "user");
        this.f54213f = user;
        this.f54214g = c11;
        this.f54215h = a11;
        this.f54216i = a12;
        this.f54217j = workoutCategoryManager;
        this.f54218k = b10;
    }
}
