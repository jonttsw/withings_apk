package com.withings.wiscale2.device.hwa09.conversation;

import androidx.compose.foundation.lazy.layout.d;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.h;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteRepository;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.k;
import com.withings.wiscale2.device.common.conversation.n;
import com.withings.wiscale2.device.common.conversation.t;
import com.withings.wiscale2.h1;
import com.withings.workout.category.model.WorkoutCategoryManager;
import dj.m;
import fl.p;
import fl.r;
import fy.v;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import vf.c;
import xb0.i;
import zh0.j;
/* compiled from: Hwa0910SyncConversation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/hwa09/conversation/Hwa0910SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lxb0/i$a;", "Lcom/withings/wiscale2/device/common/conversation/t$a;", "Lzh0/j$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa0910SyncConversation extends WppDeviceConversation implements i.a, t.a, j.a {

    /* renamed from: f  reason: collision with root package name */
    private final k f54517f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54518g;

    /* renamed from: h  reason: collision with root package name */
    private final ej0.b f54519h;

    /* renamed from: i  reason: collision with root package name */
    private final m70.i f54520i;

    /* renamed from: j  reason: collision with root package name */
    private final c f54521j;

    /* renamed from: k  reason: collision with root package name */
    private final WorkoutCategoryManager f54522k;

    /* renamed from: l  reason: collision with root package name */
    private final p f54523l;

    /* renamed from: m  reason: collision with root package name */
    private final oi0.b f54524m;

    /* renamed from: n  reason: collision with root package name */
    private final r f54525n;

    /* renamed from: o  reason: collision with root package name */
    private final HeartSignalRepository f54526o;

    /* renamed from: p  reason: collision with root package name */
    private final jq.k f54527p;

    /* renamed from: q  reason: collision with root package name */
    private final v f54528q;

    /* renamed from: r  reason: collision with root package name */
    private final ActivityAggregateManager f54529r;

    /* renamed from: s  reason: collision with root package name */
    private final NoteRepository f54530s;

    /* renamed from: t  reason: collision with root package name */
    private final i f54531t;

    /* renamed from: u  reason: collision with root package name */
    private final g f54532u;

    /* renamed from: v  reason: collision with root package name */
    private VasistasSyncConversation f54533v;

    /* renamed from: w  reason: collision with root package name */
    private VasistasSyncConversation f54534w;

    public Hwa0910SyncConversation(n nVar, e eVar, ej0.b bVar, m70.i iVar, c cVar, WorkoutCategoryManager workoutCategoryManager, p pVar, oi0.b bVar2, NoteRepository noteRepository, int i11) {
        NoteRepository noteRepository2;
        r hrThresholdsRepository = ((h1) h.a.a()).a();
        HeartSignalRepository heartSignalRepository = d.f4443b;
        if (heartSignalRepository != null) {
            jq.k kVar = d.f4445d;
            if (kVar != null) {
                WiscaleDBH f11 = WiscaleDBH.f();
                u.i(f11, "get(...)");
                sw.a z5 = sw.a.z();
                u.i(z5, "get(...)");
                v vVar = new v(new zx.v(z5), f11, zx.j.f111082d.a());
                ActivityAggregateManager activityAggregateManager = ActivityAggregateManager.Companion.get();
                if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                    noteRepository2 = ah.i.f781a;
                    if (noteRepository2 == null) {
                        u.s("noteRepository");
                        throw null;
                    }
                } else {
                    noteRepository2 = noteRepository;
                }
                u.j(hrThresholdsRepository, "hrThresholdsRepository");
                u.j(activityAggregateManager, "activityAggregateManager");
                u.j(noteRepository2, "noteRepository");
                this.f54517f = nVar;
                this.f54518g = eVar;
                this.f54519h = bVar;
                this.f54520i = iVar;
                this.f54521j = cVar;
                this.f54522k = workoutCategoryManager;
                this.f54523l = pVar;
                this.f54524m = bVar2;
                this.f54525n = hrThresholdsRepository;
                this.f54526o = heartSignalRepository;
                this.f54527p = kVar;
                this.f54528q = vVar;
                this.f54529r = activityAggregateManager;
                this.f54530s = noteRepository2;
                this.f54531t = new i(new int[]{1, 10, 10, 10, 10, 2, 10, 50, 5, 50, 5, 20, 5, 30, 5}, this);
                this.f54532u = nm0.h.b(new b(this));
                return;
            }
            u.s("signalSyncNotifier");
            throw null;
        }
        u.s("heartSignalRepository");
        throw null;
    }

    public static final void L(Hwa0910SyncConversation hwa0910SyncConversation, double d11) {
        hwa0910SyncConversation.f54531t.b((float) d11);
    }

    private final VasistasSyncConversation M(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.BODY, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54517f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.i(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54534w = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    private final VasistasSyncConversation N(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.MOTION, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54517f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54533v = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    private final VasistasSyncConversation O(User user) {
        boolean z5;
        cj.b x11 = x();
        u.i(x11, "getWppDevice(...)");
        if ((this.f54523l.f(x11) instanceof hd0.a) && x().i().softVersion <= 2291) {
            z5 = true;
        } else {
            z5 = false;
        }
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.MOTION, 4, z5, 376);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54517f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        return vasistasSyncConversation;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0419  */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() throws java.io.IOException, com.withings.comm.remote.conversation.ConversationException, com.withings.comm.remote.conversation.WaitForInput.CancelException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.hwa09.conversation.Hwa0910SyncConversation.D():void");
    }

    @Override // zh0.j.a
    public final boolean b() {
        VasistasSyncConversation vasistasSyncConversation = this.f54533v;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // zh0.j.a
    public final boolean l() {
        VasistasSyncConversation vasistasSyncConversation = this.f54534w;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // xb0.i.a
    public final void m(float f11) {
        ((dj.t) this.f54532u.getValue()).onEvent(new m(x(), (int) (100 * f11)));
        k kVar = this.f54517f;
        if (kVar != null) {
            kVar.b(this, f11);
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.t.a
    public final void n(VasistasSyncConversation syncConversation, float f11) {
        u.j(syncConversation, "syncConversation");
        this.f54531t.b(f11);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
