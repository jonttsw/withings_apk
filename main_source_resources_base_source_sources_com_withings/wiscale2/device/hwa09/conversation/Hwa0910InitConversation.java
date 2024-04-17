package com.withings.wiscale2.device.hwa09.conversation;

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
import l70.w;
import nm0.y;
import vf.c;
import ym0.l;
/* compiled from: Hwa0910InitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa09/conversation/Hwa0910InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa0910InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f54504f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54505g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54506h;

    /* renamed from: i  reason: collision with root package name */
    private final c f54507i;

    /* renamed from: j  reason: collision with root package name */
    private final rg.b f54508j;

    /* renamed from: k  reason: collision with root package name */
    private final WorkoutCategoryManager f54509k;

    /* renamed from: l  reason: collision with root package name */
    private final p f54510l;

    /* renamed from: m  reason: collision with root package name */
    private final r f54511m;

    /* renamed from: n  reason: collision with root package name */
    private final w f54512n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f54513o;

    /* compiled from: Hwa0910InitConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements l<LocaleSet, y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(LocaleSet localeSet) {
            LocaleSet localeSet2 = localeSet;
            Hwa0910InitConversation hwa0910InitConversation = Hwa0910InitConversation.this;
            hwa0910InitConversation.E(new WorkoutScreenInitConversation(hwa0910InitConversation.f54510l, hwa0910InitConversation.f54509k, localeSet2));
            if (localeSet2 == null || !u.e(Locale.getDefault().getLanguage(), localeSet2.locale)) {
                hwa0910InitConversation.E(new SetLocaleConversation());
            }
            return y.f85009a;
        }
    }

    /* compiled from: Hwa0910InitConversation.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<Long, z, List<? extends WppDeviceConversation>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f54516b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Device device) {
            super(2);
            this.f54516b = device;
        }

        @Override // ym0.p
        public final List<? extends WppDeviceConversation> invoke(Long l5, z zVar) {
            long longValue = l5.longValue();
            z deviceModel = zVar;
            u.j(deviceModel, "deviceModel");
            Context r7 = Hwa0910InitConversation.this.r();
            u.i(r7, "getContext(...)");
            return deviceModel.d0(r7, longValue, this.f54516b.getId());
        }
    }

    public Hwa0910InitConversation(User user, e eVar, c cVar, rg.b bVar, WorkoutCategoryManager workoutCategoryManager, p deviceModelFactory, r hrThresholdsRepository, boolean z5, int i11) {
        hrThresholdsRepository = (i11 & 128) != 0 ? ((h1) h.a.a()).a() : hrThresholdsRepository;
        w a11 = w.a.a();
        z5 = (i11 & 512) != 0 ? false : z5;
        u.j(workoutCategoryManager, "workoutCategoryManager");
        u.j(deviceModelFactory, "deviceModelFactory");
        u.j(hrThresholdsRepository, "hrThresholdsRepository");
        this.f54504f = user;
        this.f54505g = true;
        this.f54506h = eVar;
        this.f54507i = cVar;
        this.f54508j = bVar;
        this.f54509k = workoutCategoryManager;
        this.f54510l = deviceModelFactory;
        this.f54511m = hrThresholdsRepository;
        this.f54512n = a11;
        this.f54513o = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b A[LOOP:1: B:28:0x0125->B:30:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[EDGE_INSN: B:42:0x0121->B:27:0x0121 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.hwa09.conversation.Hwa0910InitConversation.D():void");
    }
}
