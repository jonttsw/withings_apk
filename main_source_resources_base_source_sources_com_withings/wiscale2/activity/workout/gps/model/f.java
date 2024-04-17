package com.withings.wiscale2.activity.workout.gps.model;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ax.h;
import com.withings.liveworkout.model.LiveWorkout;
import com.withings.wiscale2.activity.workout.gps.model.g;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import u70.a;
/* compiled from: GpsTrackingServiceStarter.kt */
/* loaded from: classes4.dex */
public final class f implements h.a, a.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48752a;

    /* renamed from: b  reason: collision with root package name */
    private final ui.d f48753b;

    /* renamed from: c  reason: collision with root package name */
    private final u70.a f48754c;

    /* renamed from: d  reason: collision with root package name */
    private g f48755d;

    public f(Context context, ui.d dVar, u70.a aVar) {
        u.j(context, "context");
        this.f48752a = context;
        this.f48753b = dVar;
        this.f48754c = aVar;
        this.f48755d = g.a.f48756a;
        aVar.a(this);
    }

    private final void i() {
        g gVar = this.f48755d;
        if (gVar instanceof g.d) {
            this.f48753b.k(((g.d) gVar).a());
        } else if (u.e(gVar, g.b.f48757a)) {
            Context context = this.f48752a;
            context.stopService(new Intent(context, GpsTrackingService.class));
            this.f48755d = g.a.f48756a;
        } else if (!(gVar instanceof g.c)) {
            u.e(gVar, g.a.f48756a);
        }
        this.f48755d = g.a.f48756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(LiveWorkout liveWorkout) {
        g gVar;
        int i11 = GpsTrackingService.f48730l;
        Context context = this.f48752a;
        u.j(context, "context");
        u.j(liveWorkout, "liveWorkout");
        Intent putExtra = new Intent(context, GpsTrackingService.class).putExtra("extra_live_workout", liveWorkout);
        u.i(putExtra, "putExtra(...)");
        if (context.startService(putExtra) != null) {
            gVar = g.b.f48757a;
        } else {
            gVar = g.a.f48756a;
        }
        this.f48755d = gVar;
    }

    @Override // u70.a.c
    public final long H() {
        return 0L;
    }

    @Override // ax.h.a
    public final void c(LiveWorkout liveWorkout) {
        i();
        if (this.f48754c.d(0L) && Build.VERSION.SDK_INT >= 31) {
            this.f48755d = new g.c(liveWorkout);
            return;
        }
        ui.d dVar = this.f48753b;
        if (!dVar.h()) {
            g.d dVar2 = new g.d(new e(this, liveWorkout));
            dVar.j(dVar2.a());
            this.f48755d = dVar2;
            return;
        }
        j(liveWorkout);
    }

    @Override // ax.h.a
    public final void d(LiveWorkout liveWorkout, boolean z5) {
        i();
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        boolean z5;
        Context context = this.f48752a;
        Object systemService = context.getSystemService("activity");
        u.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE).iterator();
        while (true) {
            if (it.hasNext()) {
                if (u.e(GpsTrackingService.class.getName(), it.next().service.getClassName())) {
                    z5 = true;
                    break;
                }
            } else {
                z5 = false;
                break;
            }
        }
        h hVar = h.f19725i;
        if (hVar != null) {
            if (!hVar.g() && z5) {
                context.stopService(new Intent(context, GpsTrackingService.class));
                this.f48755d = g.a.f48756a;
            }
            g gVar = this.f48755d;
            if (gVar instanceof g.c) {
                ui.d dVar = this.f48753b;
                if (!dVar.h()) {
                    g.d dVar2 = new g.d(new e(this, ((g.c) gVar).a()));
                    dVar.j(dVar2.a());
                    this.f48755d = dVar2;
                    return;
                }
                j(((g.c) gVar).a());
                return;
            }
            return;
        }
        u.s("instance");
        throw null;
    }

    @Override // u70.a.c
    public final void Q2() {
    }

    @Override // ax.h.a
    public final void a(LiveWorkout liveWorkout) {
    }

    @Override // ax.h.a
    public final void e(LiveWorkout liveWorkout) {
    }
}
