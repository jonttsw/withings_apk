package com.withings.wiscale2.device.common.conversation;

import androidx.activity.b0;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WamVasistasGet;
import com.withings.location.domain.AndroidGpsDistanceComputer;
import com.withings.location.domain.uc.ComputeGpsDistance;
import com.withings.location.domain.uc.ComputeGpsSummary;
import com.withings.location.domain.uc.CountTotalGapDuration;
import com.withings.location.domain.uc.FilterGpsLocationWithPause;
import com.withings.location.domain.uc.GpsLocationFilter;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.device.common.conversation.SportVasistasSyncConversation;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import lj0.h0;
import nj.i;
import org.joda.time.DateTime;
import u70.h;
/* compiled from: SportVasistasSyncConversation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/SportVasistasSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lnj/i$e;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SportVasistasSyncConversation extends WppDeviceConversation implements i.e {

    /* renamed from: f  reason: collision with root package name */
    private final User f50759f;

    /* renamed from: g  reason: collision with root package name */
    private final WorkoutManager f50760g;

    /* renamed from: h  reason: collision with root package name */
    private final GpsLocationRepository f50761h;

    /* renamed from: i  reason: collision with root package name */
    private final j f50762i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f50763j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f50764k;

    /* renamed from: l  reason: collision with root package name */
    private final u70.h<a> f50765l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList f50766m;

    /* renamed from: n  reason: collision with root package name */
    private final ua0.a f50767n;

    /* compiled from: SportVasistasSyncConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void a(SportVasistasSyncConversation sportVasistasSyncConversation);

        void b(SportVasistasSyncConversation sportVasistasSyncConversation, qj.e eVar);

        void c(SportVasistasSyncConversation sportVasistasSyncConversation);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.withings.wiscale2.device.common.conversation.j, java.lang.Object] */
    public SportVasistasSyncConversation(User user) {
        WorkoutManager workoutManager = WorkoutManager.Companion.get();
        GpsLocationRepository gpsLocationRepository = GpsLocationRepository.Companion.get();
        h0 e11 = h0.e();
        kotlin.jvm.internal.u.i(e11, "get(...)");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(workoutManager, "workoutManager");
        kotlin.jvm.internal.u.j(gpsLocationRepository, "gpsLocationRepository");
        this.f50759f = user;
        this.f50760g = workoutManager;
        this.f50761h = gpsLocationRepository;
        this.f50762i = new Object();
        this.f50763j = nm0.h.b(new i(this));
        this.f50764k = nm0.h.b(new h(this));
        this.f50765l = new u70.h<>();
        this.f50766m = new ArrayList();
        AndroidGpsDistanceComputer androidGpsDistanceComputer = new AndroidGpsDistanceComputer();
        HasEnoughGpsLocations hasEnoughGpsLocations = new HasEnoughGpsLocations(new CountTotalGapDuration(androidGpsDistanceComputer));
        FilterGpsLocationWithPause filterGpsLocationWithPause = new FilterGpsLocationWithPause();
        this.f50767n = new ua0.a(gpsLocationRepository, e11, new ComputeGpsSummary(hasEnoughGpsLocations, new ComputeGpsDistance(androidGpsDistanceComputer, new GpsLocationFilter(androidGpsDistanceComputer), filterGpsLocationWithPause), filterGpsLocationWithPause));
    }

    public static final fl.o M(SportVasistasSyncConversation sportVasistasSyncConversation) {
        return (fl.o) sportVasistasSyncConversation.f50763j.getValue();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        DateTime dateTime;
        DateTime endDate;
        ArrayList arrayList = this.f50766m;
        u70.h<a> hVar = this.f50765l;
        try {
            Track lastTrackForUserAndAttrib = this.f50760g.getLastTrackForUserAndAttrib(this.f50759f.q(), 20000);
            if (lastTrackForUserAndAttrib != null && (endDate = lastTrackForUserAndAttrib.getEndDate()) != null) {
                dateTime = endDate.plusSeconds(1);
            } else {
                dateTime = null;
            }
            if (dateTime == null) {
                dateTime = new DateTime(0L);
            }
            WamVasistasGet utcStart = new WamVasistasGet().setUtcStart(b0.w(dateTime));
            hVar.f(new y.p(this, 6));
            new nj.i(x().k(), this).d(utcStart);
            if (!(true ^ arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                WorkoutSaver.INSTANCE.saveDeviceWorkouts(arrayList);
            }
            hVar.f(new z.e(this, 5));
        } catch (Throwable th2) {
            if (!(true ^ arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                WorkoutSaver.INSTANCE.saveDeviceWorkouts(arrayList);
            }
            hVar.f(new iq.a(this));
            throw th2;
        }
    }

    public final User N() {
        return this.f50759f;
    }

    public final void O(a listener) {
        kotlin.jvm.internal.u.j(listener, "listener");
        this.f50765l.b(listener);
    }

    @Override // nj.i.e
    public final void c(final qj.e sportVasistas) {
        kotlin.jvm.internal.u.j(sportVasistas, "sportVasistas");
        this.f50765l.f(new h.a() { // from class: xb0.j
            @Override // u70.h.a
            public final void e(Object obj) {
                SportVasistasSyncConversation this$0 = SportVasistasSyncConversation.this;
                u.j(this$0, "this$0");
                qj.e sportVasistas2 = sportVasistas;
                u.j(sportVasistas2, "$sportVasistas");
                ((SportVasistasSyncConversation.a) obj).b(this$0, sportVasistas2);
            }
        });
        this.f50762i.getClass();
        if (!sportVasistas.c().plusMillis(sportVasistas.b()).isAfterNow()) {
            if (sportVasistas.c().getMillis() == 0) {
                Fail.j("sportVasistas has a 0 timestamp");
            } else {
                this.f50766m.add(((g) this.f50764k.getValue()).a(sportVasistas));
            }
        }
    }
}
