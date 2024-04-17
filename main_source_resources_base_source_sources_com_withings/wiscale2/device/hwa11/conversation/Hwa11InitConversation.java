package com.withings.wiscale2.device.hwa11.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.common.device.h;
import com.withings.device.Device;
import com.withings.device.setup.android.setup.init.locale.SetLocaleConversation;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenInitConversation;
import com.withings.wiscale2.h1;
import com.withings.workout.category.model.WorkoutCategoryManager;
import fl.p;
import fl.r;
import gl.z;
import java.util.List;
import java.util.Locale;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import vf.c;
import ym0.l;
/* compiled from: Hwa11InitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa11/conversation/Hwa11InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa11InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f54591f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54592g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54593h;

    /* renamed from: i  reason: collision with root package name */
    private final c f54594i;

    /* renamed from: j  reason: collision with root package name */
    private final rg.b f54595j;

    /* renamed from: k  reason: collision with root package name */
    private final WorkoutCategoryManager f54596k;

    /* renamed from: l  reason: collision with root package name */
    private final p f54597l;

    /* renamed from: m  reason: collision with root package name */
    private final r f54598m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f54599n;

    /* compiled from: Hwa11InitConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements l<LocaleSet, y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(LocaleSet localeSet) {
            LocaleSet localeSet2 = localeSet;
            Hwa11InitConversation hwa11InitConversation = Hwa11InitConversation.this;
            hwa11InitConversation.E(new WorkoutScreenInitConversation(hwa11InitConversation.f54597l, hwa11InitConversation.f54596k, localeSet2));
            if (localeSet2 == null || !u.e(Locale.getDefault().getLanguage(), localeSet2.locale)) {
                hwa11InitConversation.E(new SetLocaleConversation());
            }
            return y.f85009a;
        }
    }

    /* compiled from: Hwa11InitConversation.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.p<Long, z, List<? extends WppDeviceConversation>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f54602b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Device device) {
            super(2);
            this.f54602b = device;
        }

        @Override // ym0.p
        public final List<? extends WppDeviceConversation> invoke(Long l5, z zVar) {
            long longValue = l5.longValue();
            z deviceModel = zVar;
            u.j(deviceModel, "deviceModel");
            Context r7 = Hwa11InitConversation.this.r();
            u.i(r7, "getContext(...)");
            return deviceModel.d0(r7, longValue, this.f54602b.getId());
        }
    }

    public Hwa11InitConversation(User user, e eVar, c cVar, rg.b bVar, WorkoutCategoryManager workoutCategoryManager, p deviceModelFactory, boolean z5, int i11) {
        r hrThresholdsRepository = ((h1) h.a.a()).a();
        z5 = (i11 & 256) != 0 ? false : z5;
        u.j(workoutCategoryManager, "workoutCategoryManager");
        u.j(deviceModelFactory, "deviceModelFactory");
        u.j(hrThresholdsRepository, "hrThresholdsRepository");
        this.f54591f = user;
        this.f54592g = true;
        this.f54593h = eVar;
        this.f54594i = cVar;
        this.f54595j = bVar;
        this.f54596k = workoutCategoryManager;
        this.f54597l = deviceModelFactory;
        this.f54598m = hrThresholdsRepository;
        this.f54599n = z5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:3|(17:5|6|(1:8)(1:48)|9|(1:11)|12|(2:13|(3:15|(2:20|21)(1:23)|22)(1:25))|26|(2:29|27)|30|31|32|33|34|(2:36|(1:38))|39|(2:41|42)(1:44)))|49|6|(0)(0)|9|(0)|12|(3:13|(0)(0)|22)|26|(1:27)|30|31|32|33|34|(0)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015e, code lost:
        r4 = x().g();
        x70.b.f(r18, r0, "GetGlanceSettingConversation is not supported for " + r4, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119 A[LOOP:1: B:25:0x0113->B:27:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f A[EDGE_INSN: B:46:0x010f->B:24:0x010f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.hwa11.conversation.Hwa11InitConversation.D():void");
    }
}
