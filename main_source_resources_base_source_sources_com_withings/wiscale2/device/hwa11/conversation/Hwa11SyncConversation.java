package com.withings.wiscale2.device.hwa11.conversation;

import androidx.compose.foundation.lazy.layout.d;
import com.withings.comm.remote.conversation.WppDeviceConversation;
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
import com.withings.workout.category.model.WorkoutCategoryManager;
import dj.m;
import fl.p;
import fy.v;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import vf.c;
import xb0.i;
import zh0.j;
/* compiled from: Hwa11SyncConversation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/hwa11/conversation/Hwa11SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lxb0/i$a;", "Lcom/withings/wiscale2/device/common/conversation/t$a;", "Lzh0/j$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa11SyncConversation extends WppDeviceConversation implements i.a, t.a, j.a {

    /* renamed from: f  reason: collision with root package name */
    private final k f54603f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54604g;

    /* renamed from: h  reason: collision with root package name */
    private final ej0.b f54605h;

    /* renamed from: i  reason: collision with root package name */
    private final m70.i f54606i;

    /* renamed from: j  reason: collision with root package name */
    private final c f54607j;

    /* renamed from: k  reason: collision with root package name */
    private final WorkoutCategoryManager f54608k;

    /* renamed from: l  reason: collision with root package name */
    private final p f54609l;

    /* renamed from: m  reason: collision with root package name */
    private final oi0.b f54610m;

    /* renamed from: n  reason: collision with root package name */
    private final HeartSignalRepository f54611n;

    /* renamed from: o  reason: collision with root package name */
    private final jq.k f54612o;

    /* renamed from: p  reason: collision with root package name */
    private final v f54613p;

    /* renamed from: q  reason: collision with root package name */
    private final ActivityAggregateManager f54614q;

    /* renamed from: r  reason: collision with root package name */
    private final NoteRepository f54615r;

    /* renamed from: s  reason: collision with root package name */
    private final i f54616s;

    /* renamed from: t  reason: collision with root package name */
    private final g f54617t;

    /* renamed from: u  reason: collision with root package name */
    private VasistasSyncConversation f54618u;

    /* renamed from: v  reason: collision with root package name */
    private VasistasSyncConversation f54619v;

    public Hwa11SyncConversation(n nVar, e eVar, ej0.b bVar, m70.i iVar, c cVar, WorkoutCategoryManager workoutCategoryManager, p pVar, oi0.b bVar2) {
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
                NoteRepository noteRepository = ah.i.f781a;
                if (noteRepository != null) {
                    u.j(activityAggregateManager, "activityAggregateManager");
                    this.f54603f = nVar;
                    this.f54604g = eVar;
                    this.f54605h = bVar;
                    this.f54606i = iVar;
                    this.f54607j = cVar;
                    this.f54608k = workoutCategoryManager;
                    this.f54609l = pVar;
                    this.f54610m = bVar2;
                    this.f54611n = heartSignalRepository;
                    this.f54612o = kVar;
                    this.f54613p = vVar;
                    this.f54614q = activityAggregateManager;
                    this.f54615r = noteRepository;
                    this.f54616s = new i(new int[]{1, 10, 10, 10, 10, 2, 10, 50, 5, 50, 5, 5, 30, 5}, this);
                    this.f54617t = h.b(new b(this));
                    return;
                }
                u.s("noteRepository");
                throw null;
            }
            u.s("signalSyncNotifier");
            throw null;
        }
        u.s("heartSignalRepository");
        throw null;
    }

    public static final void L(Hwa11SyncConversation hwa11SyncConversation, double d11) {
        hwa11SyncConversation.f54616s.b((float) d11);
    }

    private final VasistasSyncConversation M(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.BODY, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54603f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.i(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54619v = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    private final VasistasSyncConversation N(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.MOTION, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54603f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54618u = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    private final VasistasSyncConversation O(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.MOTION, 4, false, 504);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54603f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        return vasistasSyncConversation;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x03b0  */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() throws java.io.IOException, com.withings.comm.remote.conversation.ConversationException, com.withings.comm.remote.conversation.WaitForInput.CancelException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.hwa11.conversation.Hwa11SyncConversation.D():void");
    }

    @Override // zh0.j.a
    public final boolean b() {
        VasistasSyncConversation vasistasSyncConversation = this.f54618u;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // zh0.j.a
    public final boolean l() {
        VasistasSyncConversation vasistasSyncConversation = this.f54619v;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // xb0.i.a
    public final void m(float f11) {
        ((dj.t) this.f54617t.getValue()).onEvent(new m(x(), (int) (100 * f11)));
        k kVar = this.f54603f;
        if (kVar != null) {
            kVar.b(this, f11);
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.t.a
    public final void n(VasistasSyncConversation syncConversation, float f11) {
        u.j(syncConversation, "syncConversation");
        this.f54616s.b(f11);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
